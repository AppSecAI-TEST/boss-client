package com.qtdbp.bossclient.base;

/**
 * 支付类型
 * Created by dell on 2017/7/7.
 */
public enum PayType {

    E_CURRENCY("0001","网银支付"),
    REAL_TIME_COLLECTION("1001","实时代收"),
    REAL_TIME_PAYMENT("2001","实时代付"),
    BATCH_COLLECTION("1002","批量代收"),
    BATCH_PAYMENT("2002","批量代付");

    private final String code;
    private final String name;

    PayType(String code, String name) {
        this.code = code ;
        this.name = name ;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }
}
