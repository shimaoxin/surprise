package com.shimaoxin.surprise.service.meet;

import com.shimaoxin.surprise.model.meet.UserMeet;
import com.shimaoxin.surprise.model.meet.UserMeetExample;
import com.shimaoxin.surprise.model.meet.UserMeetQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IUserMeetService {

    int countByExample(UserMeetExample example);

    int deleteByExample(UserMeetExample example);

    int deleteByPrimaryKey(String id);

    int insert(UserMeet record);

    List<UserMeet> selectByExample(UserMeetExample example);

    UserMeet selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") UserMeet record, @Param("example") UserMeetExample example);

    int updateByPrimaryKeySelective(UserMeet record);

    /** 
     * 通过userid查找日志
     * @author 石茂新 232601982@qq.com    
     * @date 2018/4/24 15:28 
     */
    List<UserMeetQuery> queryByUserId(String userId);
}
