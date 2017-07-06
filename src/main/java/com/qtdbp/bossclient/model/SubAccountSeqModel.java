package com.qtdbp.bossclient.model;

import java.util.Date;

/**
 * 客户子账户资金变动流水
 * Created by dell on 2017/7/4.
 */
public class SubAccountSeqModel {

    private String sn;                      //流水号
    private String subAccountId;          //子账户ID
    private int userId;                    //用户编号
    private String userName;               //用户名
    private String accountType;            //子账户号类型
    private Integer seqFlag;               //帐务变动方向
    private Integer changeType;            //类型
    private Double preAmount;              //变动前总金额
    private Double amount;                  //变动后总金额
    private Double cashAmount;             //可提现发生额
    private Double uncashAmount;           //不可提现发生额
    private String refSn;                  //关联流水ID
    private String refBatchId;            //批次号
    private String orderNo;                //订单号
    private Date createTime;               //创建时间
    private String note;                     //备注
    private Date workDate;                  //会计日期

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public String getSubAccountId() {
        return subAccountId;
    }

    public void setSubAccountId(String subAccountId) {
        this.subAccountId = subAccountId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
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

    public Integer getSeqFlag() {
        return seqFlag;
    }

    public void setSeqFlag(Integer seqFlag) {
        this.seqFlag = seqFlag;
    }

    public Integer getChangeType() {
        return changeType;
    }

    public void setChangeType(Integer changeType) {
        this.changeType = changeType;
    }

    public Double getPreAmount() {
        return preAmount;
    }

    public void setPreAmount(Double preAmount) {
        this.preAmount = preAmount;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Double getCashAmount() {
        return cashAmount;
    }

    public void setCashAmount(Double cashAmount) {
        this.cashAmount = cashAmount;
    }

    public Double getUncashAmount() {
        return uncashAmount;
    }

    public void setUncashAmount(Double uncashAmount) {
        this.uncashAmount = uncashAmount;
    }

    public String getRefSn() {
        return refSn;
    }

    public void setRefSn(String refSn) {
        this.refSn = refSn;
    }

    public String getRefBatchId() {
        return refBatchId;
    }

    public void setRefBatchId(String refBatchId) {
        this.refBatchId = refBatchId;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Date getWorkDate() {
        return workDate;
    }

    public void setWorkDate(Date workDate) {
        this.workDate = workDate;
    }
}
