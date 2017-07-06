package com.qtdbp.bossclient.model;

import java.util.Date;

/**
 * 充值交易流水
 * Created by dell on 2017/7/4.
 */
public class RechargeBillModel {

    private String sn;                      //交易流水
    private Integer userId;                //用户编号
    private String userName;               //用户名
    private Integer accountType;           //子账户号类型
    private String rechargeType;           //充值类型
    private String bankType;               //行别
    private String bankCode;               //行号
    private String bankName;               //开户行行名
    private String bankAddrNo;            //开户行地区代码
    private String bankCardNo;            //银行卡号
    private String bankCardName;          //户名
    private Double amount;                  //金额
    private String note;                    //备注
    private String bankResultCode;        //银行返回码
    private String bankResultNote;        //银行备注
    private String resultCode;             //返回码
    private String resultNote;             //返回说明
    private Date createTime;               //创建时间
    private Date bankTime;                 //银行回执更新时间
    private String state;                   //状态
    private String channelId;              //渠道编号
    private String monitorBatchId;        //监管批次
    private String checkState;             //对账状态
    private Date workDate;                 //会计日期
    private Date settleDate;               //结算日期
    private Date checkDate;                //渠道结算日起

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getAccountType() {
        return accountType;
    }

    public void setAccountType(Integer accountType) {
        this.accountType = accountType;
    }

    public String getRechargeType() {
        return rechargeType;
    }

    public void setRechargeType(String rechargeType) {
        this.rechargeType = rechargeType;
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

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
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

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultNote() {
        return resultNote;
    }

    public void setResultNote(String resultNote) {
        this.resultNote = resultNote;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getBankTime() {
        return bankTime;
    }

    public void setBankTime(Date bankTime) {
        this.bankTime = bankTime;
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

    public String getCheckState() {
        return checkState;
    }

    public void setCheckState(String checkState) {
        this.checkState = checkState;
    }

    public Date getWorkDate() {
        return workDate;
    }

    public void setWorkDate(Date workDate) {
        this.workDate = workDate;
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
}
