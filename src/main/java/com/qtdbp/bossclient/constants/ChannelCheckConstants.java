package com.qtdbp.bossclient.constants;

/**
 * 对账单
 *
 * @author: caidchen
 * @create: 2017-08-02 14:33
 * To change this template use File | Settings | File Templates.
 */
public class ChannelCheckConstants {

    /*未调账*/
    public static final String ADJUST_STATE_NO = "0" ;
    /*已调账*/
    public static final String ADJUST_STATE_YES = "1" ;

    /*未对账*/
    public static final String CHECK_RESULT_STATE_NO = "0" ;
    /*对账中*/
    public static final String CHECK_RESULT_STATE_ING = "1" ;
    /*对账完成*/
    public static final String CHECK_RESULT_STATE_YES = "2" ;

    /*已发送*/
    public static final String CHECK_BILL_STATE_SEND = "00" ;
    /*已收到中心确认*/
    public static final String CHECK_BILL_STATE_CONFIRM = "01" ;
    /*业务回执已返回*/
    public static final String CHECK_BILL_STATE_FINISH = "02" ;

}
