package com.just.handler;


import lombok.Getter;
import lombok.Setter;

public abstract class PayHandler {
    @Getter
    @Setter
    protected PayHandler next;

    public abstract void pay(String pay);
}
