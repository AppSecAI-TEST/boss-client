package com.qtdbp.bossclient.constants;

/**
 * 结算对账单
 * @author: caidchen
 * @create: 2017-08-04 9:08
 * To change this template use File | Settings | File Templates.
 */
public class BalanceBillConstants {

    /*财务类型，未知*/
    public static final String ACCOUNT_TYPE_NO = "0" ;
    /*财务类型，交易*/
    public static final String ACCOUNT_TYPE_TRAN = "1" ;
    /*财务类型，渠道手续费*/
    public static final String ACCOUNT_TYPE_CHANNEL_FEE = "2" ;
    /*财务类型，平台手续费*/
    public static final String ACCOUNT_TYPE_PLATEFORM_FEE = "3" ;

    /*核算状态，未核算*/
    public static final String BALANCE_STATE_NO = "00" ;
    /*核算状态，一次核算*/
    public static final String BALANCE_STATE_FIRST = "10" ;
    /*核算状态，二次核算*/
    public static final String BALANCE_STATE_SECOND = "11" ;
    /*核算状态，核算成功*/
    public static final String BALANCE_STATE_SUCCESS = "20" ;
    /*核算状态，核算失败*/
    public static final String BALANCE_STATE_FAIL = "30" ;

    /*操作状态，待处理*/
    public static final String OPERATE_STATUS_NO = "0" ;
    /*操作状态，处理完成*/
    public static final String OPERATE_STATUS_FINISH = "1" ;
    /*操作状态，处理失败*/
    public static final String OPERATE_STATUS_FAIL = "2" ;

}
