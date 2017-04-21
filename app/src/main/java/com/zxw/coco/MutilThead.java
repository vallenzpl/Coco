package com.zxw.coco;

/**
 * Created by xiangwuzhu on 16/10/9.
 */
public class MutilThead {

    class Test {
        volatile int i = 0, j = 0;

        void one() {
            i++;
            j++;
        }

        void two() {
            System.out.println("i=" + i + " j=" + j);
        }
    }

    public static void main(String[] args) {

    }


}
