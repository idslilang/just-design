package com.just.controller;

import com.just.handler.PayHandlerChain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    PayHandlerChain payHandlerChain;


    @RequestMapping("/pay")
    public String testPay(@RequestParam("code") String code) {
        payHandlerChain.handlePay(code);
        return "ok!";
    }
}
