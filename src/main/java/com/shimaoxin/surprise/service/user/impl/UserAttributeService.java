package com.shimaoxin.surprise.service.user.impl;

import com.shimaoxin.surprise.dao.user.UserAttributeMapper;
import com.shimaoxin.surprise.model.user.UserAttribute;
import com.shimaoxin.surprise.model.user.UserAttributeExample;
import com.shimaoxin.surprise.service.user.IUserAttributeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserAttributeService implements IUserAttributeService{

    @Autowired
    private UserAttributeMapper userAttributeMapper;

    @Override
    public int countByExample(UserAttributeExample example) {
        return userAttributeMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(UserAttributeExample example) {
        return userAttributeMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(String id) {
        return userAttributeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(UserAttribute record) {
        return userAttributeMapper.insert(record);
    }

    @Override
    public List<UserAttribute> selectByExample(UserAttributeExample example) {
        return userAttributeMapper.selectByExample(example);
    }

    @Override
    public UserAttribute selectByPrimaryKey(String id) {
        return userAttributeMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(UserAttribute record, UserAttributeExample example) {
        return userAttributeMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(UserAttribute record) {
        return userAttributeMapper.updateByPrimaryKeySelective(record);
    }
}
