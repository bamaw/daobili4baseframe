package com.daobili.modules.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author bamaw
 * @Date 2020-12-08  16:46
 * @Description 用户控制器接口
 */
@Api("用户类接口")
@RestController
@RequestMapping("/user")
public class HelloController {

    @ApiOperation("查询用户")
    @GetMapping("/")
    public String findOne() {
        return "hello";
    }


}
