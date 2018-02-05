package com.shimaoxin.surprise.service.user.impl;

import com.shimaoxin.surprise.dao.user.UserVarMapper;
import com.shimaoxin.surprise.model.user.User;
import com.shimaoxin.surprise.model.user.UserExample;
import com.shimaoxin.surprise.model.user.UserVar;
import com.shimaoxin.surprise.model.user.UserVarExample;
import com.shimaoxin.surprise.service.user.IUserVarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class UserVarService implements IUserVarService{

    @Autowired
    private UserVarMapper userVarMapper;


    @Override
    public int countByExample(UserVarExample example) {
        return userVarMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(UserVarExample example) {
        return userVarMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(String id) {
        return userVarMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(UserVar record) {
        return userVarMapper.insert(record);
    }

    @Override
    public int insertSelective(UserVar record) {
        return userVarMapper.insertSelective(record);
    }

    @Override
    public List<UserVar> selectByExample(UserVarExample example) {
        return userVarMapper.selectByExample(example);
    }

    @Override
    public UserVar selectByPrimaryKey(String id) {
        return userVarMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(UserVar record, UserVarExample example) {
        return userVarMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(UserVar record, UserVarExample example) {
        return userVarMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(UserVar record) {
        return userVarMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(UserVar record) {
        return userVarMapper.updateByPrimaryKey(record);
    }

    /**
     * 增加变量
     * @param clientId
     * @param value
     * @author 石茂新 232601982@qq.com    
     * @date 2017年5月15日 下午2:45:36 
     */
    public void addVar(String clientId,String varName, int value) {
        UserVarExample exa = new UserVarExample();
        UserVarExample.Criteria crit = exa.createCriteria();
        crit.andVarnameEqualTo(varName);
        crit.andClientidEqualTo(clientId);
        List<UserVar> userVars = this.selectByExample(exa);
        Date now = new Date();
        if(userVars == null || userVars.size() == 0) {
            //增加
            UserVar userVar = new UserVar();
            userVar.setClientid(clientId);
            userVar.setVarname(varName);
            userVar.setVarvalue(value);
            userVar.setDayvalue(value);
            userVar.setWeekvalue(value);
            userVar.setMonthvalue(value);
            userVar.setYearvalue(value);
            userVar.setLasttime(now);
            this.insert(userVar);
        } else {
            //修改
            UserVar userVar = userVars.get(0);
            userVar.setVarvalue(userVar.getVarvalue() + value);
            //判断时间
            Calendar nowCal = Calendar.getInstance();
            nowCal.setFirstDayOfWeek(Calendar.MONDAY);
            nowCal.setTime(now);
            Calendar lastCal = Calendar.getInstance();
            lastCal.setFirstDayOfWeek(Calendar.MONDAY);
            nowCal.setTime(userVar.getLasttime());
            //每天变量
            if(nowCal.get(Calendar.DAY_OF_YEAR) == lastCal.get(Calendar.DAY_OF_YEAR)) {
                userVar.setDayvalue(userVar.getDayvalue() + value);
            } else {
                userVar.setDayvalue(value);
            }
            //每周变量
            if(nowCal.get(Calendar.WEEK_OF_YEAR) == lastCal.get(Calendar.WEEK_OF_YEAR)) {
                userVar.setWeekvalue(userVar.getWeekvalue() + value);
            } else {
                userVar.setWeekvalue(value);
            }
            //每月变量
            if(nowCal.get(Calendar.MONTH) == lastCal.get(Calendar.MONTH)) {
                userVar.setMonthvalue(userVar.getMonthvalue() + value);
            } else {
                userVar.setMonthvalue(value);
            }
            //每年变量
            if(nowCal.get(Calendar.YEAR) == lastCal.get(Calendar.YEAR)) {
                userVar.setYearvalue(userVar.getYearvalue() + value);
            } else {
                userVar.setYearvalue(value);
            }
            userVar.setLasttime(now);
            this.updateByPrimaryKeySelective(userVar);
        }
    }



    /**
     * 得到用户变量
     * @param clientId
     * @param varName
     * @return
     * @author 石茂新 232601982@qq.com
     */
    public UserVar getUserVar(String clientId, String varName) {
        UserVarExample exa = new UserVarExample();
        UserVarExample.Criteria crit = exa.createCriteria();
        crit.andVarnameEqualTo(varName);
        crit.andClientidEqualTo(clientId);
        List<UserVar> userVars = this.selectByExample(exa);
        if(userVars == null || userVars.size() == 0) return null;
        //判断时间
        UserVar userVar = userVars.get(0);
        Date now = new Date();
        Calendar nowCal = Calendar.getInstance();
        nowCal.setFirstDayOfWeek(Calendar.MONDAY);
        nowCal.setTime(now);
        Calendar lastCal = Calendar.getInstance();
        lastCal.setFirstDayOfWeek(Calendar.MONDAY);
        nowCal.setTime(userVar.getLasttime());
        boolean needUpdate = false;
        //每天变量
        if(nowCal.get(Calendar.DAY_OF_YEAR) != lastCal.get(Calendar.DAY_OF_YEAR)) {
            userVar.setDayvalue(0);
            needUpdate = true;
        }
        //每周变量
        if(nowCal.get(Calendar.WEEK_OF_YEAR) != lastCal.get(Calendar.WEEK_OF_YEAR)) {
            userVar.setWeekvalue(0);
            needUpdate = true;
        }
        //每月变量
        if(nowCal.get(Calendar.MONTH) != lastCal.get(Calendar.MONTH)) {
            userVar.setMonthvalue(0);
            needUpdate = true;
        }
        //每年变量
        if(nowCal.get(Calendar.YEAR) != lastCal.get(Calendar.YEAR)) {
            userVar.setYearvalue(0);
            needUpdate = true;
        }
        if(needUpdate) {
            userVar.setLasttime(now);
            this.updateByPrimaryKeySelective(userVar);
        }
        return userVar;
    }

    /**
     * 得到变量
     * @param clientId
     * @param varName
     * @return
     * @author 石茂新 232601982@qq.com
     * @date 2017年5月15日 下午3:33:25
     */
    public int getVarValue(String clientId, String varName) {
        UserVar userVar = getUserVar(clientId, varName);
        if(userVar == null) return 0;
        return userVar.getVarvalue();
    }

    /**
     * 得到每日变量
     * @param clientId
     * @param varName
     * @return
     * @author 石茂新 232601982@qq.com    
     * @date 2017年5月15日 下午4:05:15 
     */
    public int getDayVar(String clientId, String varName) {
        UserVar userVar = getUserVar(clientId, varName);
        if(userVar == null) return 0;
        return userVar.getDayvalue();
    }

    /**
     * 得到每周变量
     * @param clientId
     * @param varName
     * @return
     * @author 石茂新 232601982@qq.com    
     * @date 2017年5月15日 下午3:49:00 
     */
    public int getWeekVar(String clientId, String varName) {
        UserVar userVar = getUserVar(clientId, varName);
        if(userVar == null) return 0;
        return userVar.getWeekvalue();
    }

    /**
     * 得到每月变量
     * @param clientId
     * @param varName
     * @author 石茂新 232601982@qq.com
     * @date 2017年5月15日 下午4:08:34 
     */
    public int getMonthVar(String clientId, String varName) {
        UserVar userVar = getUserVar(clientId, varName);
        if(userVar == null) return 0;
        return userVar.getMonthvalue();
    }

    /**
     * 得到每年变量
     * @param clientId
     * @param varName
     * @return
     * @author 石茂新 232601982@qq.com    
     * @date 2017年5月15日 下午4:08:45 
     */
    public int getYearVar(String clientId, String varName) {
        UserVar userVar = getUserVar(clientId, varName);
        if(userVar == null) return 0;
        return userVar.getYearvalue();
    }
}
