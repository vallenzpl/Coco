package com.zxw.coco.thread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by xiangwuzhu on 16/10/13.
 */
public class MyThreadTest {

    static Business business = new Business();
    static Lock lock = new ReentrantLock();
    static Condition condition = lock.newCondition();

    static class AddThread extends Thread {
        @Override
        public void run() {
            lock.lock();

            business.updateData();
            lock.unlock();
        }
    }

    static class GetThread extends Thread {
        @Override
        public void run() {

            lock.lock();
            for (int j = 0; j < 5; j++) {
                business.getData(j);
            }
            lock.unlock();
        }
    }


    public static void main(String[] args) {
        AddThread addThread = new AddThread();
        GetThread getThread = new GetThread();

        addThread.start();
        getThread.start();

//        System.out.println("start");
//        SecondThread secondThread = new SecondThread();
//        secondThread.start();
//        try {
//            System.out.println("try");
//            secondThread.sleep(2000);
//        } catch (InterruptedException e) {
//            System.out.println("InterruptedException !!!");
//            e.printStackTrace();
//        }

        System.out.println(" --- main end --- ");

    }

}
