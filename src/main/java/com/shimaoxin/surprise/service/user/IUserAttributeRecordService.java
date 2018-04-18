package com.shimaoxin.surprise.service.user;

import com.shimaoxin.surprise.model.user.UserAttributeRecord;
import com.shimaoxin.surprise.model.user.UserAttributeRecordExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IUserAttributeRecordService {

    int countByExample(UserAttributeRecordExample example);

    int deleteByExample(UserAttributeRecordExample example);

    int deleteByPrimaryKey(String id);

    int insertSelective(UserAttributeRecord record);

    List<UserAttributeRecord> selectByExample(UserAttributeRecordExample example);

    UserAttributeRecord selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") UserAttributeRecord record, @Param("example") UserAttributeRecordExample example);

    int updateByPrimaryKeySelective(UserAttributeRecord record);

}
