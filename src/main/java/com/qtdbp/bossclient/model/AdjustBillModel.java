package com.qtdbp.bossclient.model;

import java.util.*;

/**
 * 内部调账交易流水实体类
 */
public class AdjustBillModel {
   //管理平台流水
   private String sn;
   //客户号
   private String ssoUserId;
   //子账户号类型
   private String subAccountType;
   //用户名
   private String userName;
   //资金属性
   private String amountType;
   //金额（正，负）
   private double amount;
   //调账类型
   private String adjustType;
   //操作时间
   private Date createTime;
   //操作人
   private String operator;
   //审核人
   private String checkUser;
   //审核时间
   private Date checkTime;
   //状态
   private String state;
   //附言
   private String note;

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

   public String getSubAccountType() {
      return subAccountType;
   }

   public void setSubAccountType(String subAccountType) {
      this.subAccountType = subAccountType;
   }

   public String getUserName() {
      return userName;
   }

   public void setUserName(String userName) {
      this.userName = userName;
   }

   public String getAmountType() {
      return amountType;
   }

   public void setAmountType(String amountType) {
      this.amountType = amountType;
   }

   public double getAmount() {
      return amount;
   }

   public void setAmount(double amount) {
      this.amount = amount;
   }

   public String getAdjustType() {
      return adjustType;
   }

   public void setAdjustType(String adjustType) {
      this.adjustType = adjustType;
   }

   public Date getCreateTime() {
      return createTime;
   }

   public void setCreateTime(Date createTime) {
      this.createTime = createTime;
   }

   public String getOperator() {
      return operator;
   }

   public void setOperator(String operator) {
      this.operator = operator;
   }

   public String getCheckUser() {
      return checkUser;
   }

   public void setCheckUser(String checkUser) {
      this.checkUser = checkUser;
   }

   public Date getCheckTime() {
      return checkTime;
   }

   public void setCheckTime(Date checkTime) {
      this.checkTime = checkTime;
   }

   public String getState() {
      return state;
   }

   public void setState(String state) {
      this.state = state;
   }

   public String getNote() {
      return note;
   }

   public void setNote(String note) {
      this.note = note;
   }
}