package com.qtdbp.bossclient.model;
/***********************************************************************
 * Module:  channel_check.java
 * Author:  dell
 * Purpose: Defines the Class channel_check
 ***********************************************************************/

import java.util.Date;

/** 渠道对帐不平表 */
public class ChannelCheckDetailModel extends BaseModel {

    private String checkDetailId; //记录序号
    private String channelId;  // 渠道ID
    private String checkDate;  // 帐务日期
    private String sn;  // 业务流水
    private String orderNo; // 业务订单号
    private String bankSendSn;    // 银行端的流 水
    private String tranDate;   // 交易日期
    private String channelBatchNo;    // 渠道批次
    private String channelDetail;  // 渠道明细
    private Double tradeAmount;    // 交易金额
    private String bankTradeState;    // 银行交易状态
    private Date platformTradeTime;   // 平台交易时间
    private String platformTradeState;    // 平台交易状态
    private String tranType;   // 交易类型
    private String checkState; // 状态
    private String checkResult;    // 对账结果
    private String manualFlag; // 是否人工处理标识

    public String getCheckDetailId() {
        return checkDetailId;
    }

    public void setCheckDetailId(String checkDetailId) {
        this.checkDetailId = checkDetailId;
    }

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

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public String getBankSendSn() {
        return bankSendSn;
    }

    public void setBankSendSn(String bankSendSn) {
        this.bankSendSn = bankSendSn;
    }

    public String getTranDate() {
        return tranDate;
    }

    public void setTranDate(String tranDate) {
        this.tranDate = tranDate;
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

    public Double getTradeAmount() {
        return tradeAmount;
    }

    public void setTradeAmount(Double tradeAmount) {
        this.tradeAmount = tradeAmount;
    }

    public String getBankTradeState() {
        return bankTradeState;
    }

    public void setBankTradeState(String bankTradeState) {
        this.bankTradeState = bankTradeState;
    }

    public Date getPlatformTradeTime() {
        return platformTradeTime;
    }

    public void setPlatformTradeTime(Date platformTradeTime) {
        this.platformTradeTime = platformTradeTime;
    }

    public String getPlatformTradeState() {
        return platformTradeState;
    }

    public void setPlatformTradeState(String platformTradeState) {
        this.platformTradeState = platformTradeState;
    }

    public String getTranType() {
        return tranType;
    }

    public void setTranType(String tranType) {
        this.tranType = tranType;
    }

    public String getCheckState() {
        return checkState;
    }

    public void setCheckState(String checkState) {
        this.checkState = checkState;
    }

    public String getCheckResult() {
        return checkResult;
    }

    public void setCheckResult(String checkResult) {
        this.checkResult = checkResult;
    }

    public String getManualFlag() {
        return manualFlag;
    }

    public void setManualFlag(String manualFlag) {
        this.manualFlag = manualFlag;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }
}