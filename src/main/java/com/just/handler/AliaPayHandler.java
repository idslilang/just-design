package com.just.handler;

import org.springframework.stereotype.Service;

@Service
public class AliaPayHandler extends PayHandler {


    @Override
    public void pay(String code) {
        if ("alipay".equals(code)) {
            System.out.println("===发起支付宝支付===");
        } else {
            getNext().pay(code);
        }
    }

}