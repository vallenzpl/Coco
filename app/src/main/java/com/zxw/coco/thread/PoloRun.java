package com.zxw.coco.thread;

/**
 * Created by xiangwuzhu on 16/10/14.
 */
public class PoloRun implements Runnable {
    private int index;

    public PoloRun(int index) {
        this.index = index;
    }

    @Override
    public void run() {
        for (int j = 0; j < 5; j++) {
            System.out.println(" -- 第 " + index + " 个线程 -- " + j);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
