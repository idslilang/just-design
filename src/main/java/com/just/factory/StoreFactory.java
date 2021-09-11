package com.just.factory;

import com.just.factory.store.CouponsService;
import com.just.factory.store.impl.JD;
import com.just.factory.store.impl.PDD;
import com.just.factory.store.impl.TAOBAO;

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
