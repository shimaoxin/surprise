package com.shimaoxin.surprise.model.user;

import java.util.Date;

public class UserVar {
    private String id;

    private String clientid;

    private String varname;

    private Integer varvalue;

    private Integer dayvalue;

    private Integer weekvalue;

    private Integer monthvalue;

    private Integer yearvalue;

    private Date lasttime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getClientid() {
        return clientid;
    }

    public void setClientid(String clientid) {
        this.clientid = clientid == null ? null : clientid.trim();
    }

    public String getVarname() {
        return varname;
    }

    public void setVarname(String varname) {
        this.varname = varname == null ? null : varname.trim();
    }

    public Integer getVarvalue() {
        return varvalue;
    }

    public void setVarvalue(Integer varvalue) {
        this.varvalue = varvalue;
    }

    public Integer getDayvalue() {
        return dayvalue;
    }

    public void setDayvalue(Integer dayvalue) {
        this.dayvalue = dayvalue;
    }

    public Integer getWeekvalue() {
        return weekvalue;
    }

    public void setWeekvalue(Integer weekvalue) {
        this.weekvalue = weekvalue;
    }

    public Integer getMonthvalue() {
        return monthvalue;
    }

    public void setMonthvalue(Integer monthvalue) {
        this.monthvalue = monthvalue;
    }

    public Integer getYearvalue() {
        return yearvalue;
    }

    public void setYearvalue(Integer yearvalue) {
        this.yearvalue = yearvalue;
    }

    public Date getLasttime() {
        return lasttime;
    }

    public void setLasttime(Date lasttime) {
        this.lasttime = lasttime;
    }
}