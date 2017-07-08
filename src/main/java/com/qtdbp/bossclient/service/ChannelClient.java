package com.qtdbp.bossclient.service;


import com.qtdbp.bossclient.base.Message;
import com.qtdbp.bossclient.model.ChannelModel;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 渠道业务服务
 * Created by dell on 2017/7/5.
 */
@FeignClient(value = "boss-service")
public interface ChannelClient {

    /**
     * 添加银行卡或者支付宝账号等渠道信息
     * @param model
     * @return
     */
    @RequestMapping(value = "/api/channel", method = RequestMethod.POST)
    Message addChannel(@RequestBody ChannelModel model) ;

    @RequestMapping(value = "/api/channel", method = RequestMethod.GET)
    Message findAllChannels() ;

    @RequestMapping(value = "/api/channel/{id}", method = RequestMethod.GET)
    Message findChannelById(@PathVariable("id") String id) ;
}
