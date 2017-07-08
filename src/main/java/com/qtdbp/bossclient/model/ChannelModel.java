package com.qtdbp.bossclient.model;
/***********************************************************************
 * Module:  channel.java
 * Author:  dell
 * Purpose: Defines the Class channel
 ***********************************************************************/

import java.util.*;

/** 
 * 渠道表
 **/
public class ChannelModel {
   //渠道ID
   public String id;
   //渠道类型
   public String channelType;
   //开户行卡号
   public String bankCardNo;
   //开户行logo
   public String bankLogo;
   //开户行行别
   public String bankType;
   //开户行行号
   public String bankCode;
   //开户行行名
   public String bankName;
   //开户行地区
   public String bankAddrNo;
   //开户名
   public String bankUserName;
   //备注
   public String bankRemark;
   //创建时间
   public Date createTime;
   //最后更新时间
   public Date lastUpdateTime;
   // 是否可用0否，1是
   public String isUsed;

   public String getId() {
      return id;
   }

   public void setId(String id) {
      this.id = id;
   }

   public String getChannelType() {
      return channelType;
   }

   public void setChannelType(String channelType) {
      this.channelType = channelType;
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

   public String getBankUserName() {
      return bankUserName;
   }

   public void setBankUserName(String bankUserName) {
      this.bankUserName = bankUserName;
   }

   public Date getCreateTime() {
      return createTime;
   }

   public void setCreateTime(Date createTime) {
      this.createTime = createTime;
   }

   public Date getLastUpdateTime() {
      return lastUpdateTime;
   }

   public void setLastUpdateTime(Date lastUpdateTime) {
      this.lastUpdateTime = lastUpdateTime;
   }

   public String getBankCardNo() {
      return bankCardNo;
   }

   public void setBankCardNo(String bankCardNo) {
      this.bankCardNo = bankCardNo;
   }

   public String getBankLogo() {
      return bankLogo;
   }

   public void setBankLogo(String bankLogo) {
      this.bankLogo = bankLogo;
   }

   public String getBankRemark() {
      return bankRemark;
   }

   public void setBankRemark(String bankRemark) {
      this.bankRemark = bankRemark;
   }

   public String getIsUsed() {
      return isUsed;
   }

   public void setIsUsed(String isUsed) {
      this.isUsed = isUsed;
   }
}