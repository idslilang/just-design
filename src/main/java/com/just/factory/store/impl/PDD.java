package com.just.factory.store.impl;

import com.just.factory.store.CouponsService;

import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author: lilang
 * @version:
 * @modified By:1170370113@qq.com
 */
public class PDD implements CouponsService {


    public Map<String, String> getCoupons() {

        HashMap hashMap = new HashMap();
        hashMap.put("1","苹果手机");
        hashMap.put("2","华为手机");
        hashMap.put("3","小米手机");

        return null;
    }

    public int getType() {
        return 0;
    }
}
