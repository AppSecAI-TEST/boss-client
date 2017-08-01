package com.qtdbp.bossclient.service;

import com.qtdbp.bossclient.base.Message;
import com.qtdbp.bossclient.model.AdjustBillModel;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * Created by dell on 2017/8/1.
 */
@FeignClient(value = "${service.name}")
public interface AdjustBillClient {

    /**
     * 定制服务结算业务
     * @param map
     * @return
     */
    @RequestMapping(value = "/settlement", method = RequestMethod.GET)
    Message customServiceSettlement(@RequestParam Map<String, Object> map);
}
