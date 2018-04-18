package com.shimaoxin.surprise.enums.user;

public enum UserAttributeName {

    INTEGRAL("INTEGRAL", "积分"),

    ;


    private String value;

    private String name;

    private UserAttributeName(String value, String name) {
        this.value = value;
        this.name = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
