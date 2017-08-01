package com.qtdbp.bossclient.model;
/***********************************************************************
 * Module:  billno_sn.java
 * Author:  dell
 * Purpose: Defines the Class billno_sn
 ***********************************************************************/

import java.util.*;

/** 渠道交易流水对照表 */
public class ChannelCheckBillModel extends BaseModel{
   //业务流水
   /** 各种支付交易的SN */
   private String sn;
   //渠道ID
   private String channelId;
   //发生银行端的流水
   /** 单笔交易使用 */
   private String banSendSn;
   //交易日期
   private String tranDate;
   //轧差日期
   /** 收到回执报文后更新 */
   private String settleDate;
   //渠道批次
   private String channelBatchNo;
   //渠道明细
   private String channelDetail;
   //接收流水
   private String bankRecvSn;
   //金额
   /** 无金额则填写为0 */
   private double amount;
   //实际交易金额
   private double actualAmount;
   //交易类型
   private String tranType;
   //处理状态
   private String state;
   //批次号
   /** 对应于原交易 */
   private String batchId;
   //批量业务明细序号
   private String detailId;
   //渠道返回码
   private String channelRtnCode;
   //渠道返回附言
   private String channelRtnNote;
   //发送交易时间
   private Date sendTime;
   //返回时间
   private Date recvTime;
   //企业帐号
   /** 对应渠道绑定的帐号 */
   private String corpAcctNo;
   //帐号名
   /** 对应渠道绑定的帐号名 */
   private String corpAcctName;
   //企业行号
   /** 对应渠道绑定帐号所属 的行号 */
   private String corpBankNo;
   //另一方帐号
   /** 对方帐号（根据业务决定是付款方还是收款 方，下同） */
   private String otherAcctNo;
   //另一方帐号名
   private String otherAcctName;
   //另一方行号
   /** 对方行号 */
   private String otherBankNo;
   // 优惠金额（元）
   private Double couponAmt;
   // 手续费（元）
   private Double poundageAmt;
   // 分润（元）
   private Double profitAmt;

   public String getSn() {
      return sn;
   }

   public void setSn(String sn) {
      this.sn = sn;
   }

   public String getChannelId() {
      return channelId;
   }

   public void setChannelId(String channelId) {
      this.channelId = channelId;
   }

   public String getBanSendSn() {
      return banSendSn;
   }

   public void setBanSendSn(String banSendSn) {
      this.banSendSn = banSendSn;
   }

   public String getTranDate() {
      return tranDate;
   }

   public void setTranDate(String tranDate) {
      this.tranDate = tranDate;
   }

   public String getSettleDate() {
      return settleDate;
   }

   public void setSettleDate(String settleDate) {
      this.settleDate = settleDate;
   }

   public String getChannelBatchNo() {
      return channelBatchNo;
   }

   public void setChannelBatchNo(String channelBatchNo) {
      this.channelBatchNo = channelBatchNo;
   }

   public String getChannelDetail() {
      return channelDetail;
   }

   public void setChannelDetail(String channelDetail) {
      this.channelDetail = channelDetail;
   }

   public String getBankRecvSn() {
      return bankRecvSn;
   }

   public void setBankRecvSn(String bankRecvSn) {
      this.bankRecvSn = bankRecvSn;
   }

   public double getAmount() {
      return amount;
   }

   public void setAmount(double amount) {
      this.amount = amount;
   }

   public double getActualAmount() {
      return actualAmount;
   }

   public void setActualAmount(double actualAmount) {
      this.actualAmount = actualAmount;
   }

   public String getTranType() {
      return tranType;
   }

   public void setTranType(String tranType) {
      this.tranType = tranType;
   }

   public String getState() {
      return state;
   }

   public void setState(String state) {
      this.state = state;
   }

   public String getBatchId() {
      return batchId;
   }

   public void setBatchId(String batchId) {
      this.batchId = batchId;
   }

   public String getDetailId() {
      return detailId;
   }

   public void setDetailId(String detailId) {
      this.detailId = detailId;
   }

   public String getChannelRtnCode() {
      return channelRtnCode;
   }

   public void setChannelRtnCode(String channelRtnCode) {
      this.channelRtnCode = channelRtnCode;
   }

   public String getChannelRtnNote() {
      return channelRtnNote;
   }

   public void setChannelRtnNote(String channelRtnNote) {
      this.channelRtnNote = channelRtnNote;
   }

   public Date getSendTime() {
      return sendTime;
   }

   public void setSendTime(Date sendTime) {
      this.sendTime = sendTime;
   }

   public Date getRecvTime() {
      return recvTime;
   }

   public void setRecvTime(Date recvTime) {
      this.recvTime = recvTime;
   }

   public String getCorpAcctNo() {
      return corpAcctNo;
   }

   public void setCorpAcctNo(String corpAcctNo) {
      this.corpAcctNo = corpAcctNo;
   }

   public String getCorpAcctName() {
      return corpAcctName;
   }

   public void setCorpAcctName(String corpAcctName) {
      this.corpAcctName = corpAcctName;
   }

   public String getCorpBankNo() {
      return corpBankNo;
   }

   public void setCorpBankNo(String corpBankNo) {
      this.corpBankNo = corpBankNo;
   }

   public String getOtherAcctNo() {
      return otherAcctNo;
   }

   public void setOtherAcctNo(String otherAcctNo) {
      this.otherAcctNo = otherAcctNo;
   }

   public String getOtherAcctName() {
      return otherAcctName;
   }

   public void setOtherAcctName(String otherAcctName) {
      this.otherAcctName = otherAcctName;
   }

   public String getOtherBankNo() {
      return otherBankNo;
   }

   public void setOtherBankNo(String otherBankNo) {
      this.otherBankNo = otherBankNo;
   }

   public Double getCouponAmt() {
      return couponAmt;
   }

   public void setCouponAmt(Double couponAmt) {
      this.couponAmt = couponAmt;
   }

   public Double getPoundageAmt() {
      return poundageAmt;
   }

   public void setPoundageAmt(Double poundageAmt) {
      this.poundageAmt = poundageAmt;
   }

   public Double getProfitAmt() {
      return profitAmt;
   }

   public void setProfitAmt(Double profitAmt) {
      this.profitAmt = profitAmt;
   }
}