package com.shimaoxin.surprise.model.meet;

import java.util.Date;

public class UserMeetQuery extends UserMeet {

    private String userName;

    private String title;

    private Integer serial;

    private String content;

    private Date meetdate;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getSerial() {
        return serial;
    }

    public void setSerial(Integer serial) {
        this.serial = serial;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getMeetdate() {
        return meetdate;
    }

    public void setMeetdate(Date meetdate) {
        this.meetdate = meetdate;
    }
}
