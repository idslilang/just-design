package com.just.proxy.statics;

import com.just.proxy.SellTick;

/**
 * @description:
 * @author: lilang
 * @version:
 * @modified By:1170370113@qq.com
 */
public class TrainProxy implements SellTick {

    private SellTick sellTick;

    public TrainProxy(SellTick sellTick) {
        this.sellTick = sellTick;
    }

    public void sall() {
        System.out.println("我是代理商卖票");
        this.sellTick.sall();
        System.out.println("代理商卖票结束");
    }
}
