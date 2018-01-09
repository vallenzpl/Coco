package com.zxw.coco.tcaught;

/**
 * Created by xiangwuzhu on 17/6/30.
 */

public class ExceptionThread extends Thread{



    @Override
    public void run() {
        Thread thread = currentThread();

        System.out.println(" thread = "+thread);
        System.out.println(" thread = "+thread.getId());

        throw new RuntimeException();

    }
}
