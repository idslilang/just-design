package com.just.abstracts.factory.impl;

import com.just.abstracts.factory.SportFactory;
import com.just.abstracts.products.Badminton;
import com.just.abstracts.products.Clothing;
import com.just.abstracts.products.impl.LNBadmintonImpl;
import com.just.abstracts.products.impl.LNClothingImpl;

/**
 * @description:
 * @author: lilang
 * @version:
 * @modified By:1170370113@qq.com
 */
public class LNSportFactoryImpl implements SportFactory {
    public Clothing createCloth() {
        return new LNClothingImpl();
    }

    public Badminton createBadminton() {
        return new LNBadmintonImpl();
    }
}
