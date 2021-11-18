package com.just.test;

import com.just.simple.factory.StoreFactory;
import com.just.simple.factory.store.CouponsService;
import com.just.simple.factory.store.impl.TAOBAO;
import org.junit.Test;

/**
 * @description:
 * @author: lilang
 * @version:
 * @modified By:1170370113@qq.com
 */
public class FacoryTest {

    @Test
    public void  testFactory() throws InstantiationException, IllegalAccessException {
        StoreFactory storeFactory = new StoreFactory();

        CouponsService couponsService = storeFactory.getCouponsService("JD");

        System.out.println(couponsService.getCoupons());

        CouponsService taobao= storeFactory.getCouponsService(TAOBAO.class);

        System.out.println(taobao.getCoupons());


    }
}
