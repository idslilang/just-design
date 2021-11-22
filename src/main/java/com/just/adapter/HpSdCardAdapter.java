package com.just.adapter;

/**
 * @description:
 * @author: lilang
 * @version:
 * @modified By:1170370113@qq.com
 */
public class HpSdCardAdapter implements SdCard {

    private HpSdCard hpSdCard;


    public HpSdCardAdapter(HpSdCard hpSdCard) {
        this.hpSdCard = hpSdCard;
    }

    public String read() {
        return hpSdCard.hpRead();
    }

    public void write(String content) {
        hpSdCard.hpWrite(content);
    }
}
