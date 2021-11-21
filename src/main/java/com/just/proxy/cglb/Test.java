package com.just.proxy.cglb;

import com.just.proxy.UserDao;

/**
 * @description:
 * @author: lilang
 * @version:
 * @modified By:1170370113@qq.com
 */
public class Test {
    public static void main(String[] args) {

        UserDao userDao = (UserDao) new CGLBProxy(new UserDao()).getProxyInstance();
        System.out.println(userDao.save());

    }
}
