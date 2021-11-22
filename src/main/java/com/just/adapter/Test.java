package com.just.adapter;

/**
 * @description:
 * @author: lilang
 * @version:
 * @modified By:1170370113@qq.com
 */
public class Test {

    public static void main(String[] args) {
        SdCard sdCard = new DzSdCardAdapter(new DzSdCard());
        System.out.println(sdCard.read());
        sdCard.write("写入东芝sd卡内容");
    }
}
