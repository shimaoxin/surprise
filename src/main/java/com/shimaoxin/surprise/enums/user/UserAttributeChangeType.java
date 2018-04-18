package com.shimaoxin.surprise.enums.user;

public enum UserAttributeChangeType {
    ADD("ADD", "增加"),

    REDUCE("REDUCE", "减少"),

    ;


    private String value;

    private String name;

    private UserAttributeChangeType(String value, String name) {
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
