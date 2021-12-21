package com.just.Singleton;

/**
 * 懒汉模式，线程安全版本
 */
public class Singleton4 {
    private static volatile Singleton4 INSTANCE;

    private Singleton4(){}

    public static Singleton4 getInstance(){
        if(INSTANCE == null){
            //即使多个线程同时走到了这里，只有一个线程先执行以下同步代码块
            synchronized (Singleton4.class){
                //当第二个线程走到这里，实例已经初始化将不会再次执行以下if代码块
                if(INSTANCE == null){
                    INSTANCE=new Singleton4();
                }
            }
        }
        return INSTANCE;
    }
}
