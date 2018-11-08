package com.tzh.cooperationservice.web;

import com.netflix.discovery.converters.Auto;
import com.tzh.cooperationservice.rpc.RpcJurisdictionService;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tzh
 * @date 2018/11/7
 */
@RestController
@Reference
public class InfoController {
    @Autowired
    RpcJurisdictionService rpcJurisdictionService;
    @Value("${oo}")
    String type;
    @RequestMapping("ss")
    public String ss(){
        return type;
    }
    @RequestMapping("test")
    public String test(){
        return "调用结果："+rpcJurisdictionService.hi("tzh");
    }
}
