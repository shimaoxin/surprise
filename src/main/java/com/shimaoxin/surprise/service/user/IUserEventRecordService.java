package com.shimaoxin.surprise.service.user;

import com.shimaoxin.surprise.model.user.UserEventRecord;
import com.shimaoxin.surprise.model.user.UserEventRecordExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IUserEventRecordService {

    int countByExample(UserEventRecordExample example);

    int deleteByExample(UserEventRecordExample example);

    int deleteByPrimaryKey(String id);

    int insertSelective(UserEventRecord record);

    List<UserEventRecord> selectByExample(UserEventRecordExample example);

    UserEventRecord selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") UserEventRecord record, @Param("example") UserEventRecordExample example);

    int updateByPrimaryKeySelective(UserEventRecord record);

    /** 
     * 插入
     * @author 石茂新 232601982@qq.com    
     * @date 2018/2/12 12:08
     */
    UserEventRecord insert(String type, String userId, String remark);
    
    /** 
     * 插入
     * @author 石茂新 232601982@qq.com    
     * @date 2018/2/12 12:09
     */
    UserEventRecord insert(String type, String userId);

}
