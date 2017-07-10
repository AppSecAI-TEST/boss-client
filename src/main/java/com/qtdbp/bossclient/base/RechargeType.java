package com.qtdbp.bossclient.base;

/**
 * 充值类型
 * Created by dell on 2017/7/10.
 */
public enum RechargeType {

    remittance("1", "汇款"),
    ONLINE_BANK("2", "网银"),
    ACCOUNT_CHECK("3","账户验证");

    private final String name;
    private final String code;

    RechargeType(String code, String name) {
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
