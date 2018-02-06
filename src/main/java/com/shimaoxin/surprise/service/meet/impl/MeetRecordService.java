package com.shimaoxin.surprise.service.meet.impl;

import com.shimaoxin.surprise.dao.meet.MeetRecordMapper;
import com.shimaoxin.surprise.model.meet.MeetRecord;
import com.shimaoxin.surprise.model.meet.MeetRecordExample;
import com.shimaoxin.surprise.service.meet.IMeetRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MeetRecordService implements IMeetRecordService{

    @Autowired
    private MeetRecordMapper meetRecordMapper;

    @Override
    public int countByExample(MeetRecordExample example) {
        return meetRecordMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(MeetRecordExample example) {
        return meetRecordMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(String id) {
        return meetRecordMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(MeetRecord record) {
        return meetRecordMapper.insert(record);
    }

    @Override
    public int insertSelective(MeetRecord record) {
        return meetRecordMapper.insertSelective(record);
    }

    @Override
    public List<MeetRecord> selectByExample(MeetRecordExample example) {
        return meetRecordMapper.selectByExample(example);
    }

    @Override
    public MeetRecord selectByPrimaryKey(String id) {
        return meetRecordMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(MeetRecord record, MeetRecordExample example) {
        return meetRecordMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(MeetRecord record, MeetRecordExample example) {
        return updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(MeetRecord record) {
        return meetRecordMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(MeetRecord record) {
        return meetRecordMapper.updateByPrimaryKey(record);
    }
}
