package com.lucky.array.TwoD;

/**
 * 多维数组的使用
 */
public class ArrayTest_1 {
    public static void main(String[] args) {
//        二维数组的静态初始化
        int[][] arr = {{1,2,3},{4,5},{6,7,8}};
//        二维数组的动态初始化
        int[][] arr2 = new int[3][];//这里只指定了外层数组的个数，没有指定内层数组的元素个数
        int[][] arr3 = new int[3][4];//外层数组的元素个数是3个，内层数组的元素个数是4个
//        获取数组的长度
//        获取外层数组的长度
        int outLength = arr3.length;//3
//        获取内层数组的长度
        int innerLength = arr3[1].length;

//        遍历二维数组
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                System.out.println(arr[i][j]);
            }
        }

//        获取指定元素的值
//        加上我们要获取arr中8这个元素
        int num = arr[2][2];
        System.out.println(num);
//        二维数组的默认初始化
        int[][] arr4 = new int[3][3];
        for (int i = 0; i < arr4.length; i++) {
            System.out.println(arr4[i]);
            for (int j = 0; j < arr4[i].length; j++) {
                System.out.println(arr4[i][j]);
            }
        }
    }
}
