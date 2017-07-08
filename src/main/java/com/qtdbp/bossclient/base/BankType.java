package com.qtdbp.bossclient.base ;

/**
 * 银行类别
 * Created by dell on 2017/7/7.
 */
public enum BankType {

    ICBC("1020000","工行"),
    ABCHINA("1030000","农行"),
    BOC("1040000","中行"),
    CCB("1050000","建行"),

    BANKCOMM("3010000","交行"),
    CITICBANK("3020000","中信"),
    CEBBANK("3030000","光大"),
    HXB("3040000","华夏"),
    CMBC("3050000","民生"),
    CGBCHINA("3060000","广发"),
    CMBCHINA("3080000","招商"),
    CIB("3090000","兴业"),
    SPDB("3100000","浦发"),
    PINGAN("3135840","平安银行"),

    ALIPAY("4010000", "支付宝"),
    weichat("4020000", "微信支付");

    private final String code;
    private final String name;

    BankType(String code, String name) {
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
