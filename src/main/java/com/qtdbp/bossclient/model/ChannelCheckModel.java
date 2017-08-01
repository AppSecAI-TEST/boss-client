package com.qtdbp.bossclient.model;
/***********************************************************************
 * Module:  channel_check.java
 * Author:  dell
 * Purpose: Defines the Class channel_check
 ***********************************************************************/

import java.util.*;

/** 渠道对帐表 */
public class ChannelCheckModel extends BaseModel {
   //渠道ID
   private String channelId;
   //帐务日期
   /** 与渠道进行对帐时使用的日期
    *  （同城采用同城工作日，银联与网银由客户端指定） */
   private String checkDate;
   //贷记笔数
   @Deprecated
   private Double creditNum;
   //贷记金额
   @Deprecated
   private Double creditAmt;
   //借记笔数
   @Deprecated
   private Double debitNum;
   //借记金额
   @Deprecated
   private Double debitAmt;
   //对帐结果状态
   private String checkResultState;
   //调账状态
   private String adjustState;
   //处理时间
   private Date checkTime;
   //对账文件名
   /** 各个渠道的对账 文件名 */
   private String fileName;

   // 交易订单总笔数
   private Integer orderNum;
   // 订单金额
   private Double orderAmt;
   // 退款订单总笔数
   private Integer refundNum;
   // 商家实收（元）
   private Double merchantAmt;
   // 优惠金额（元）
   private Double couponAmt;
   // 手续费（元）
   private Double poundageAmt;
   // 分润（元）
   private Double profitAmt;
   // 实收净额（元）
   private Double netAmt;

   public String getChannelId() {
      return channelId;
   }

   public void setChannelId(String channelId) {
      this.channelId = channelId;
   }

   public String getCheckDate() {
      return checkDate;
   }

   public void setCheckDate(String checkDate) {
      this.checkDate = checkDate;
   }

   public Double getCreditNum() {
      return creditNum;
   }

   public void setCreditNum(Double creditNum) {
      this.creditNum = creditNum;
   }

   public Double getCreditAmt() {
      return creditAmt;
   }

   public void setCreditAmt(Double creditAmt) {
      this.creditAmt = creditAmt;
   }

   public Double getDebitNum() {
      return debitNum;
   }

   public void setDebitNum(Double debitNum) {
      this.debitNum = debitNum;
   }

   public Double getDebitAmt() {
      return debitAmt;
   }

   public void setDebitAmt(Double debitAmt) {
      this.debitAmt = debitAmt;
   }

   public String getCheckResultState() {
      return checkResultState;
   }

   public void setCheckResultState(String checkResultState) {
      this.checkResultState = checkResultState;
   }

   public String getAdjustState() {
      return adjustState;
   }

   public void setAdjustState(String adjustState) {
      this.adjustState = adjustState;
   }

   public Date getCheckTime() {
      return checkTime;
   }

   public void setCheckTime(Date checkTime) {
      this.checkTime = checkTime;
   }

   public String getFileName() {
      return fileName;
   }

   public void setFileName(String fileName) {
      this.fileName = fileName;
   }

   public Integer getOrderNum() {
      return orderNum;
   }

   public void setOrderNum(Integer orderNum) {
      this.orderNum = orderNum;
   }

   public Double getOrderAmt() {
      return orderAmt;
   }

   public void setOrderAmt(Double orderAmt) {
      this.orderAmt = orderAmt;
   }

   public Integer getRefundNum() {
      return refundNum;
   }

   public void setRefundNum(Integer refundNum) {
      this.refundNum = refundNum;
   }

   public Double getMerchantAmt() {
      return merchantAmt;
   }

   public void setMerchantAmt(Double merchantAmt) {
      this.merchantAmt = merchantAmt;
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

   public Double getNetAmt() {
      return netAmt;
   }

   public void setNetAmt(Double netAmt) {
      this.netAmt = netAmt;
   }
}