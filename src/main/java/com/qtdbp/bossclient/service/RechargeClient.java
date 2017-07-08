package com.qtdbp.bossclient.service;

import com.qtdbp.bossclient.base.Message;
import com.qtdbp.bossclient.model.RechargeBillModel;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by dell on 2017/7/8.
 */
@FeignClient(value = "${service.name}")
public interface RechargeClient {

    /**
     * 添加充值交易流水
     * @param model
     * @return
     */
    @RequestMapping(value = "/rechargeBill", method = RequestMethod.POST)
    Message addRechargeBill(@RequestBody RechargeBillModel model) ;

    /**
     * 充值成功回调
     * @param billModel
     * @return
     */
    @RequestMapping(value = "/recharge/success", method = RequestMethod.POST)
    Message rechargeSuccess(@RequestBody RechargeBillModel billModel);

}
