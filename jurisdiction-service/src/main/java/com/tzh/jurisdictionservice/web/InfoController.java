package com.tzh.jurisdictionservice.web;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tzh
 * @date 2018/11/7
 */
@RestController
@Api(description = "测试")
public class InfoController {
    @GetMapping("/in")
    @ApiOperation(value = "test")
    public String in(@RequestParam String name){
        return name+"hi！";
    }
}
