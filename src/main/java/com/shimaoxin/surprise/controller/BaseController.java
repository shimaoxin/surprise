package com.shimaoxin.surprise.controller;

import com.shimaoxin.surprise.common.constant.SessionConstant;
import com.shimaoxin.surprise.model.user.User;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class BaseController {

    /**
     * 得到RequestAttributes
     * @author 石茂新 232601982@qq.com
     * @date 2018/2/6 11:05
     */
    public RequestAttributes getRequestAttributes() {
        RequestAttributes requestAttributes = RequestContextHolder.getRequestAttributes();

        return requestAttributes;
    }

    /**
     * 得到HttpServletRequest
     * @author 石茂新 232601982@qq.com
     * @date 2018/2/6 11:06
     */
    public HttpServletRequest getRequest() {
        if (getRequestAttributes() != null) {
            return ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        } else {
            return null;
        }
    }

    /**
     * 得到session
     * @author 石茂新 232601982@qq.com
     * @date 2018/2/6 11:07
     */
    public HttpSession getSession(boolean flag) {
        if (getRequest() == null) {
            return null;
        }
        return getRequest().getSession(flag);
    }

    /**
     * 得到session
     * @author 石茂新 232601982@qq.com
     * @date 2018/2/6 11:08
     */
    public HttpSession getSession() {
        return getSession(true);
    }

    /**
     * 得到当前用户
     * @author 石茂新 232601982@qq.com
     * @date 2018/2/6 11:15
     */
    public User getCurrentUser() {
        HttpSession session = getSession(true);
        if(null == session ){
            return null;
        }
        User user = (User) session.getAttribute(SessionConstant.CURRENT_USER);
        return user;
    }

    /**
     * 设置当前用户
     * @author 石茂新 232601982@qq.com
     * @date 2018/2/6 11:18
     */
    public void setCurrentUser(User user) {
        HttpSession session = getSession(true);
        if(session == null) return;
        session.setAttribute(SessionConstant.CURRENT_USER, user);
    }
}
