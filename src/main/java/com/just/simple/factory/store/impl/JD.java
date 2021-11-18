package com.just.simple.factory.store.impl;

import com.just.simple.factory.store.CouponsService;

import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author: lilang
 * @version:
 * @modified By:1170370113@qq.com
 */
public class JD implements CouponsService {


    public Map<String, String> getCoupons() {

        HashMap hashMap = new HashMap();
        hashMap.put("1", "IKBC键盘");
        hashMap.put("2", "OPPO蓝牙耳机");
        hashMap.put("3", "OPPO蓝牙手表");
        return hashMap;
    }

    public int getType() {
        return 3;
    }
}
