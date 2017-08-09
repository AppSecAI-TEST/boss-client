package com.qtdbp.bossclient.service;

import com.qtdbp.bossclient.base.Message;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * 渠道对账单
 * Created by dell on 2017/8/1.
 */
@FeignClient(value = "${service.name}")
public interface ChannelCheckClient {

    /**
     * 下载渠道对账单
     * 目前支持支付宝
     * @param channelId
     * @param checkDate 格式：2017-07-25
     * @return
     */
    @RequestMapping(value = "/api/download/bill", method = RequestMethod.POST)
    Message downloadChannelCheck(@RequestParam("id") String channelId,
                                 @RequestParam("date") String checkDate) ;

    /**
     * 批量下载渠道对账单
     * 目前支持支付宝
     * @param channelId
     * @param beginDate 开始时间，格式：2017-07-04
     * @param endDate   结束时间，格式：2017-07-05
     * @return
     */
    @RequestMapping(value = "/api/batch/download/bill", method = RequestMethod.POST)
    Message downloadChannelCheckForDateZone(@RequestParam("id") String channelId,
                                                   @RequestParam("begin") String beginDate,
                                                   @RequestParam("end") String endDate) ;

    /**
     * 异步下载渠道对账单
     * 目前支持支付宝
     * @param channelId
     * @param checkDate
     * @return
     */
    @RequestMapping(value = "/api/download/bill/async/date", method = RequestMethod.POST)
    void downloadChannelCheckAsync(@RequestParam("id") String channelId,
                                      @RequestParam("date") String checkDate) ;

    /**
     * 异步下载渠道对账单
     * 目前支持支付宝
     * @param channelId
     * @return
     */
    @RequestMapping(value = "/api/download/bill/async", method = RequestMethod.POST)
    void downloadChannelCheckAsync(@RequestParam("id") String channelId) ;

    /**
     * 异步批量下载渠道对账单
     * 目前支持支付宝
     * @param channelId
     * @param beginDate 开始时间，格式：2017-07-04
     * @param endDate   结束时间，格式：2017-07-05
     * @return
     */
    @RequestMapping(value = "/api/batch/download/bill/async", method = RequestMethod.POST)
    void downloadChannelCheckForDateZoneAsync(@RequestParam("id") String channelId,
                                                @RequestParam("begin") String beginDate,
                                                @RequestParam("end") String endDate) ;

    /**
     * 分页查询渠道对账单
     * @param map
     * @return
     */
    @RequestMapping(value = "/api/checkbill", method = RequestMethod.GET)
    Message findAllChannelCheckByCondtion(@RequestParam Map<String, Object> map) ;

    /**
     * 分页查询渠道对账单明细
     * @param map
     * @return
     */
    @RequestMapping(value = "/api/checkbill/detail", method = RequestMethod.GET)
    Message findAllChannelCheckBillByCondtion(@RequestParam Map<String, Object> map) ;
}
