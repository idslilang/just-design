package com.just.decorator;

/**
 * @description:
 * @author: lilang
 * @version:
 * @modified By:1170370113@qq.com
 */
public class SDBikeDecorator implements Bike {


    private SDBike sdBike;

    public SDBikeDecorator(SDBike sdBike) {
        this.sdBike = sdBike;
    }


    public void drive() {
        System.out.println("我正在放着音乐");
        sdBike.drive();
        System.out.println("我正在载着朋友");
    }
}
