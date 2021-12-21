package com.just.handler;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PayHandlerChain  {

    private PayHandler header;


    public void handlePay(String code) {
        header.pay(code);
    }

    public PayHandlerChain(List<PayHandler> handlers) {
        for (int i = 0; i < handlers.size(); i++) {
            PayHandler payHandler = handlers.get(i);
            if (i != handlers.size() - 1) {
                payHandler.setNext(handlers.get(i + 1));
            }
        }
        header = handlers.get(0);
    }
}