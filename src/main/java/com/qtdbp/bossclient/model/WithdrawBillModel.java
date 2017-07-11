package com.qtdbp.bossclient.model;

import java.util.Date;

/***********************************************************************
 * Module:  withdraw_bill.java
 * Author:  dell
 * Purpose: Defines the Class withdraw_bill
 ***********************************************************************/

public class WithdrawBillModel extends BaseModel {
   //交易流水
   /** YYYYMMDD+交易流水 （每天1） */
   private java.lang.String sn;
   //用户编号
   /** 冗余 */
   private java.lang.String ssoUserId;
   //用户名
   /** 冗余 */
   private java.lang.String userName;
   //子账户号类型
   /** 冗余 */
   private java.lang.String accountType;
   //行别
   private java.lang.String bankType;
   //行号
   /** 支付系统行号 */
   private java.lang.String bankCode;
   //开户行行名
   private java.lang.String bankName;
   //开户行地区代码
   private java.lang.String bankAddrNo;
   //银行卡号
   private java.lang.String bankCardNo;
   //户名
   private java.lang.String bankCardName;
   //帐务冻结变动流水
   private java.lang.String freezeSn;
   //金额
   public Double amount;
   //提现类型
   private java.lang.String withdrawType;
   //创建时间
   private java.util.Date createTime;
   //会计日期
   private java.util.Date workDate;
   //状态
   private java.lang.String state;
   //渠道编号
   private java.lang.String channelId;
   //监管批次
   private java.lang.String monitorBatchId;
   //手续费
   /** 事前收的手续费 */
   private Double fee;
   //付手续费方
   private java.lang.String feeSsoUserId;
   //手续费状态
   private java.lang.String feeState;
   //银行返回码
   private java.lang.String bankResultCode;
   //银行备注
   private java.lang.String bankResultNote;
   //支付场次
   /** 统计时回填 */
   private java.lang.String netNo;
   //支付状态
   /** 登记成功时必须填写 */
   private java.lang.String payState;
   //结算日期
   /** 外部系统提供，供外部 系统对账用 */
   private java.util.Date settleDate;
   //渠道结算日起
   /** 与渠道对账时使用 */
   private java.util.Date checkDate;

   // 短信验证码
   private String mobileCode ;

   public String getSn() {
      return sn;
   }

   public void setSn(String sn) {
      this.sn = sn;
   }

   public String getSsoUserId() {
      return ssoUserId;
   }

   public void setSsoUserId(String ssoUserId) {
      this.ssoUserId = ssoUserId;
   }

   public String getUserName() {
      return userName;
   }

   public void setUserName(String userName) {
      this.userName = userName;
   }

   public String getAccountType() {
      return accountType;
   }

   public void setAccountType(String accountType) {
      this.accountType = accountType;
   }

   public String getBankType() {
      return bankType;
   }

   public void setBankType(String bankType) {
      this.bankType = bankType;
   }

   public String getBankCode() {
      return bankCode;
   }

   public void setBankCode(String bankCode) {
      this.bankCode = bankCode;
   }

   public String getBankName() {
      return bankName;
   }

   public void setBankName(String bankName) {
      this.bankName = bankName;
   }

   public String getBankAddrNo() {
      return bankAddrNo;
   }

   public void setBankAddrNo(String bankAddrNo) {
      this.bankAddrNo = bankAddrNo;
   }

   public String getBankCardNo() {
      return bankCardNo;
   }

   public void setBankCardNo(String bankCardNo) {
      this.bankCardNo = bankCardNo;
   }

   public String getBankCardName() {
      return bankCardName;
   }

   public void setBankCardName(String bankCardName) {
      this.bankCardName = bankCardName;
   }

   public String getFreezeSn() {
      return freezeSn;
   }

   public void setFreezeSn(String freezeSn) {
      this.freezeSn = freezeSn;
   }

   public String getWithdrawType() {
      return withdrawType;
   }

   public void setWithdrawType(String withdrawType) {
      this.withdrawType = withdrawType;
   }

   public Date getCreateTime() {
      return createTime;
   }

   public void setCreateTime(Date createTime) {
      this.createTime = createTime;
   }

   public Date getWorkDate() {
      return workDate;
   }

   public void setWorkDate(Date workDate) {
      this.workDate = workDate;
   }

   public String getState() {
      return state;
   }

   public void setState(String state) {
      this.state = state;
   }

   public String getChannelId() {
      return channelId;
   }

   public void setChannelId(String channelId) {
      this.channelId = channelId;
   }

   public String getMonitorBatchId() {
      return monitorBatchId;
   }

   public void setMonitorBatchId(String monitorBatchId) {
      this.monitorBatchId = monitorBatchId;
   }

   public String getFeeSsoUserId() {
      return feeSsoUserId;
   }

   public void setFeeSsoUserId(String feeSsoUserId) {
      this.feeSsoUserId = feeSsoUserId;
   }

   public String getFeeState() {
      return feeState;
   }

   public void setFeeState(String feeState) {
      this.feeState = feeState;
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

   public String getNetNo() {
      return netNo;
   }

   public void setNetNo(String netNo) {
      this.netNo = netNo;
   }

   public String getPayState() {
      return payState;
   }

   public void setPayState(String payState) {
      this.payState = payState;
   }

   public Date getSettleDate() {
      return settleDate;
   }

   public void setSettleDate(Date settleDate) {
      this.settleDate = settleDate;
   }

   public Date getCheckDate() {
      return checkDate;
   }

   public void setCheckDate(Date checkDate) {
      this.checkDate = checkDate;
   }

   public Double getAmount() {
      return amount;
   }

   public void setAmount(Double amount) {
      this.amount = amount;
   }

   public Double getFee() {
      return fee;
   }

   public void setFee(Double fee) {
      this.fee = fee;
   }

   public String getMobileCode() {
      return mobileCode;
   }

   public void setMobileCode(String mobileCode) {
      this.mobileCode = mobileCode;
   }
}