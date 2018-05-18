package com.shimaoxin.surprise.common.model;

public class ResultData {

    private int code;

    private String msg;

    private Object data;

    public static final int SUCCESS_CODE = 0;

    /**
     * 失败
     */
    public static final int FAIL_CODE = -1;

    /**
     * 未登录
     */
    public static final int NEED_LOGIN = -2;


    public static final String SUCCESS_MSG = "成功";


    public ResultData() {
        this.code = SUCCESS_CODE;
        this.msg = SUCCESS_MSG;
    }

    public ResultData(Object data) {
        this.code = SUCCESS_CODE;
        this.msg = SUCCESS_MSG;
        this.data = data;
    }

    public ResultData(String msg) {
        this.code = FAIL_CODE;
        this.msg = msg;
    }

    public ResultData(int code) {
        this.code = code;
    }

    public ResultData(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public ResultData(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
