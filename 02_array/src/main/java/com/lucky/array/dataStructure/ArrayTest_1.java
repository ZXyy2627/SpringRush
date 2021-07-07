package com.lucky.array.dataStructure;

import java.util.Arrays;

/**
 * 创建一个长度为6的int类型数组，要求数组的元素值在1~30之间，且是随机赋值，同时要求元素值各不相同
 * 首先生成一个数 把这个数组当成两个数组  第一个是保存数据的数组，第二个是用于比较的数组 将生成的这个数与保存数组的每一个元素做比较，
 * 如果相等则i-- 意思就是说，让循环下标i回到上一个 然后重新生成一个数进行比较
 */
public class ArrayTest_1 {
    public static void main(String[] args) {
        //int[] arr = method1();
        int[] arr2 = method2();
        //System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
    }

    public static int[] method1(){
        int[] arr = new int[6];
        for (int i = 0; i < arr.length; i++) {
            //生成一个数
            arr[i] = (int) (Math.random()*30+1);
            for(int j=0;j<i;j++){
                //判断，如果arr[i] = arr这个数组中从0到i-1任意一个，那么这个数就不能保存在数组中
                if(arr[i] == arr[j]){
                    i--;
                    break;//跳出循环，继续下面的代码 continue跳出当次循环，继续下一次循环
                }
            }
        }
        return arr;
    }

    public static int[] method2(){
        int[] arr = new int[6];
        for (int i = 0; i < arr.length; i++) {
            //生成一个数
            arr[i] = (int)(Math.random()*30+1);
            boolean flag = false;//一个是否相等的标志
            while(true){
                //无论怎样都进来判断，如果相等，就将相等的标志改为true  就跳出和数组中的数据比较的循环
                for (int j = 0; j < i; j++) {
                    if(arr[i] == arr[j]){
                        flag = true;
                        break;
                    }
                }
                //如果相等了，就从新生成一个新的数  ，跳出判断继续下一次循环
                if(flag){
                    arr[i] = (int)(Math.random()*30+1);
                    flag = false;
                    continue;
                }
                break;
            }

        }
        return arr;
    }

    public static int[] method3(){
        int[] arr = new int[6];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*30+1);
            boolean flag = false;
            while(true){
                for (int j = 0; j < i; j++) {
                    if(arr[j] == arr[i]){
                        flag = true;
                        break;
                    }
                }
                if(flag){
                    arr[i] = (int) (Math.random()*30+1);
                    flag = false;
                    continue;
                }
                break;
            }
        }
        return arr;
    }
}
