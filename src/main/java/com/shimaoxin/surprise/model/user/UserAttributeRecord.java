package com.shimaoxin.surprise.model.user;

import java.util.Date;

public class UserAttributeRecord {
    private String id;

    private String userid;

    private String eventid;

    private String attributename;

    private Integer changevalue;

    private Integer valuebefore;

    private Integer valueafter;

    private String changetype;

    private String remark;

    private Date createdate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getEventid() {
        return eventid;
    }

    public void setEventid(String eventid) {
        this.eventid = eventid == null ? null : eventid.trim();
    }

    public String getAttributename() {
        return attributename;
    }

    public void setAttributename(String attributename) {
        this.attributename = attributename == null ? null : attributename.trim();
    }

    public Integer getChangevalue() {
        return changevalue;
    }

    public void setChangevalue(Integer changevalue) {
        this.changevalue = changevalue;
    }

    public Integer getValuebefore() {
        return valuebefore;
    }

    public void setValuebefore(Integer valuebefore) {
        this.valuebefore = valuebefore;
    }

    public Integer getValueafter() {
        return valueafter;
    }

    public void setValueafter(Integer valueafter) {
        this.valueafter = valueafter;
    }

    public String getChangetype() {
        return changetype;
    }

    public void setChangetype(String changetype) {
        this.changetype = changetype == null ? null : changetype.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }
}