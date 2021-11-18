package com.just.abstracts.test;

import com.just.abstracts.factory.impl.LNSportFactoryImpl;
import com.just.abstracts.store.Shop;

/**
 * @description:
 * @author: lilang
 * @version:
 * @modified By:1170370113@qq.com
 */
public class demo {


    public static void main(String[] args) {

        Shop sportFactory =new Shop(new LNSportFactoryImpl());
        System.out.println(sportFactory.sallBadminton().getName());
        System.out.println(sportFactory.sallBadminton().getAddress());
        System.out.println(sportFactory.sallClothing().getName());
        System.out.println(sportFactory.sallClothing().getAddress());
    }


}
