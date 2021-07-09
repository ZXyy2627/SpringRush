package com.lucky.array.dataStructure;

import java.util.Arrays;

/**
 * 实现ArrayTest_7 中arr2对arr1的复制
 * 数组的复制
 */
public class ArrayTest_7 {
    public static void main(String[] args) {
        int[] arr1,arr2;
        arr1 = new int[]{2, 3, 5, 7, 11, 13, 17, 19};

        System.out.println("arr1:"+Arrays.toString(arr1));

        arr2 = new int[arr1.length];
        for (int i = 0; i < arr2.length; i++) {
            if (i % 2 == 0) {
                arr2[i] = i;
            }
            arr2[i] = arr1[i];
        }

        System.out.println("arr1"+Arrays.toString(arr1));
        System.out.println("arr2"+Arrays.toString(arr2));

    }
}
