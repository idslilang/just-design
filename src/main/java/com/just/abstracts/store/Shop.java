package com.just.abstracts.store;

import com.just.abstracts.factory.SportFactory;
import com.just.abstracts.products.Badminton;
import com.just.abstracts.products.Clothing;

/**
 * @description:
 * @author: lilang
 * @version:
 * @modified By:1170370113@qq.com
 */
public class Shop {
    SportFactory sportFactory;

    public Shop(SportFactory sportFactory) {
        this.sportFactory = sportFactory;
    }

    public Badminton sallBadminton(){
        return  sportFactory.createBadminton();
    }

    public Clothing sallClothing(){
        return  sportFactory.createCloth();
    }
}
