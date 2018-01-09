package com.zxw.coco.tcaught;

import android.support.annotation.NonNull;

import java.util.concurrent.ThreadFactory;

/**
 * Created by xiangwuzhu on 17/6/30.
 */

public class MyThreadFactory implements ThreadFactory{

    @Override
    public Thread newThread(@NonNull Runnable r) {

        Thread thread = new Thread(r);
        thread.setUncaughtExceptionHandler(new MyUnCaughtExceptionHandler());
        System.out.println("MyThreadFactory set" );

        return thread;
    }
}
