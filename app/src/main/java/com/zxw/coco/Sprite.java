package com.zxw.coco;

/**
 * Created by xiangwuzhu on 16/6/12.
 */
public class Sprite {

    public static native String getResult();

    static {
        System.loadLibrary("sprite-jni");
    }
}
