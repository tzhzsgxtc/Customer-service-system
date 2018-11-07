package com.tzh.cooperationservice.web;

import com.netflix.discovery.converters.Auto;
import com.tzh.cooperationservice.rpc.RpcJurisdictionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tzh
 * @date 2018/11/7
 */
@RestController
public class InfoController {
    @Autowired
    RpcJurisdictionService rpcJurisdictionService;

    @RequestMapping("test")
    public String test(){
        return "调用结果："+rpcJurisdictionService.hi("tzh");
    }
}
