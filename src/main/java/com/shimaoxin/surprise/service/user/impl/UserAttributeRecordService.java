package com.shimaoxin.surprise.service.user.impl;

import com.shimaoxin.surprise.dao.user.UserAttributeMapper;
import com.shimaoxin.surprise.dao.user.UserAttributeRecordMapper;
import com.shimaoxin.surprise.model.user.UserAttributeRecord;
import com.shimaoxin.surprise.model.user.UserAttributeRecordExample;
import com.shimaoxin.surprise.service.user.IUserAttributeRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserAttributeRecordService implements IUserAttributeRecordService{

    @Autowired
    private UserAttributeRecordMapper UserAttributeRecordMapper;

    @Override
    public int countByExample(UserAttributeRecordExample example) {
        return UserAttributeRecordMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(UserAttributeRecordExample example) {
        return UserAttributeRecordMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(String id) {
        return UserAttributeRecordMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(UserAttributeRecord record) {
        return UserAttributeRecordMapper.insertSelective(record);
    }

    @Override
    public List<UserAttributeRecord> selectByExample(UserAttributeRecordExample example) {
        return UserAttributeRecordMapper.selectByExample(example);
    }

    @Override
    public UserAttributeRecord selectByPrimaryKey(String id) {
        return UserAttributeRecordMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(UserAttributeRecord record, UserAttributeRecordExample example) {
        return UserAttributeRecordMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(UserAttributeRecord record) {
        return UserAttributeRecordMapper.updateByPrimaryKeySelective(record);
    }
}
