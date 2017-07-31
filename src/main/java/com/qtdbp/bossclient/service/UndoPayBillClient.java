package com.qtdbp.bossclient.service;

import com.qtdbp.bossclient.base.Message;
import com.qtdbp.bossclient.model.UndoPayBillModel;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by dell on 2017/7/31.
 */
@FeignClient(value = "${service.name}")
public interface UndoPayBillClient {

    /**
     * 新增撤销交易充值流水
     *
     * @param model
     * @return
     */
    @RequestMapping(value = "/undoPayBill", method = RequestMethod.POST)
    Message insertUndoPayBill(@RequestBody UndoPayBillModel model);


}
