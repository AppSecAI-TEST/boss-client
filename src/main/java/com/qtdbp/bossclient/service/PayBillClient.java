package com.qtdbp.bossclient.service;


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

    @RequestMapping(value = "/payBill", method = RequestMethod.POST)
    Integer insertPayBill(@RequestBody PayBillModel payBillModel) ;

    @RequestMapping(value = "/payBill/update", method = RequestMethod.POST)
    Integer updatePayBill(@RequestBody PayBillModel payBillModel) ;

}
