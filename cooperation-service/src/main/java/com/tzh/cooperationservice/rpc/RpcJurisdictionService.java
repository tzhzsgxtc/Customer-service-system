package com.tzh.cooperationservice.rpc;

import com.tzh.cooperationservice.rpc.hystrix.RpcJurisdictionServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author tzh
 * @date 2018/11/7
 */
@FeignClient(value = "jurisdiction-service",fallback =RpcJurisdictionServiceImpl.class )
public interface RpcJurisdictionService {
    @GetMapping("in")
    String hi(@RequestParam(value = "name",defaultValue = "tzh") String name);
}
