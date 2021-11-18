package com.just.abstracts.factory;

import com.just.abstracts.products.Badminton;
import com.just.abstracts.products.Clothing;

/**
 * @description: 运动工厂
 * @author: lilang
 * @version:
 * @modified By:1170370113@qq.com
 */
public interface SportFactory {

    Clothing createCloth();

    Badminton createBadminton();
}
