package com.just.factory.store;

import java.util.Map;

/**
 * @description:
 * @author: lilang
 *
 * @version:
 * @modified By:1170370113@qq.com
 */
public interface CouponsService {

    /**
     * 返回获得的优惠信息，key：表示ID，value 表示物品
     * @return
     */
    public Map<String, String> getCoupons();

    /**
     * 平台类型
     * @return
     */
    public int getType();
}
