package com.shimaoxin.surprise.service.user;

import com.shimaoxin.surprise.model.user.UserAttribute;
import com.shimaoxin.surprise.model.user.UserAttributeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IUserAttributeService {

    int countByExample(UserAttributeExample example);

    int deleteByExample(UserAttributeExample example);

    int deleteByPrimaryKey(String id);

    int insert(UserAttribute record);

    List<UserAttribute> selectByExample(UserAttributeExample example);

    UserAttribute selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") UserAttribute record, @Param("example") UserAttributeExample example);

    int updateByPrimaryKeySelective(UserAttribute record);

}
