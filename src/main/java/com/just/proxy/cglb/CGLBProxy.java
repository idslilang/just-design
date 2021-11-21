package com.just.proxy.cglb;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @description:
 * @author: lilang
 * @version:
 * @modified By:1170370113@qq.com
 */
public class CGLBProxy implements MethodInterceptor {

    private Object target;//维护一个目标对象

    public CGLBProxy(Object target) {
        this.target = target;
    }

    public Object  getProxyInstance(){

        Enhancer enhancer = new Enhancer();

        enhancer.setSuperclass(target.getClass());

        enhancer.setCallback(this);

        return enhancer.create();
    }

    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("开启事务");

        Object returnValue = method.invoke(target, args);

        System.out.println("关闭事务");

        return returnValue;

    }
}
