package com.lucky.array.dataStructure;

import java.util.Arrays;

/**
 * 需求：
 * 生成一个10个元素的int数组，里面包含10个随机的两位数，
 * 求最大，最小，和，平均数
 *
 *
 * 生成[10,99]间的随机数 首先满足是两边都是闭区间
 * [a,b]
 * (int) (Math.random()*(99-10+1)+10)
 */
public class ArrayTest_5 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random()*(99-10+1)+10);
        }
        System.out.println(Arrays.toString(arr));
        //求最大值
        int maxValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(maxValue<arr[i]){
                maxValue = arr[i];
            }
        }
        System.out.println("最大值是:"+maxValue);

        //求最小值
        int minValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(minValue>arr[i]){
                minValue = arr[i];
            }
        }
        System.out.println("最小值是:"+minValue);

        //求和
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+= arr[i];
        }
        System.out.println("数组的和为:"+sum);

        //求平均值
        float avg = ((float) sum)/10;
        System.out.println("平均值是:"+avg);
    }
}
