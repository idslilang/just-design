package com.just.simple.factory;

import com.just.simple.factory.store.CouponsService;
import com.just.simple.factory.store.impl.JD;
import com.just.simple.factory.store.impl.PDD;
import com.just.simple.factory.store.impl.TAOBAO;

/**
 * @description:
 * @author: lilang
 * @version:
 * @modified By:1170370113@qq.com
 */
public class StoreFactory {


    public CouponsService getCouponsService(String name) {

        if ("PDD".equals(name)) {

            return new PDD();
        }

        if ("JD".equals(name)) {
            return new JD();
        }

        if ("TAOBAO".equals(name)) {
            return new TAOBAO();
        }

        return null;

    }


    public CouponsService getCouponsService(Class<? extends CouponsService> clazz) throws IllegalAccessException, InstantiationException {

        if (clazz == null) return null;

        return clazz.newInstance();

    }


}
