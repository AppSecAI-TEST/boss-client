package com.qtdbp.bossclient.controller;

import com.qtdbp.bossclient.service.HiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: caidchen
 * @create: 2017-06-30 9:23
 * To change this template use File | Settings | File Templates.
 */
@RestController
public class HelloController {

    @Autowired
    private HiService schedualServiceHi;

//    @Autowired
//    private SchedualServiceHi schedualServiceHi;

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String sayHi(@RequestParam String name){
        return schedualServiceHi.sayHiFromClientOne(name);
    }
}
