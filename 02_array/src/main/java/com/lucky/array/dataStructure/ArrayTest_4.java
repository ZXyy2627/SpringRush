package com.lucky.array.dataStructure;

import java.util.Arrays;

public class ArrayTest_4 {
    public static void main(String[] args) {
        int[][] arr = HuiXingUtils.huiXing(11);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}
