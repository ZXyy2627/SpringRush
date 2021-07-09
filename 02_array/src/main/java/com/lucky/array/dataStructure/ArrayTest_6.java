package com.lucky.array.dataStructure;

import java.util.Arrays;

/**
 *创建一个名为ArrayTest的类，在main方法中声明arr1和arr2两个变量，他们都是int[]数组
 * 使用静态初始化，把arr初始化为8个元素：2，3，5，7，11，13，17，19
 * 显示arr1的内容，
 * 赋值arr2等于arr1,修改arr2中的偶索引元素，使其等于索引值，
 * 如arr2[0] = 0 ;arr[2] = 2;
 */
public class ArrayTest_6 {
    public static void main(String[] args) {
        int[] arr1 = {2,3,5,7,11,13,17,19};
        System.out.println("arr1:"+Arrays.toString(arr1));
        int[] arr2 = arr1;//在这里，只是把arr1的地址值赋值给了arr2  如果改变arr2中的值，arr1也会改变
        for (int i = 0; i < arr2.length; i++) {
            if(i%2==0){
                arr2[i] = i;
            }
        }
        System.out.println("arr1:"+Arrays.toString(arr1));
        System.out.println("arr2:"+Arrays.toString(arr2));
    }
}
