package com.zxw.coco.thread;

/**
 * Created by xiangwuzhu on 16/10/13.
 */
public class SecondThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("this is " + i + " !");
            try {
                this.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
