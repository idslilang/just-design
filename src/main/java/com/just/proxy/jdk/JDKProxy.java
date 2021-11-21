package com.just.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @description:
 * @author: lilang
 * @version:
 * @modified By:1170370113@qq.com
 */
public class JDKProxy implements InvocationHandler {

    private Object object;

    public JDKProxy(Object object) {
        this.object = object;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("我使用jdk 动态代理卖票啦");

        Object res = method.invoke(object, args);

        System.out.println("我使用jdk 动态代理卖票结束啦");

        return res;

    }
}
