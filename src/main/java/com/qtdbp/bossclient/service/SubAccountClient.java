package com.qtdbp.bossclient.service;

import com.qtdbp.bossclient.base.Message;
import com.qtdbp.bossclient.model.BalanceBillModel;
import com.qtdbp.bossclient.model.SubAccountBalanceModel;
import com.qtdbp.bossclient.model.SubAccountSeqModel;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * Created by dell on 2017/7/10.
 */
@FeignClient(value = "${service.name}")
public interface SubAccountClient {

    /**
     * 查询当前用户的账户信息
     *
     * @param ssoUserId
     * @return
     */
    @RequestMapping(value = "/subAccount/info", method = RequestMethod.GET)
    Message findSubAccountInfo(@RequestParam("ssoUserId") String ssoUserId);

    /**
     * 分页查询用户资金变动流水信息
     *
     * @param model
     * @return
     */
    @RequestMapping(value = "/subAccount/details", method = RequestMethod.POST)
    Message findAccountSeq(@RequestBody SubAccountSeqModel model);

    /**
     * 分页查询客户结算对账
     *
     * @param map
     * @return
     */
    @RequestMapping(value = "/subAccount/balance", method = RequestMethod.GET)
    Message findSubAccountBalanceByCondition(@RequestParam Map<String, Object> map);

    /**
     * 分页查询客户对账结算明细
     *
     * @param map
     * @return
     */
    @RequestMapping(value = "/subAccount/balance/bill", method = RequestMethod.GET)
    Message findBalanceBillByCondition(@RequestParam Map<String, Object> map);


    /**
     * 根据服务商ID分页查询结算完成并且对账成功的信息
     * @param map
     * @return
     */
    @RequestMapping(value = "/subAccount/balance/settle", method = RequestMethod.GET)
    Message findSubAccountBalanceByIdAndSuccess(@RequestParam Map<String, Object> map);

}
