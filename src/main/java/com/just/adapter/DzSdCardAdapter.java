package com.just.adapter;

/**
 * @description:
 * @author: lilang
 * @version:
 * @modified By:1170370113@qq.com
 */
public class DzSdCardAdapter implements SdCard {

    private DzSdCard dzSdCard;

    public DzSdCardAdapter(DzSdCard dzSdCard) {
        this.dzSdCard = dzSdCard;
    }

    public String read() {
        return dzSdCard.dzRead();
    }

    public void write(String content) {
        dzSdCard.dzWrite(content);
    }
}
