package com.shimaoxin.surprise.controller.user;

import com.shimaoxin.surprise.common.constant.EventType;
import com.shimaoxin.surprise.controller.BaseController;
import com.shimaoxin.surprise.model.user.User;
import com.shimaoxin.surprise.model.user.UserExample;
import com.shimaoxin.surprise.service.meet.IMeetRecordService;
import com.shimaoxin.surprise.service.meet.IUserMeetService;
import com.shimaoxin.surprise.service.user.IUserAttributeService;
import com.shimaoxin.surprise.service.user.IUserEventRecordService;
import com.shimaoxin.surprise.service.user.IUserService;
import com.shimaoxin.surprise.util.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

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


    @RequestMapping("/showUser")
    public String showUser(ModelMap model) {
        User user = this.getCurrentUser();
        model.put("user", user);
        return "index";
    }

    @RequestMapping("/login")
    @ResponseBody
    public boolean login(HttpSession session, String loginName, String password) {
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


}
