package com.qtdbp.bossclient.model;

import java.util.Date;

/**
 * 客户子账户实体表
 * Created by dell on 2017/7/4.
 */
public class SubAccountModel {

    private String id;
    private String ssoUserId;                     //用户编号
    private String accountType;            //子账户号类型
    private String userName;               //用户名
    private Double amount;                  //总金额
    private Double cashAmount;             //可提现金额
    private Double uncashAmount;           //不可提现金额
    private Double freezeCashAmount;      //可提现冻结金额
    private Double freezeUncashAmount;    //不可提现冻结金额
    private int accountProperty;           //账户性质
    private String state;                   //状态
    private Date createTime;               //创建时间
    private Double jixiBase;               //计息积数
    private Date lastTermJixiDate;       //上期计息的时间
    private Date lastUpdateTime;          //最新修改时间
    private Double lastTermAmount;        //上期总金额
    private String checkValue;             //校验码

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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

    public Double getFreezeCashAmount() {
        return freezeCashAmount;
    }

    public void setFreezeCashAmount(Double freezeCashAmount) {
        this.freezeCashAmount = freezeCashAmount;
    }

    public Double getFreezeUncashAmount() {
        return freezeUncashAmount;
    }

    public void setFreezeUncashAmount(Double freezeUncashAmount) {
        this.freezeUncashAmount = freezeUncashAmount;
    }

    public int getAccountProperty() {
        return accountProperty;
    }

    public void setAccountProperty(int accountProperty) {
        this.accountProperty = accountProperty;
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

    public Double getJixiBase() {
        return jixiBase;
    }

    public void setJixiBase(Double jixiBase) {
        this.jixiBase = jixiBase;
    }

    public Date getLastTermJixiDate() {
        return lastTermJixiDate;
    }

    public void setLastTermJixiDate(Date lastTermJixiDate) {
        this.lastTermJixiDate = lastTermJixiDate;
    }

    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public Double getLastTermAmount() {
        return lastTermAmount;
    }

    public void setLastTermAmount(Double lastTermAmount) {
        this.lastTermAmount = lastTermAmount;
    }

    public String getCheckValue() {
        return checkValue;
    }

    public void setCheckValue(String checkValue) {
        this.checkValue = checkValue;
    }
}
