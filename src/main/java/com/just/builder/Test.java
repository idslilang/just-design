package com.just.builder;

/**
 * @description:
 * @author: lilang
 * @version:
 * @modified By:1170370113@qq.com
 */
public class Test {
    public static void main(String[] args) {
        UserInfo userInfo = new UserInfo.Builder()
                                        .setAddress("深圳市")
                                        .setSex("F")
                                        //....
                                        .build();
    }
}
