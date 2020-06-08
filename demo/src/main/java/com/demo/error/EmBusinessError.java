package com.demo.error;

public enum EmBusinessError implements CommonError {
    //10000 general error
    PARAMETER_VALIDATION_ERROR(10001, "params invalid"),
    UNKNOWN_ERROR(10002, "unknown error"),

    //20000 user info error
    USER_NOT_EXIST(20001, "user not exist"),
    USER_LOGIN_FAIL(20002, "user telephone not exists or wrong password"),
    USER_NOT_LOGIN(20003, "user not login"),

    //30000 stock info error
    STOCK_NOT_ENOUGH(30001, "stock not enough")
    ;

    private EmBusinessError(int errCode, String errMsg) {
        this.errCode = errCode;
        this.errMsg = errMsg;
    }

    private int errCode;
    private String errMsg;

    @Override
    public int getErrCode() {
        return this.errCode;
    }

    @Override
    public String getErrMsg() {
        return this.errMsg;
    }

    @Override
    public CommonError setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
}
