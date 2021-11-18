package com.just.abstracts.factory.impl;

import com.just.abstracts.factory.SportFactory;
import com.just.abstracts.products.Badminton;
import com.just.abstracts.products.Clothing;
import com.just.abstracts.products.impl.YNBadmintonImpl;
import com.just.abstracts.products.impl.YNClothingImpl;

/**
 * @description:
 * @author: lilang
 * @version:
 * @modified By:1170370113@qq.com
 */
public class YNSportFactoryImpl implements SportFactory {
    public Clothing createCloth() {
        return new YNClothingImpl();
    }

    public Badminton createBadminton() {
        return new YNBadmintonImpl();
    }
}
