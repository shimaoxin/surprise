package com.shimaoxin.surprise.dao.user;

import com.shimaoxin.surprise.model.user.UserAttributeRecord;
import com.shimaoxin.surprise.model.user.UserAttributeRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserAttributeRecordMapper {
    int countByExample(UserAttributeRecordExample example);

    int deleteByExample(UserAttributeRecordExample example);

    int deleteByPrimaryKey(String id);

    int insert(UserAttributeRecord record);

    int insertSelective(UserAttributeRecord record);

    List<UserAttributeRecord> selectByExample(UserAttributeRecordExample example);

    UserAttributeRecord selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") UserAttributeRecord record, @Param("example") UserAttributeRecordExample example);

    int updateByExample(@Param("record") UserAttributeRecord record, @Param("example") UserAttributeRecordExample example);

    int updateByPrimaryKeySelective(UserAttributeRecord record);

    int updateByPrimaryKey(UserAttributeRecord record);
}