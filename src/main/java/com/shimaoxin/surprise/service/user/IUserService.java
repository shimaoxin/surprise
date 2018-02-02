package com.shimaoxin.surprise.service.user;

import com.shimaoxin.surprise.model.user.User;
import com.shimaoxin.surprise.model.user.UserExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IUserService {

    int countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(String id);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);
}
