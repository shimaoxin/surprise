package com.shimaoxin.surprise.dao.meet;

import com.shimaoxin.surprise.model.meet.UserMeetQuery;

import java.util.List;

public interface UserMeetQueryMapper {

    /** 
     * 根据用户id查找
     * @author 石茂新 232601982@qq.com
     * @date 2018/4/24 15:08 
     */
    List<UserMeetQuery> queryByUserId(String userId);
}
