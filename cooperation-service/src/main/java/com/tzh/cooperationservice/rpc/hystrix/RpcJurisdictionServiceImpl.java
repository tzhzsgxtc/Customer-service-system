package com.tzh.cooperationservice.rpc.hystrix;

import com.tzh.cooperationservice.rpc.RpcJurisdictionService;
import org.springframework.stereotype.Component;

/**
 * @author tzh
 * @date 2018/11/7
 */
@Component
public class RpcJurisdictionServiceImpl implements RpcJurisdictionService {
    @Override
    public String hi(String name) {
        return "出现错误"+name;
    }
}
