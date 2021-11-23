package com.just.decorator;

/**
 * @description:
 * @author: lilang
 * @version:
 * @modified By:1170370113@qq.com
 */
public class Test {

    public static void main(String[] args) {
        SDBikeDecorator decorator = new SDBikeDecorator(new SDBike());

        decorator.drive();
    }
}
