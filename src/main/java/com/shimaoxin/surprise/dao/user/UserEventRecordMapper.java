package com.shimaoxin.surprise.dao.user;

import com.shimaoxin.surprise.model.user.UserEventRecord;
import com.shimaoxin.surprise.model.user.UserEventRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserEventRecordMapper {
    int countByExample(UserEventRecordExample example);

    int deleteByExample(UserEventRecordExample example);

    int deleteByPrimaryKey(String id);

    int insert(UserEventRecord record);

    int insertSelective(UserEventRecord record);

    List<UserEventRecord> selectByExample(UserEventRecordExample example);

    UserEventRecord selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") UserEventRecord record, @Param("example") UserEventRecordExample example);

    int updateByExample(@Param("record") UserEventRecord record, @Param("example") UserEventRecordExample example);

    int updateByPrimaryKeySelective(UserEventRecord record);

    int updateByPrimaryKey(UserEventRecord record);
}