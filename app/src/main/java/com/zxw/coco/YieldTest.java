package com.zxw.coco;

/**
 * Created by xiangwuzhu on 16/10/10.
 */
public class YieldTest {

    public static void main(String[] args) throws InterruptedException {
        // 创建线程对象
//        YieldThread t1 = new YieldThread("t1");
//        YieldThread t2 = new YieldThread("t2");
//        t1.start();
//        t2.start();
//        Thread.sleep(1000);
//        t1.interrupt();
//        t2.interrupt();


        JoinThread t1 = new JoinThread("t1");
        JoinThread t2 = new JoinThread("t2");
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("主线程开始执行！");
    }
}

class YieldThread extends Thread {
    int i = 0;

    public YieldThread(String name) {
        super(name);
    }

    public void run() {
        while (!isInterrupted()) {
            System.out.println(getName() + "执行了" + ++i + "次");
            if (i % 10 == 0) {// 当i能对10整除时，则让步
                Thread.yield();
            }
        }
    }
}


class JoinThread extends Thread {
    public JoinThread(String name) {
        super(name);
    }
    public void run() {
        for(int i = 1; i <= 10; i++)
            System.out.println(getName() + getId() + "执行了" + i + "次");
    }
}