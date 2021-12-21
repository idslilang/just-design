package com.just.Singleton;

/**
 * 饿汉模式，比较常用
 */
public class Singleton {
    private static final Singleton INSTANCE=new Singleton();

    //私有构造方法
    private Singleton(){
    }
    public static Singleton getInstance(){
        return INSTANCE;
    }
}

