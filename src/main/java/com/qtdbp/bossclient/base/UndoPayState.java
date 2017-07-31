package com.qtdbp.bossclient.base;

/**
 * 撤销交易类型
 * Created by dell on 2017/7/31.
 */
public enum UndoPayState {

    UNDO_ING("00", "原交易不确定，正撤销"),
    UNDO_SUCCESS("01", "撤销成功"),
    UNDO_FAIL("02", "撤销失败");

    private final String code;
    private final String name;

    UndoPayState(String code, String name){
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
