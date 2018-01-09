package com.zxw.coco;

/**
 * Created by xiangwuzhu on 16/10/9.
 */
public class ConsDemo {

    private static String name;  //declare name attribute
    private static int age; // delcare age attribute

    public static void tell() {
        System.out.println("name: " + name + ",age: " + age);
    }

    private static final String AGENT_DOMESTIC = "&";
    private static final String AGENT_OVERSEA = "$";
    private static final String AGENT_ALL = "*";


    public static void main(String[] args) {
        String s = "$";
        System.out.println(s.equals(AGENT_OVERSEA));
    }

}
