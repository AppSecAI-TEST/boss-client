package com.qtdbp.bossclient.model;

import java.util.Date;

/**
 * 结算流水表
 *
 * @author: caidchen
 * @create: 2017-08-03 15:16
 * To change this template use File | Settings | File Templates.
 */
public class BalanceBillModel extends BaseModel {

    private String sn ; // 流水号
    private String checkDate;   // 结算日期
    private String orderNo ;   // 平台订单号
    private String orderNote;  // 订单说明
    private String payeeUserId;   // 收款方客户号
    private String payeeUserName; // 收款方平台户名
    private String payerUserId;   // 付款方客户编号
    private String payerUserName; // 付款方户名
    private String payerBankCardNo;  // 付款方帐号
    private String payerBankCode;     // 付款方开户行行号
    private String payerBankName;     // 付款方开户行行名
    private String payerOrderNo;      // 付款方交易流水号
    private Double tranAmount;         // 实际交易金额（正，负）
    private Double accountAmount;      // 账户余额
    private String accountType;        // 财务类型
    private String balanceState;   // 核算状态
    private Date balanceTime;    // 核算时间
    private String balanceFailReason; // 核算失败原因
    private String bankResultCode;    // 银行返回码
    private String bankResultNote;    // 银行备注

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public String getCheckDate() {
        return checkDate;
    }

    public void setCheckDate(String checkDate) {
        this.checkDate = checkDate;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getOrderNote() {
        return orderNote;
    }

    public void setOrderNote(String orderNote) {
        this.orderNote = orderNote;
    }

    public String getPayeeUserId() {
        return payeeUserId;
    }

    public void setPayeeUserId(String payeeUserId) {
        this.payeeUserId = payeeUserId;
    }

    public String getPayeeUserName() {
        return payeeUserName;
    }

    public void setPayeeUserName(String payeeUserName) {
        this.payeeUserName = payeeUserName;
    }

    public String getPayerUserId() {
        return payerUserId;
    }

    public void setPayerUserId(String payerUserId) {
        this.payerUserId = payerUserId;
    }

    public String getPayerUserName() {
        return payerUserName;
    }

    public void setPayerUserName(String payerUserName) {
        this.payerUserName = payerUserName;
    }

    public String getPayerBankCardNo() {
        return payerBankCardNo;
    }

    public void setPayerBankCardNo(String payerBankCardNo) {
        this.payerBankCardNo = payerBankCardNo;
    }

    public String getPayerBankCode() {
        return payerBankCode;
    }

    public void setPayerBankCode(String payerBankCode) {
        this.payerBankCode = payerBankCode;
    }

    public String getPayerBankName() {
        return payerBankName;
    }

    public void setPayerBankName(String payerBankName) {
        this.payerBankName = payerBankName;
    }

    public String getPayerOrderNo() {
        return payerOrderNo;
    }

    public void setPayerOrderNo(String payerOrderNo) {
        this.payerOrderNo = payerOrderNo;
    }

    public Double getTranAmount() {
        return tranAmount;
    }

    public void setTranAmount(Double tranAmount) {
        this.tranAmount = tranAmount;
    }

    public Double getAccountAmount() {
        return accountAmount;
    }

    public void setAccountAmount(Double accountAmount) {
        this.accountAmount = accountAmount;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getBalanceState() {
        return balanceState;
    }

    public void setBalanceState(String balanceState) {
        this.balanceState = balanceState;
    }

    public Date getBalanceTime() {
        return balanceTime;
    }

    public void setBalanceTime(Date balanceTime) {
        this.balanceTime = balanceTime;
    }

    public String getBalanceFailReason() {
        return balanceFailReason;
    }

    public void setBalanceFailReason(String balanceFailReason) {
        this.balanceFailReason = balanceFailReason;
    }

    public String getBankResultCode() {
        return bankResultCode;
    }

    public void setBankResultCode(String bankResultCode) {
        this.bankResultCode = bankResultCode;
    }

    public String getBankResultNote() {
        return bankResultNote;
    }

    public void setBankResultNote(String bankResultNote) {
        this.bankResultNote = bankResultNote;
    }
}
