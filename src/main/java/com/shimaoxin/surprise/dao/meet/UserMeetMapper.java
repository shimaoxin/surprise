package com.shimaoxin.surprise.dao.meet;

import com.shimaoxin.surprise.model.meet.UserMeet;
import com.shimaoxin.surprise.model.meet.UserMeetExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserMeetMapper {
    int countByExample(UserMeetExample example);

    int deleteByExample(UserMeetExample example);

    int deleteByPrimaryKey(String id);

    int insert(UserMeet record);

    int insertSelective(UserMeet record);

    List<UserMeet> selectByExample(UserMeetExample example);

    UserMeet selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") UserMeet record, @Param("example") UserMeetExample example);

    int updateByExample(@Param("record") UserMeet record, @Param("example") UserMeetExample example);

    int updateByPrimaryKeySelective(UserMeet record);

    int updateByPrimaryKey(UserMeet record);
}