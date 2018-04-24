package com.shimaoxin.surprise.service.meet.impl;

import com.shimaoxin.surprise.dao.meet.UserMeetMapper;
import com.shimaoxin.surprise.dao.meet.UserMeetQueryMapper;
import com.shimaoxin.surprise.model.meet.UserMeet;
import com.shimaoxin.surprise.model.meet.UserMeetExample;
import com.shimaoxin.surprise.model.meet.UserMeetQuery;
import com.shimaoxin.surprise.service.meet.IUserMeetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserMeetService implements IUserMeetService{

    @Autowired
    private UserMeetMapper userMeetMapper;

    @Autowired
    private UserMeetQueryMapper userMeetQueryMapper;

    @Override
    public int countByExample(UserMeetExample example) {
        return userMeetMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(UserMeetExample example) {
        return userMeetMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(String id) {
        return userMeetMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(UserMeet record) {
        return userMeetMapper.insert(record);
    }

    @Override
    public List<UserMeet> selectByExample(UserMeetExample example) {
        return userMeetMapper.selectByExample(example);
    }

    @Override
    public UserMeet selectByPrimaryKey(String id) {
        return userMeetMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(UserMeet record, UserMeetExample example) {
        return userMeetMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(UserMeet record) {
        return userMeetMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public List<UserMeetQuery> queryByUserId(String userId) {
        return userMeetQueryMapper.queryByUserId(userId);
    }
}
