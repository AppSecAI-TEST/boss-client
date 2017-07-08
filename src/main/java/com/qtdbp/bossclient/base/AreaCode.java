package com.qtdbp.bossclient.base;

/**
 * 地区编码
 * Created by dell on 2017/7/7.
 */
public enum AreaCode {

    COUNTRY("0000","全国") ;

    private final String code;
    private final String name;

    AreaCode(String code, String name) {
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
