package com.zxw.coco.thread;

/**
 * Created by xiangwuzhu on 16/10/14.
 */
public class TestDemo2 {
    public static void main(String[] args) {
//        Runnable tr = new TestRunnable();
//        Thread thread = new Thread(tr);
//        thread.setDaemon(true); //设置守护线程
//        thread.start(); //开始执行分进程

//        String f = "21.537544";



        int[] a = {21, 54, 43, 64, 12, 66,3};
        System.out.println(directSort(a));

    }


    public static int[] directSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int j;
            int temp = arr[i];
            for (j = i-1; j >= 0; j--) {

                if (arr[j] > temp) {
                    break;
                } else {
                    arr[j+1] = arr[j];
                }
            }
            arr[j+1] = temp;

        }
        return arr;
    }
}