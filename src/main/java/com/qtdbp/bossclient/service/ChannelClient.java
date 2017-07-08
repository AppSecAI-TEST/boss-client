package com.qtdbp.bossclient.service;


import com.qtdbp.bossclient.base.Message;
import com.qtdbp.bossclient.model.ChannelModel;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

/**
 * 渠道业务服务
 * Created by dell on 2017/7/5.
 */
@FeignClient(value = "${service.name}")
public interface ChannelClient {

    /**
     * 添加银行卡或者支付宝账号等渠道信息
     * @param model
     * @return
     */
    @RequestMapping(value = "/api/channel", method = RequestMethod.POST)
    Message addChannel(@RequestBody ChannelModel model) ;

    /**
     * 查询所有有效渠道
     * @return
     */
    @RequestMapping(value = "/api/channels", method = RequestMethod.GET)
    Message findAllChannels() ;

    /**
     * 根据渠道ID查询渠道信息
     * @param id
     * @return
     */
    @RequestMapping(value = "/api/channel", method = RequestMethod.GET)
    Message findChannelById(@RequestParam("id") String id) ;
}
