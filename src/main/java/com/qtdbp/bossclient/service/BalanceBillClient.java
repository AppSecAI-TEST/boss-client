package com.qtdbp.bossclient.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * 客户对账单
 * Created by dell on 2017/8/1.
 */
@FeignClient(value = "${service.name}")
public interface BalanceBillClient {

    /**
     * 异步核算指定日期的服务商对账单接口
     * @param ssoUserIds 服务商ID列表
     * #@param checkDate 结算日期（T+1），格式：2017-05-25
     * @return
     */
    @RequestMapping(value = "/api/balanceBill/audit/async", method = RequestMethod.POST)
    void auditBalanceBillAsync(@RequestParam("ssoIds") List<String> ssoUserIds);
}
