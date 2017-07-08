package com.qtdbp.bossclient.service;


import com.qtdbp.bossclient.base.Message;
import com.qtdbp.bossclient.model.PayBillModel;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by dell on 2017/7/5.
 */
@FeignClient(value = "${service.name}")
public interface PayBillClient {

    /**
     * 添加交易支付流水
     * @param payBillModel
     * @return
     */
    @RequestMapping(value = "/payBill", method = RequestMethod.POST)
    Message insertPayBill(@RequestBody PayBillModel payBillModel) ;

    /**
     *  更新交易支付流水
     * @param payBillModel
     * @return
     */
    @RequestMapping(value = "/payBill/update", method = RequestMethod.POST)
    Message updatePayBill(@RequestBody PayBillModel payBillModel) ;

}
