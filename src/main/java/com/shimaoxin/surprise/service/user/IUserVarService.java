package com.shimaoxin.surprise.service.user;

import com.shimaoxin.surprise.model.user.UserVar;
import com.shimaoxin.surprise.model.user.UserVarExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IUserVarService {

    int countByExample(UserVarExample example);

    int deleteByExample(UserVarExample example);

    int deleteByPrimaryKey(String id);

    int insert(UserVar record);

    int insertSelective(UserVar record);

    List<UserVar> selectByExample(UserVarExample example);

    UserVar selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") UserVar record, @Param("example") UserVarExample example);

    int updateByExample(@Param("record") UserVar record, @Param("example") UserVarExample example);

    int updateByPrimaryKeySelective(UserVar record);

    int updateByPrimaryKey(UserVar record);
}
