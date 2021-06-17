package com.lucky.array.OneD;

/**
 * 数组的长度 length属性不是方法
 * 注意数组的长度一旦确定就不会在改变，并且在内存中时一块连续的内存空间
 * 如果数组的长度改变了，那一定是数组的引用指向了另一个内存地址
 */
public class ArrayTest_3 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        System.out.println("数组的长度是:"+arr.length);

    }
}
