package com.zxw.coco.thread;

import java.util.HashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by xiangwuzhu on 16/10/13.
 */
public class Business {

    private HashMap<Integer, String> maps = new HashMap<>();
    private Lock lock = new ReentrantLock();

    public Business() {
        maps.put(0, "abc");
        maps.put(1, "ddn");
        maps.put(2, "人类礼物");
        maps.put(3, "结果客服");
        maps.put(4, "弱来上课");
        maps.put(5, "管理任务");
    }

    public String getData(int index) {
        if (maps.isEmpty()) return null;
        if (index >= maps.size()) index = maps.size() - 1;
        if (index < 0) index = 0;

//        while (maps.isEmpty()) {
//            try {
//                this.wait();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("获取第" + index + "个的值：" + maps.get(index));
        return maps.get(index);
    }

    public void updateData() {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < 5; i++) {
            maps.put(i, "新增" + i);
        }

        System.out.println("当前更新第" + 5 + "个的值：" + maps.get(4));
    }

}
