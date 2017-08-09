package com.qtdbp.bossclient.service;

import com.qtdbp.bossclient.base.Message;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

/**
 * 客户对账单
 * Created by dell on 2017/8/1.
 */
@FeignClient(value = "${service.name}")
public interface BalanceBillClient {

    /**
     * 同步核算指定日期的服务商对账单接口
     * @param map
     *          ssoUserIds 服务商ID列表
     *          checkDate 结算日期（T+1），格式：2017-05-25
     *          balanceState 结算对账状态，默认null所有，00未对账，10一次结算，11二次结算
     * @return
     */
    @RequestMapping(value = "/api/balanceBill/audit", method = RequestMethod.POST)
    Message auditBalanceBill(@RequestBody Map<String, Object> map) ;

    /**
     * 异步核算当前时间前一日的服务商对账单接口（定时任务调用）
     * @param map
     *          ssoUserIds 服务商ID列表
     *          balanceState 结算对账状态，默认null所有，00未对账，10一次结算，11二次结算
     * @return
     */
    @RequestMapping(value = "/api/balanceBill/audit/async", method = RequestMethod.POST)
    void auditBalanceBillAsyncLastDate(@RequestBody Map<String, Object> map) ;

    /**
     * 异步核算指定日期的服务商对账单接口
     *
     * @param map
     * @return
     */
    @RequestMapping(value = "/api/balanceBill/audit/date/async", method = RequestMethod.POST)
    Message auditBalanceBillAsync(@RequestBody Map<String, Object> map);
}
