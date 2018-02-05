package com.shimaoxin.surprise.model.meet;

import java.util.Date;

public class UserMeet {
    private String id;

    private String meetid;

    private String userid;

    private Date createdate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getMeetid() {
        return meetid;
    }

    public void setMeetid(String meetid) {
        this.meetid = meetid == null ? null : meetid.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }
}