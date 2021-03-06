package com.qtdbp.bossclient.model;

import java.util.*;

/*撤销交易流水实体类*/
public class UndoPayBillModel extends BaseModel {
   //交易流水
   /** YYYYMMDD+交易流水（每 天1） */
   private String sn;
   //交易类型
   private String orgTranType;
   //
   private String orgPayerSsoUserId;
   //子账户号类型
   private String orgSubAccountType;
   //原支付流水
   /** 查找原交易后后台填写 */
   private String orgPaySn;
   //付款方开户行行别
   private String payerBankType;
   //行号
   private String payerBankCode;
   //付款方开户行行名
   private String payerBankName;
   //付款方开户行地区代码
   private String payerBankAddrNo;
   //付款方帐号
   private String payerBankCardNo;
   //付款方帐号户名
   private String payerBankCardName;
   //原交易金额
   /** 不能与可提现金额、不可提现金额共存 */
   private double channelAmount;
   //可提现金额
   private double orgCashAmount;
   //不可提现金额
   private double orgUncashAmount;
   //原订单号
   private String orgOrderNo;
   //原对方客户号
   private String orgPayeeUserId;
   //原对方客户名
   private String orgPayeeUserName;
   //状态
   private String state;
   //创建时间
   private Date createTime;
   //会计日期
   private Date workDate;
   //备注
   private String note;
   //手续费
   private double fee;
   //付手续费方
   private String feeSsoUserId;
   //手续费状态
   private String feeState;

   public String getSn() {
      return sn;
   }

   public void setSn(String sn) {
      this.sn = sn;
   }

   public String getOrgTranType() {
      return orgTranType;
   }

   public void setOrgTranType(String orgTranType) {
      this.orgTranType = orgTranType;
   }

   public String getOrgPayerSsoUserId() {
      return orgPayerSsoUserId;
   }

   public void setOrgPayerSsoUserId(String orgPayerSsoUserId) {
      this.orgPayerSsoUserId = orgPayerSsoUserId;
   }

   public String getOrgSubAccountType() {
      return orgSubAccountType;
   }

   public void setOrgSubAccountType(String orgSubAccountType) {
      this.orgSubAccountType = orgSubAccountType;
   }

   public String getOrgPaySn() {
      return orgPaySn;
   }

   public void setOrgPaySn(String orgPaySn) {
      this.orgPaySn = orgPaySn;
   }

   public String getPayerBankType() {
      return payerBankType;
   }

   public void setPayerBankType(String payerBankType) {
      this.payerBankType = payerBankType;
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

   public String getPayerBankAddrNo() {
      return payerBankAddrNo;
   }

   public void setPayerBankAddrNo(String payerBankAddrNo) {
      this.payerBankAddrNo = payerBankAddrNo;
   }

   public String getPayerBankCardNo() {
      return payerBankCardNo;
   }

   public void setPayerBankCardNo(String payerBankCardNo) {
      this.payerBankCardNo = payerBankCardNo;
   }

   public String getPayerBankCardName() {
      return payerBankCardName;
   }

   public void setPayerBankCardName(String payerBankCardName) {
      this.payerBankCardName = payerBankCardName;
   }

   public double getChannelAmount() {
      return channelAmount;
   }

   public void setChannelAmount(double channelAmount) {
      this.channelAmount = channelAmount;
   }

   public double getOrgCashAmount() {
      return orgCashAmount;
   }

   public void setOrgCashAmount(double orgCashAmount) {
      this.orgCashAmount = orgCashAmount;
   }

   public double getOrgUncashAmount() {
      return orgUncashAmount;
   }

   public void setOrgUncashAmount(double orgUncashAmount) {
      this.orgUncashAmount = orgUncashAmount;
   }

   public String getOrgOrderNo() {
      return orgOrderNo;
   }

   public void setOrgOrderNo(String orgOrderNo) {
      this.orgOrderNo = orgOrderNo;
   }

   public String getOrgPayeeUserId() {
      return orgPayeeUserId;
   }

   public void setOrgPayeeUserId(String orgPayeeUserId) {
      this.orgPayeeUserId = orgPayeeUserId;
   }

   public String getOrgPayeeUserName() {
      return orgPayeeUserName;
   }

   public void setOrgPayeeUserName(String orgPayeeUserName) {
      this.orgPayeeUserName = orgPayeeUserName;
   }

   public String getState() {
      return state;
   }

   public void setState(String state) {
      this.state = state;
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

   public String getNote() {
      return note;
   }

   public void setNote(String note) {
      this.note = note;
   }

   public double getFee() {
      return fee;
   }

   public void setFee(double fee) {
      this.fee = fee;
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
}