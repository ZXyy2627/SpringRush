package com.lucky.array.dataStructure;

import java.util.Arrays;

/**
 * 数组的复制，反转
 */
public class ArrayTest_8 {
    public static void main(String[] args) {
        String[] arr1 = new String[]{"aa","bb","cc","dd","ee","ff"};
        //数组的复制
        String[] arr2 = new String[arr1.length];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = arr1[i];
        }
        System.out.println(Arrays.toString(arr2));

        //数组的反转
        //数组的反转就使用两个变量的交换
        for (int i = 0; i < arr1.length/2; i++) {
            String temp = arr1[i];
            arr1[i] = arr1[arr1.length-i-1];
            arr1[arr1.length-i-1] = temp;
        }
        System.out.println(Arrays.toString(arr1));


    }
}
