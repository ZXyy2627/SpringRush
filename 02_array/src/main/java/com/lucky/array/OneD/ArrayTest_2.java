package com.lucky.array.OneD;

/**
 * 数组初始化的默认值
 * 整型：0
 * 浮点型：0.0
 * boolean false
 * char 0或\u0000
 * 引用类型：null
 */
public class ArrayTest_2 {
    public static void main(String[] args) {
//        查看整型数组的默认值
        int[] arr1 = new int[3];
        System.out.println(arr1[0]);
//        查看浮点型数组的默认值
        double[] arr2 = new double[3];
        System.out.println(arr2[1]);
//        查看boolean数组的默认值
        boolean[] arr3 = {false,true};
        System.out.println(arr3[0]);
//        查看char类型数组的默认值
        char[] arr4 = new char[3];
        System.out.println(arr4[0]);//查看打印结果 有一个类似空格的字符，注意这不是空格
//        查看引用类型数组的默认值
        String[] arr5 = new String[3];
        System.out.println(arr5[0]);
    }
}
