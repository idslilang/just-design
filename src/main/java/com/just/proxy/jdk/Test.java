package com.just.proxy.jdk;

import com.just.proxy.SellTick;
import com.just.proxy.impl.TrainStation;

import java.lang.reflect.Proxy;

/**
 * @description:
 * @author: lilang
 * @version:
 * @modified By:1170370113@qq.com
 */
public class Test {
    public static void main(String[] args) {

        SellTick sellTickJdkProxy = (SellTick) Proxy.newProxyInstance(SellTick.class.getClassLoader(),new Class[]{SellTick.class},new JDKProxy(new TrainStation()));
        sellTickJdkProxy.sall();

    }
}
