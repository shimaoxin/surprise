package com.shimaoxin.surprise.dao.user;

import com.shimaoxin.surprise.model.user.UserAttribute;
import com.shimaoxin.surprise.model.user.UserAttributeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserAttributeMapper {
    int countByExample(UserAttributeExample example);

    int deleteByExample(UserAttributeExample example);

    int deleteByPrimaryKey(String id);

    int insert(UserAttribute record);

    int insertSelective(UserAttribute record);

    List<UserAttribute> selectByExample(UserAttributeExample example);

    UserAttribute selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") UserAttribute record, @Param("example") UserAttributeExample example);

    int updateByExample(@Param("record") UserAttribute record, @Param("example") UserAttributeExample example);

    int updateByPrimaryKeySelective(UserAttribute record);

    int updateByPrimaryKey(UserAttribute record);
}