package com.shimaoxin.surprise.service.meet;

import com.shimaoxin.surprise.model.meet.MeetRecord;
import com.shimaoxin.surprise.model.meet.MeetRecordExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IMeetRecordService {

    int countByExample(MeetRecordExample example);

    int deleteByExample(MeetRecordExample example);

    int deleteByPrimaryKey(String id);

    int insert(MeetRecord record);

    int insertSelective(MeetRecord record);

    List<MeetRecord> selectByExample(MeetRecordExample example);

    MeetRecord selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") MeetRecord record, @Param("example") MeetRecordExample example);

    int updateByExample(@Param("record") MeetRecord record, @Param("example") MeetRecordExample example);

    int updateByPrimaryKeySelective(MeetRecord record);

    int updateByPrimaryKey(MeetRecord record);
}
