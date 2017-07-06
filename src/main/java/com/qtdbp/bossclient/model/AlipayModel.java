package com.qtdbp.bossclient.model;

import java.math.BigDecimal;

/**
 * alipay支付实体类
 * Created by liyang on 2017/4/25.
 */
public class AlipayModel {

    private String returnUrl;//回调地址

    private String orderNo;//订单号

    private BigDecimal amount;//支付金额

    private String subject;//订单名称

    private String body;// 商品描述，可空

    public String getReturnUrl() {
        return returnUrl;
    }

    public void setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
