package com.qtdbp.bossclient.service;

import com.qtdbp.bossclient.base.Message;
import com.qtdbp.bossclient.model.SubAccountSeqModel;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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
}
