package com.zxw.coco.tcaught;


/**
 * Created by xiangwuzhu on 17/6/30.
 */

public class MyUnCaughtExceptionHandler implements Thread.UncaughtExceptionHandler{

    @Override
    public void uncaughtException(Thread thread, Throwable ex) {

        System.out.println(" Caught: "+ex);

    }
}
