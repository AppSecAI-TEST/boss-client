package com.qtdbp.bossclient.model;

import java.util.Date;

/**
 * Created by dell on 2017/7/5.
 */
public class PayBillModel {

    private String sn;                     //流水号
    private String srcSsoUserId;            //发起方客户编号
    private String subAccountType;        //子账户类型
    private Integer payerPlatformCust;    //付款方是否平台客户
    private String payerSsoUserId;          //付款方客户编号
    private String payerUseName;         //付款方户名
    private String payerBankType;         //付款方开户行行别
    private String payerBankCode;         //付款方开户行行号
    private String payerBankName;         //付款方开户行行名
    private String payerBankAddrNo;      //付款方开户行地区代码
    private String payerBankCardNo;      //付款方帐号
    private String payerBankCardName;    //付款方帐号户名
    private String tranType;               //交易类型
    private String feeType;                //费用类型代码
    private Integer channelPayFlag;       //是否渠道金额支付
    private Double channelAmount;          //渠道应扣金额
    private Double channelFee;             //渠道手续费
    private Double channelActualAmount;   //渠道实扣金额
    private Double cashAmount;             //可提现金额
    private Double uncashAmount;           //不可提现金额
    private String freezeSn;               //帐务冻结变动流
    private String feeFreezeSn;           //实时手续费帐务冻结变动流水
    private String orderNo;                //订单号
    private String orderNote;              //订单说明
    private Integer payeePlatformCust ;   //收款方是否是平台客户
    private Integer payeeAccountType ;    //收款方账户类型
    private Integer payeeUserId ;         //收款方客户号
    private String payeeUserName ;        //收款方平台户名
    private String payeeBankType ;        //收款方开户行行别
    private String payeeBankCode ;        //收款方开户行行号
    private String payeeBankName ;        //收款方开户行行名
    private String payeeBankAddrNo ;     //收款方开户行地区代码
    private String payeeBankCardNo ;     //收款方帐号
    private String payeeBankCardName ;   //收款方帐号户名
    private Date createTime;               //创建时间
    private Date expireTime;               //未支付失效时间
    private String resultCode ;            //返回码
    private String resultNote ;            //返回说明
    private String guaranteeState ;         //担保交易状态
    private String state ;                  //交易状态
    private String netNo ;                 //支付场次
    private String payState ;              //支付状态
    private String channelId ;             //渠道编号
    private String bankResultCode ;       //银行返回码
    private String bankResultNote ;        //银行备注
    private Date bankTime ;                //银行回执更新时间
    private Date workDate ;                //会计日期
    private Double fee ;                    //手续费
    private String feeSsoUserId ;           //付手续费方
    private String feeState ;              //手续费状态
    private String undoState ;             //撤销状态
    private String checkState ;            //对账状态
    private Date settleDate ;              //结算日期
    private Date checkDate ;               //渠道结算日起
    private Double tranAmount ;            //交易金额

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public String getSrcSsoUserId() {
        return srcSsoUserId;
    }

    public void setSrcSsoUserId(String srcSsoUserId) {
        this.srcSsoUserId = srcSsoUserId;
    }

    public String getSubAccountType() {
        return subAccountType;
    }

    public void setSubAccountType(String subAccountType) {
        this.subAccountType = subAccountType;
    }

    public Integer getPayerPlatformCust() {
        return payerPlatformCust;
    }

    public void setPayerPlatformCust(Integer payerPlatformCust) {
        this.payerPlatformCust = payerPlatformCust;
    }

    public String getPayerSsoUserId() {
        return payerSsoUserId;
    }

    public void setPayerSsoUserId(String payerSsoUserId) {
        this.payerSsoUserId = payerSsoUserId;
    }

    public String getPayerUseName() {
        return payerUseName;
    }

    public void setPayerUseName(String payerUseName) {
        this.payerUseName = payerUseName;
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

    public String getTranType() {
        return tranType;
    }

    public void setTranType(String tranType) {
        this.tranType = tranType;
    }

    public String getFeeType() {
        return feeType;
    }

    public void setFeeType(String feeType) {
        this.feeType = feeType;
    }

    public Integer getChannelPayFlag() {
        return channelPayFlag;
    }

    public void setChannelPayFlag(Integer channelPayFlag) {
        this.channelPayFlag = channelPayFlag;
    }

    public Double getChannelAmount() {
        return channelAmount;
    }

    public void setChannelAmount(Double channelAmount) {
        this.channelAmount = channelAmount;
    }

    public Double getChannelFee() {
        return channelFee;
    }

    public void setChannelFee(Double channelFee) {
        this.channelFee = channelFee;
    }

    public Double getChannelActualAmount() {
        return channelActualAmount;
    }

    public void setChannelActualAmount(Double channelActualAmount) {
        this.channelActualAmount = channelActualAmount;
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

    public String getFreezeSn() {
        return freezeSn;
    }

    public void setFreezeSn(String freezeSn) {
        this.freezeSn = freezeSn;
    }

    public String getFeeFreezeSn() {
        return feeFreezeSn;
    }

    public void setFeeFreezeSn(String feeFreezeSn) {
        this.feeFreezeSn = feeFreezeSn;
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

    public Integer getPayeePlatformCust() {
        return payeePlatformCust;
    }

    public void setPayeePlatformCust(Integer payeePlatformCust) {
        this.payeePlatformCust = payeePlatformCust;
    }

    public Integer getPayeeAccountType() {
        return payeeAccountType;
    }

    public void setPayeeAccountType(Integer payeeAccountType) {
        this.payeeAccountType = payeeAccountType;
    }

    public Integer getPayeeUserId() {
        return payeeUserId;
    }

    public void setPayeeUserId(Integer payeeUserId) {
        this.payeeUserId = payeeUserId;
    }

    public String getPayeeUserName() {
        return payeeUserName;
    }

    public void setPayeeUserName(String payeeUserName) {
        this.payeeUserName = payeeUserName;
    }

    public String getPayeeBankType() {
        return payeeBankType;
    }

    public void setPayeeBankType(String payeeBankType) {
        this.payeeBankType = payeeBankType;
    }

    public String getPayeeBankCode() {
        return payeeBankCode;
    }

    public void setPayeeBankCode(String payeeBankCode) {
        this.payeeBankCode = payeeBankCode;
    }

    public String getPayeeBankName() {
        return payeeBankName;
    }

    public void setPayeeBankName(String payeeBankName) {
        this.payeeBankName = payeeBankName;
    }

    public String getPayeeBankAddrNo() {
        return payeeBankAddrNo;
    }

    public void setPayeeBankAddrNo(String payeeBankAddrNo) {
        this.payeeBankAddrNo = payeeBankAddrNo;
    }

    public String getPayeeBankCardNo() {
        return payeeBankCardNo;
    }

    public void setPayeeBankCardNo(String payeeBankCardNo) {
        this.payeeBankCardNo = payeeBankCardNo;
    }

    public String getPayeeBankCardName() {
        return payeeBankCardName;
    }

    public void setPayeeBankCardName(String payeeBankCardName) {
        this.payeeBankCardName = payeeBankCardName;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Date expireTime) {
        this.expireTime = expireTime;
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

    public String getGuaranteeState() {
        return guaranteeState;
    }

    public void setGuaranteeState(String guaranteeState) {
        this.guaranteeState = guaranteeState;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
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

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
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

    public Date getBankTime() {
        return bankTime;
    }

    public void setBankTime(Date bankTime) {
        this.bankTime = bankTime;
    }

    public Date getWorkDate() {
        return workDate;
    }

    public void setWorkDate(Date workDate) {
        this.workDate = workDate;
    }

    public Double getFee() {
        return fee;
    }

    public void setFee(Double fee) {
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

    public String getUndoState() {
        return undoState;
    }

    public void setUndoState(String undoState) {
        this.undoState = undoState;
    }

    public String getCheckState() {
        return checkState;
    }

    public void setCheckState(String checkState) {
        this.checkState = checkState;
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

    public Double getTranAmount() {
        return tranAmount;
    }

    public void setTranAmount(Double tranAmount) {
        this.tranAmount = tranAmount;
    }
}
