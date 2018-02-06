package com.shimaoxin.surprise.service.meet;

import com.shimaoxin.surprise.model.meet.UserMeet;
import com.shimaoxin.surprise.model.meet.UserMeetExample;
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
}
