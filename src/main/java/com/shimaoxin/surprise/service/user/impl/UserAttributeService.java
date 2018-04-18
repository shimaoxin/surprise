package com.shimaoxin.surprise.service.user.impl;

import com.shimaoxin.surprise.dao.user.UserAttributeMapper;
import com.shimaoxin.surprise.enums.user.UserAttributeChangeType;
import com.shimaoxin.surprise.enums.user.UserAttributeName;
import com.shimaoxin.surprise.model.user.UserAttribute;
import com.shimaoxin.surprise.model.user.UserAttributeExample;
import com.shimaoxin.surprise.model.user.UserAttributeRecord;
import com.shimaoxin.surprise.service.user.IUserAttributeService;
import com.shimaoxin.surprise.util.UUIDUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class UserAttributeService implements IUserAttributeService{

    @Autowired
    private UserAttributeMapper userAttributeMapper;

    @Autowired
    private UserAttributeRecordService userAttributeRecordService;

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

    @Override
    public void changeAttrbute(String userId, String eventId, UserAttributeName attributeName, int value) {
        //得到属性对象
        UserAttribute attribute = selectByUserId(userId);
        int valueBefore = attribute.getIntegral();
        int valueAfter = 0;
        if(attributeName.equals(UserAttributeName.INTEGRAL)) {
            //积分
            attribute.setIntegral(attribute.getIntegral() + value);
            valueAfter = attribute.getIntegral();
        }
        this.updateByPrimaryKeySelective(attribute);
        //插入记录
        UserAttributeRecord record = new UserAttributeRecord();
        record.setId(UUIDUtil.generateUUID());
        UserAttributeChangeType type = 0 - value > 0 ? UserAttributeChangeType.REDUCE : UserAttributeChangeType.ADD;
        record.setChangetype(type.getValue());
        record.setAttributename(attributeName.getValue());
        record.setCreatedate(new Date());
        record.setUserid(userId);
        record.setValuebefore(valueBefore);
        record.setValueafter(valueAfter);
        record.setChangevalue(value);
        record.setEventid(eventId);
        userAttributeRecordService.insertSelective(record);
    }

    @Override
    public UserAttribute selectByUserId(String userId) {
        UserAttributeExample exa = new UserAttributeExample();
        UserAttributeExample.Criteria crit = exa.createCriteria();
        crit.andUseridEqualTo(userId);
        List<UserAttribute> attributeList = this.selectByExample(exa);
        if(attributeList != null && attributeList.size() > 0) {
            return attributeList.get(0);
        }
        UserAttribute attribute = new UserAttribute();
        attribute.setId(UUIDUtil.generateUUID());
        attribute.setUserid(userId);
        attribute.setBalance(0);
        attribute.setIntegral(0);
        attribute.setExp(0);
        attribute.setLevel(0);
        this.insert(attribute);
        return attribute;
    }

    @Override
    public int getValue(String userId, UserAttributeName attributeName) {
        UserAttribute attribute = selectByUserId(userId);
        if(attributeName.equals(UserAttributeName.INTEGRAL)) {
            return attribute.getIntegral();
        }
        return 0;
    }
}
