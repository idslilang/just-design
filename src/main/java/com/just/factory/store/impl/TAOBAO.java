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
public class TAOBAO implements CouponsService {
    public Map<String, String> getCoupons() {
        HashMap hashMap = new HashMap();
        hashMap.put("1", "卫龙辣条");
        hashMap.put("2", "大闸蟹");
        hashMap.put("3", "湛江生蚝");
        return hashMap;

    }

    public int getType() {
        return 1;
    }
}
