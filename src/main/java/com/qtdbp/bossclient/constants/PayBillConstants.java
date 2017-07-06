package com.qtdbp.bossclient.constants;

/**
 * 支付交易流水表所有状态码
 * Created by dell on 2017/7/5.
 */
public class PayBillConstants {

    /**
     * 交易类型
     * 帐户验证（打款验证，报文验证）  卡通协议签订
     */
    public static final String TRAN_TYPE_CHECK = "8310";

    /**
     * 交易类型
     * 充值（网银充值、卡通充值）
     */
    public static final String TRAN_TYPE_RECHARGE = "8301";

    /**
     * 交易类型
     * 即时到帐支付（网银支付、卡通支付、平台帐户支付）
     */
    public static final String TRAN_TYPE_JISHI_PAY = "1301";

    /**
     * 交易类型
     * 担保交易支付（网银支付、卡通支付、平台帐户支付）
     */
    public static final String TRAN_TYPE_ENSURE_PAY = "1302";

    /**
     * 交易类型
     * 担保交易支付确认（收款人确认、付款人确认）
     */
    public static final String TRAN_TYPE_ENSURE_PAY_SURE = "1303";

    /**
     * 交易类型
     * 担保交易退款申请
     */
    public static final String TRAN_TYPE_ENSURE_REFUND = "8022";

    /**
     * 交易类型
     * 担保交易退款确认
     */
    public static final String TRAN_TYPE_ENSURE_REFUND_SURE = "8023";

    /**
     * 交易类型
     * 实时代扣
     */
    public static final String TRAN_TYPE_RELTIME_WITHHOLDING = "1001";

    /**
     * 交易类型
     * 批量代扣
     */
    public static final String TRAN_TYPE_BATCH_WITHHOLDING = "2001";

    /**
     * 交易类型
     * 实时代付
     */
    public static final String TRAN_TYPE_RELTIME_PAYMENT = "1002";

    /**
     * 交易类型
     * 批量代付
     */
    public static final String TRAN_TYPE_BATCH_PAYMENT = "2003";

    /**
     * 交易类型
     * 实时提现
     */
    public static final String TRAN_TYPE_RELTIME_CASH_OUT = "8304";

    /**
     * 交易类型
     * 普通提现
     */
    public static final String TRAN_TYPE_NORMAL_CASH_OUT = "8303";

    /**
     * 交易类型
     * 直接退款
     */
    public static final String TRAN_TYPE_DIRECT_REFUND = "8021";

    /**
     * 收款方账户类型
     * 平台内虚户
     */
    public static final String PAYEE_ACCOUNT_TYPE_PLATFORM_IN_VIRTUAL = "0";

    /**
     * 收款方账户类型
     * 平台内实户
     */
    public static final String PAYEE_ACCOUNT_TYPE_PLATFORM_IN_TRUE = "1";

    /**
     * 收款方账户类型
     * 平台外实户
     */
    public static final String PAYEE_ACCOUNT_TYPE_PLATFORM_OUT_TRUE = "2";

    /**
     * 担保交易状态
     * 担保中
     */
    public static final String GUARANTEE_STATE_GUARANTEEING = "00";
    /**
     * 担保交易状态
     * 待收款方确认
     */
    public static final String GUARANTEE_STATE_RECEIVABLESING = "01";

    /**
     * 担保交易状态
     * 待付款方确认
     */
    public static final String GUARANTEE_STATE_PAYMENTING = "02";

    /**
     * 担保交易状态
     * 担保成功
     */
    public static final String GUARANTEE_STATE_GUARANTEE_SUCCESS = "03";

    /**
     * 担保交易状态
     * 退款已申请，待收款人确认
     */
    public static final String GUARANTEE_STATE_REFUNDING = "04";

    /**
     * 交易状态
     * 未支付(订单保存未支付)
     */
    public static final String STATE_NO_PAY = "10";

    /**
     * 交易状态
     * 待支付（已调用渠道接口）
     */
    public static final String STATE_WAIT_PAY = "00";

    /**
     * 交易状态
     * 支付中（已调用渠道）
     */
    public static final String STATE_PAYING = "01";

    /**
     * 交易状态
     * 支付成功
     */
    public static final String STATE_PAY_SUCCESS = "02";

    /**
     * 交易状态
     * 支付失败
     */
    public static final String STATE_NO_PAY_FAIL = "03";

    /**
     * 支付状态
     * 未向渠道发起
     */
    public static final String PAY_STATE_NO_INITIATE = "00";

    /**
     * 支付状态
     * 已生成支付报表待人工查看
     */
    public static final String PAY_STATE_REPORT_FORMED = "01";

    /**
     * 支付状态
     * 向渠道发起
     */
    public static final String PAY_STATE_INITIATE = "02";

    /**
     * 支付状态
     * 支付完成
     */
    public static final String PAY_STATE_PAYED = "03";

    /**
     * 手续费状态
     * 事前未统计
     */
    public static final String FEE_STATE_ADVANCE_NO_STATISTICS = "00";

    /**
     * 手续费状态
     * 事前已统计
     */
    public static final String FEE_STATE_ADVANCE_STATISTICS = "01";

    /**
     * 手续费状态
     * 事后未计算
     */
    public static final String FEE_STATE_AFTERWARDS_NO_STATISTICS = "10";

    /**
     * 手续费状态
     * 事后已计算
     */
    public static final String FEE_STATE_AFTERWARDS_STATISTICS = "11";

    /**
     * 撤销状态
     * 未撤销
     */
    public static final String UNDO_STATE_NO_UNDO = "00";

    /**
     * 撤销状态
     * 申请撤销
     */
    public static final String UNDO_STATE_APPLICATION_UNDO = "01";

    /**
     * 撤销状态
     * 已被撤销
     */
    public static final String UNDO_STATE_UNDID = "02";

    /**
     * 对账状态
     * 未对账
     */
    public static final String CHECK_STATE_NO = "00";

    /**
     * 对账状态
     * 对帐中
     */
    public static final String CHECK_STATE_ING = "01";

    /**
     * 对账状态
     * 已对账成功
     */
    public static final String CHECK_STATE_SUCCESS = "02";

    /**
     * 对账状态
     * 对帐失败
     */
    public static final String CHECK_STATE_FAIL = "03";


}
