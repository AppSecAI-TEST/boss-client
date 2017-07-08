package com.qtdbp.bossclient.base;

/**
 * 交易类型
 * Created by dell on 2017/7/7.
 */
public enum TranType {


    IMMEDIATE_PAYMENT("1301","即时到帐支付（网银支付、卡通支付、平台帐户支付）"),
    SECURED_TRANSACTION_PAYMENT("1302","担保交易支付（网银支付、卡通支付、平台帐户支付）"),
    SECURED_TRANSACTION_PAYMENT_CONFIRMATION("1303","担保交易支付确认（收款人确认、付款人确认）"),

    REAL_TIME_WITHHOLDING("1001","实时代扣"),
    REAL_TIME_PAYMENT("1002","实时代付"),

    BATCH_WITHHOLDING("2001","批量代扣"),
    BATCH_PAYMENT("2003","批量代付"),

    DIRECT_REFUND("8021","直接退款"),
    SECURED_TRANSACTION_REFUND_APPLICATION("8022","担保交易退款申请"),
    SECURED_TRANSACTION_REFUND_CONFIRMATION("8023","担保交易退款确认"),
    RECHARGE("8301","充值（网银充值、卡通充值）"),
    WITHDRAWALS("8303","普通提现"),
    REAL_TIME_CASH_WITHDRAWAL("8304","实时提现"),
    ACCOUNT_VALIDATION("8310","帐户验证（打款验证，报文验证）");

    private final String code;
    private final String name;

    TranType(String code, String name) {
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
