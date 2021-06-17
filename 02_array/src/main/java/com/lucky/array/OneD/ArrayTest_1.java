package com.lucky.array.OneD;

/**
 * 数组的初始化
 * 1.数组分为静态初始化和动态初始化
 */
public class ArrayTest_1 {
    public static void main(String[] args) {
//        数组的静态初始化:声明数组时并且指定数组元素的值
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = new int[]{1, 2, 3, 4, 5};
//        数组的动态初始化 声明数组时不指定数组元素的值
        int[] arr3 = new int[5];
    }
}
