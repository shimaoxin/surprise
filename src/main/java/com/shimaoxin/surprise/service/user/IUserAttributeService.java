package com.shimaoxin.surprise.service.user;

import com.shimaoxin.surprise.enums.user.UserAttributeName;
import com.shimaoxin.surprise.model.user.UserAttribute;
import com.shimaoxin.surprise.model.user.UserAttributeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IUserAttributeService {

    int countByExample(UserAttributeExample example);

    int deleteByExample(UserAttributeExample example);

    int deleteByPrimaryKey(String id);

    int insert(UserAttribute record);

    List<UserAttribute> selectByExample(UserAttributeExample example);

    UserAttribute selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") UserAttribute record, @Param("example") UserAttributeExample example);

    int updateByPrimaryKeySelective(UserAttribute record);

    /** 
     * 属性变化
     * @author 石茂新 232601982@qq.com    
     * @date 2018/4/12 10:04 
     */
    void changeAttrbute(String userId, String eventId, UserAttributeName attributeName, int value);

    /**
     * 通过用户名查找
     * @author 石茂新 232601982@qq.com    
     * @date 2018/4/16 15:50 
     */
    UserAttribute selectByUserId(String userId);

    int getValue(String userId, UserAttributeName attributeName);
}
