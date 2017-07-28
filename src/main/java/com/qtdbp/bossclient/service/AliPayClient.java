package com.qtdbp.bossclient.service;

import com.qtdbp.bossclient.model.AlipayModel;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by dell on 2017/7/3.
 */
@FeignClient(value = "${service.name}")
public interface AliPayClient {

    /**
     * 调用支付接口
     */
    @RequestMapping(value = "/alipayapi", method = RequestMethod.POST)
    ModelMap openAliPay(@RequestBody AlipayModel alipayModel) ;

    /**
     * 调用充值接口
     */
    @RequestMapping(value = "/alipayapi/recharge", method = RequestMethod.POST)
    ModelMap openAlipayRecharge(@RequestBody AlipayModel alipayModel);

    /**
     * 调用押付接口
     */
    @RequestMapping(value = "/alipayapi/pressPay", method = RequestMethod.POST)
    ModelMap openAlipayPressPay(@RequestBody AlipayModel alipayModel);

}
