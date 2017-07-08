package com.qtdbp.bossclient.base;

/**
 * 账户类型
 * Created by dell on 2017/7/7.
 */
public enum AccountType {

    GENERAL("0001","一般消费户");

    private final String name;
    private final String code;

    AccountType(String code, String name) {
        this.code = code ;
        this.name = name ;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }
}
