package com.qianfeng.Case;

import java.util.Arrays;
import java.util.Random;

public class Array {
    public static void main(String[] args) {
        Random r = new Random();

        int[] ints = new int[50];

        for (int i = 0; i < ints.length; i++) {
            ints[i] = r.nextInt(10) * 10;
        }
        System.out.println(Arrays.toString(ints));
        System.out.println(789);
        System.out.println("push" + 1);
        System.out.println(789 + "linyun");
        System.out.println("琳韵");
        System.out.println("码云——pull");
        System.out.println("码云——push");

    }
}
