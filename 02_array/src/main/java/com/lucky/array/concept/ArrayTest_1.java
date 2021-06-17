package com.lucky.array.concept;

/**
 * 什么是数组？
 * 数组就是一些相同类型元素的集合
 */
public class ArrayTest_1 {
    public static void main(String[] args) {
        //数组的静态初始化
        int[] nums = {1,2,3};
        int[] arr2 = new int[]{1, 2, 3, 4, 5, 6};
        //数组的动态初始化
        int[] arr1 = new int[10];
//        数组的长度 数组的长度一旦指定不能改变
//        比如想往数组中添加一个元素

        System.out.println(arr1.length);
//      可以是一个字符串数组
        String[] strArr = new String[3];
//      也可以是自定义类的对象数组
        Student[] students = new Student[3];
    }
}
