package com.qtdbp.bossclient.constants;

/**
 * 渠道对帐不平明细表
 * @author: caidchen
 * @create: 2017-08-04 9:08
 * To change this template use File | Settings | File Templates.
 */
public class ChannelCheckDetailConstants {

    /*状态，未对账*/
    public static final String CHECK_STATE_NO = "00" ;
    /*状态，对账成功*/
    public static final String CHECK_STATE_SUCCESS = "01" ;
    /*状态，对账失败*/
    public static final String CHECK_STATE_FAIL = "02" ;
    /*状态，调账成功*/
    public static final String CHECK_STATE_CHANGE_SUCCESS = "03" ;
    /*状态，调账失败*/
    public static final String CHECK_STATE_CHANGE_FAIL = "04" ;

    /*对账结果，待对账*/
    public static final String CHECK_RESULT_NO = "00" ;
    /*对账结果，平账*/
    public static final String CHECK_RESULT_PINGZHANG = "01" ;
    /*对账结果，银行有、平台无*/
    public static final String CHECK_RESULT_PLATEFORM_EXIST = "02" ;
    /*对账结果，银行无、平台有 */
    public static final String CHECK_RESULT_PLATEFORM_UNEXIST = "03" ;
    /*对账结果，银行成功、平台失败 */
    public static final String CHECK_RESULT_PLATEFORM_FAIL = "04" ;
    /*对账结果，银行失败、平台成功 */
    public static final String CHECK_RESULT_PLATEFORM_SUCCESS = "05" ;
    /*对账结果，支付要素不一致 */
    public static final String CHECK_RESULT_PAY_DIFFER = "06" ;
    /*对账结果，渠道有、银行无 */
    public static final String CHECK_RESULT_CHANNEL_EXIST = "07" ;
    /*对账结果，渠道无、银行有 */
    public static final String CHECK_RESULT_CHANNEL_UNEXIST = "08" ;

    /*是否人工处理标识，是*/
    public static final String MANUAL_FLAG_YES = "Y" ;
    /*是否人工处理标识，否*/
    public static final String MANUAL_FLAG_NO = "N" ;

    /*银行交易状态，支付成功*/
    public static final String BANK_TRADE_STATE_PAY_SUCCESS = "00" ;
    /*银行交易状态，支付失败*/
    public static final String BANK_TRADE_STATE_PAY_FAIL = "01" ;
    /*银行交易状态，超时*/
    public static final String BANK_TRADE_STATE_TIME_OUT = "02" ;
}
