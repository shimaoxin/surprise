package com.shimaoxin.surprise.service.user.impl;

import com.shimaoxin.surprise.dao.user.UserEventRecordMapper;
import com.shimaoxin.surprise.model.user.UserEventRecord;
import com.shimaoxin.surprise.model.user.UserEventRecordExample;
import com.shimaoxin.surprise.service.user.IUserEventRecordService;
import com.shimaoxin.surprise.util.UUIDUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class UserEventRecordService implements IUserEventRecordService{

    @Autowired
    private UserEventRecordMapper userEventRecordMapper;

    @Override
    public int countByExample(UserEventRecordExample example) {
        return userEventRecordMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(UserEventRecordExample example) {
        return userEventRecordMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(String id) {
        return userEventRecordMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(UserEventRecord record) {
        return userEventRecordMapper.insertSelective(record);
    }

    @Override
    public List<UserEventRecord> selectByExample(UserEventRecordExample example) {
        return userEventRecordMapper.selectByExample(example);
    }

    @Override
    public UserEventRecord selectByPrimaryKey(String id) {
        return userEventRecordMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(UserEventRecord record, UserEventRecordExample example) {
        return userEventRecordMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(UserEventRecord record) {
        return userEventRecordMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public UserEventRecord insert(String type, String userId, String remark) {
        UserEventRecord record = new UserEventRecord();
        record.setId(UUIDUtil.generateUUID());
        record.setType(type);
        record.setUserid(userId);
        record.setRemark(remark);
        record.setCreatetime(new Date());
        this.insertSelective(record);
        return record;
    }

    @Override
    public UserEventRecord insert(String type, String userId) {
        return this.insert(type, userId, null);
    }
}
