package com.qtdbp.bossclient.constants;

/**
 * 提现类型
 *
 * @author: caidchen
 * @create: 2017-07-07 15:10
 * To change this template use File | Settings | File Templates.
 */
public class WithdrawConstants {

    /* 实时提现 */
    public static final String TYPE_ONLINE = "1";
    /* 非实时提现 */
    public static final String TYPE_OFFLINE = "2";


    /* 提现申请登记（基金监管时用） */
    public static final String STATE_APPLY = "00";
    /* 登记成功 */
    public static final String STATE_APPLY_SUCCESS = "01";
    /* 登记失败（基金监管时用） */
    public static final String STATE_APPLY_FAILURE = "02";
    /* 支付中（已生成提现流水） */
    public static final String STATE_PAYMENTING = "03";
    /* 提现成功 */
    public static final String STATE_SUCCESS = "04";
    /* 提现失败 */
    public static final String STATE_FAILURE = "05";

}
