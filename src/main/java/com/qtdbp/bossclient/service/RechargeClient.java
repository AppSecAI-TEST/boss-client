package com.qtdbp.bossclient.service;

import com.qtdbp.bossclient.base.Message;
import com.qtdbp.bossclient.model.RechargeBillModel;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

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
     * 充值成功同步回调
     * @param billModel
     * @return
     */
    @RequestMapping(value = "/recharge/returnUrl", method = RequestMethod.POST)
    Message rechargeReturnUrl(@RequestBody RechargeBillModel billModel);

    /**
     * 分页查询充值流水
     *
     * @param map
     * @return
     */
    @RequestMapping(value = "/api/recharge", method = RequestMethod.GET)
    public Message findRechargeBillsByCondition(@RequestParam Map<String, Object> map);

    /**
     * 押付成功回调
     * @param billModel
     * @return
     */
    @RequestMapping(value = "/pressPay/returnUrl", method = RequestMethod.POST)
    Message pressPayReturn(@RequestBody RechargeBillModel billModel);

    /**
     * 查询单条充值记录流水
     * @param sn
     * @return
     */
    @RequestMapping(value = "/recharge/one", method = RequestMethod.GET)
    Message findRechargeBySn(String sn) ;
}
