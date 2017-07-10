package com.qtdbp.bossclient.service;

import com.qtdbp.bossclient.base.Message;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 短信接口客户端
 *
 * @author: caidchen
 * @create: 2017-07-10 9:03
 * To change this template use File | Settings | File Templates.
 */
@FeignClient(value = "${service.name}")
public interface SmsClient {

    /**
     * 发送短信接口，默认有效期60s
     * @param mobile 手机号
     * @return
     */
    /*@RequestMapping(value = "/api/sms", method = RequestMethod.POST)
    Message sendSms(@RequestParam("mobile") String mobile) ;*/

    /**
     * 发送短信接口
     * @param mobile 手机号
     * @param expire 有效期，单位：秒
     * @return
     */
    @RequestMapping(value = "/api/sms", method = RequestMethod.POST)
    Message sendSms(@RequestParam("mobile") String mobile,@RequestParam("expire") int expire) ;


    /**
     * 获取短信验证码
     * @param mobile
     * @return
     */
    @RequestMapping(value = "/api/sms/code", method = RequestMethod.GET)
    Message getSmsCode(@RequestParam("mobile") String mobile) ;
}
