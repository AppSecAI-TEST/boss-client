package com.qtdbp.bossclient.service;


import com.qtdbp.bossclient.base.Message;
import com.qtdbp.bossclient.model.WithdrawBillModel;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * 提现流程
 * Created by dell on 2017/7/5.
 */
@FeignClient(value = "${service.name}")
public interface WithdrawBillClient {

    /**
     * 添加提现申请
     * @param model
     * @return
     */
    @RequestMapping(value = "/api/withdraw", method = RequestMethod.POST)
    Message addWithdraw(@RequestBody WithdrawBillModel model) ;

    /**
     * 分页查询提现流水
     * @param map
     * @return
     */
    @RequestMapping(value = "/api/withdraws", method = RequestMethod.GET)
    Message findWithdrawBillsByCondtion(@RequestParam Map<String, Object> map) ;

    /**
     * 单笔转账
     * @param sn
     * @return
     */
    @RequestMapping(value = "/api/transfer/account", method = RequestMethod.POST)
    Message singleTransferAccounts(@RequestParam("sn") String sn) ;

}