package com.shimaoxin.surprise.controller.user;

import com.shimaoxin.surprise.controller.BaseController;
import com.shimaoxin.surprise.model.user.User;
import com.shimaoxin.surprise.model.user.UserExample;
import com.shimaoxin.surprise.service.meet.IMeetRecordService;
import com.shimaoxin.surprise.service.meet.IUserMeetService;
import com.shimaoxin.surprise.service.user.IUserAttributeService;
import com.shimaoxin.surprise.service.user.IUserService;
import com.shimaoxin.surprise.util.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

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


    @RequestMapping("/showUser")
    @ResponseBody
    public ModelAndView showUser(ModelAndView mav) {
        mav.setViewName("index");
        User user = this.getCurrentUser();
        mav.addObject("user", user);
        return mav;
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
        return true;
    }


}
