package com.qtdbp.bossclient.model;

import java.util.Date;

/**
 * 客户结算对账Model
 *
 * @author: caidchen
 * @create: 2017-08-03 15:10
 * To change this template use File | Settings | File Templates.
 */
public class SubAccountBalanceModel extends BaseModel {

    private String sn ;                 //流水号
    private String checkDate;           // 结算日期
    private String checkState;          // 结算对账状态
    private String ssoUserId ;          // 用户编号
    private String accountType;         // 子账户号类型
    private Double payInAmt;            // 总收入（元）
    private Integer payInNum;           // 收入笔数
    private Double payOutAmt;           // 总支出（元）
    private Integer payOutNum;          // 支出笔数
    private Double poundageAmt;         // 手续费（元）
    private Double initialBalanceAmt;   // 期初总余额
    private Double endingBalanceAmt;    // 期末总余额
    private String balanceState;        // 核算状态
    private Date balanceTime;           // 核算时间
    private String operator ;           // 操作人
    private Date operateTime;           // 操作时间
    private String operateStatus;       // 操作状态

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public String getCheckDate() {
        return checkDate;
    }

    public void setCheckDate(String checkDate) {
        this.checkDate = checkDate;
    }

    public String getCheckState() {
        return checkState;
    }

    public void setCheckState(String checkState) {
        this.checkState = checkState;
    }

    public String getSsoUserId() {
        return ssoUserId;
    }

    public void setSsoUserId(String ssoUserId) {
        this.ssoUserId = ssoUserId;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public Double getPayInAmt() {
        return payInAmt;
    }

    public void setPayInAmt(Double payInAmt) {
        this.payInAmt = payInAmt;
    }

    public Integer getPayInNum() {
        return payInNum;
    }

    public void setPayInNum(Integer payInNum) {
        this.payInNum = payInNum;
    }

    public Double getPayOutAmt() {
        return payOutAmt;
    }

    public void setPayOutAmt(Double payOutAmt) {
        this.payOutAmt = payOutAmt;
    }

    public Integer getPayOutNum() {
        return payOutNum;
    }

    public void setPayOutNum(Integer payOutNum) {
        this.payOutNum = payOutNum;
    }

    public Double getPoundageAmt() {
        return poundageAmt;
    }

    public void setPoundageAmt(Double poundageAmt) {
        this.poundageAmt = poundageAmt;
    }

    public Double getInitialBalanceAmt() {
        return initialBalanceAmt;
    }

    public void setInitialBalanceAmt(Double initialBalanceAmt) {
        this.initialBalanceAmt = initialBalanceAmt;
    }

    public Double getEndingBalanceAmt() {
        return endingBalanceAmt;
    }

    public void setEndingBalanceAmt(Double endingBalanceAmt) {
        this.endingBalanceAmt = endingBalanceAmt;
    }

    public String getBalanceState() {
        return balanceState;
    }

    public void setBalanceState(String balanceState) {
        this.balanceState = balanceState;
    }

    public Date getBalanceTime() {
        return balanceTime;
    }

    public void setBalanceTime(Date balanceTime) {
        this.balanceTime = balanceTime;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public Date getOperateTime() {
        return operateTime;
    }

    public void setOperateTime(Date operateTime) {
        this.operateTime = operateTime;
    }

    public String getOperateStatus() {
        return operateStatus;
    }

    public void setOperateStatus(String operateStatus) {
        this.operateStatus = operateStatus;
    }
}
