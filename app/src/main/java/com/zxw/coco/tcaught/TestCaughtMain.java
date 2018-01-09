package com.zxw.coco.tcaught;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by xiangwuzhu on 17/6/30.
 */

public class TestCaughtMain {

    public static void main(String[] args) {

        Thread.setDefaultUncaughtExceptionHandler(new MyUnCaughtExceptionHandler());

//        ExecutorService executorService = Executors.newCachedThreadPool(new MyThreadFactory());
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(new ExceptionThread());

    }

}
