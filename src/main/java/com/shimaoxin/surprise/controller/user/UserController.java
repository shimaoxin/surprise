package com.shimaoxin.surprise.controller.user;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.shimaoxin.surprise.common.constant.EventType;
import com.shimaoxin.surprise.controller.BaseController;
import com.shimaoxin.surprise.enums.user.UserAttributeName;
import com.shimaoxin.surprise.model.meet.*;
import com.shimaoxin.surprise.model.user.User;
import com.shimaoxin.surprise.model.user.UserEventRecord;
import com.shimaoxin.surprise.model.user.UserExample;
import com.shimaoxin.surprise.service.meet.IMeetRecordService;
import com.shimaoxin.surprise.service.meet.IUserMeetService;
import com.shimaoxin.surprise.service.user.IUserAttributeService;
import com.shimaoxin.surprise.service.user.IUserEventRecordService;
import com.shimaoxin.surprise.service.user.IUserService;
import com.shimaoxin.surprise.util.MD5Util;
import com.shimaoxin.surprise.util.UUIDUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

@Controller
@RequestMapping("/user")
public class UserController extends BaseController{

    @Autowired
    private IUserService userService;

    @Autowired
    private IMeetRecordService meetRecordService;

    @Autowired
    private IUserMeetService userMeetService;

    @Autowired
    private IUserAttributeService attributeSerive;

    @Autowired
    private IUserEventRecordService eventRecordService;

    @Value("${surpise.needIntegral}")
    private int needIntegral;


    @RequestMapping("/showUser")
    public String showUser(ModelMap model) {
        User user = this.getCurrentUser();
        model.put("user", user);
        return "index";
    }

    @RequestMapping("/login")
    @ResponseBody
    public boolean login(String loginName, String password) {
        //查找数据库
        UserExample exa = new UserExample();
        UserExample.Criteria cirt = exa.createCriteria();
        cirt.andLoginnameEqualTo(loginName);
        cirt.andPasswordEqualTo(MD5Util.MD5(password));
        List<User> users = userService.selectByExample(exa);
        if(users == null || users.size() == 0)  return false;
        User user = users.get(0);
        this.setCurrentUser(user);
        //记录事件
        eventRecordService.insert(EventType.LOGIN, user.getId());
        return true;
    }

    @RequestMapping("/toLogin")
    public String toLogin(ModelMap model) {
        return "/login";
    }

    @RequestMapping("/toIndex")
    public String toIndex(ModelMap model) {
        return "/index";
    }

    /**
     * 获取惊喜
     * @author 石茂新 232601982@qq.com    
     * @date 2018/4/17 14:13
     */
    @RequestMapping("/getSurprise")
    @ResponseBody
    @Transactional
    public boolean getSurprise(HttpServletResponse response) throws IOException {
        //判断积分
        User user = this.getCurrentUser();
        if(user == null) return false;
        int integral = attributeSerive.getValue(user.getId(), UserAttributeName.INTEGRAL);
        if(integral < needIntegral) return false;
        //得到用户已经得到日志
        UserMeetExample userMeetExample = new UserMeetExample();
        UserMeetExample.Criteria userMeetCrit = userMeetExample.createCriteria();
        userMeetCrit.andUseridEqualTo(user.getId());
        List<UserMeet> userMeets = userMeetService.selectByExample(userMeetExample);
        List<String> meetRecordIds = new ArrayList<>();
        for(UserMeet userMeet : userMeets) {
            meetRecordIds.add(userMeet.getMeetid());
        }
        //得到没有获取的日志记录
        MeetRecordExample meetRecordExample = new MeetRecordExample();
        MeetRecordExample.Criteria meetCrit = meetRecordExample.createCriteria();
        if(meetRecordIds.size() > 0) meetCrit.andIdNotIn(meetRecordIds);
        List<MeetRecord> meetRecords = meetRecordService.selectByExample(meetRecordExample);
        if(meetRecords == null || meetRecords.size() == 0) return false;
        //随机得到日志
        Random random = new Random();
        int index = random.nextInt(meetRecords.size() -1);
        MeetRecord meetRecord = meetRecords.get(index);
        //插入见面日志
        UserMeet userMeet = new UserMeet();
        userMeet.setId(UUIDUtil.generateUUID());
        userMeet.setUserid(user.getId());
        userMeet.setMeetid(meetRecord.getId());
        userMeetService.insert(userMeet);
        //插入事件
        String eventId = UUIDUtil.generateUUID();
        UserEventRecord userEventRecord = new UserEventRecord();
        userEventRecord.setId(eventId);
        userEventRecord.setUserid(user.getId());
        userEventRecord.setType(EventType.SURPRISE);
        userEventRecord.setCreatetime(new Date());
        eventRecordService.insertSelective(userEventRecord);
        //扣除积分
        attributeSerive.changeAttrbute(user.getId(), eventId, UserAttributeName.INTEGRAL, -needIntegral);
        return true;
    }

    /**
     * 跳转到日志列表
     * @author 石茂新 232601982@qq.com
     * @date 2018/4/24 17:08
     */
    @RequestMapping("/toMeetList")
    public String toMeetList(ModelMap model){
        User user = this.getCurrentUser();
        if(user == null) return toLogin(model);
        List<UserMeetQuery> list = userMeetService.queryByUserId(user.getId());
        model.put("meets", list);
        return "/meets";
    }

    /** 
     * 得到见面日志
     * @author 石茂新 232601982@qq.com    
     * @date 2018/4/24 16:26 
     */
    @RequestMapping("/http://120.79.90.216/user/toLogin")
    @ResponseBody
    public PageInfo<UserMeetQuery> getUserMeetList(int page, int pageSize) {
        User user = this.getCurrentUser();
        if(user == null) return null;
        PageHelper.startPage(page, pageSize);
        List<UserMeetQuery> list = userMeetService.queryByUserId(user.getId());
        PageInfo<UserMeetQuery> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

}
