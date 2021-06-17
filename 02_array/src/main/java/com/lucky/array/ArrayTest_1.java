package com.lucky.array;

/**
 * 使用二维数组打印一个10行的杨辉三角
 * 什么是杨辉三角？就是随便找一个数,这个数等于它上面的那个数，和上面那个数的左边的数的和
 * 1             i=1
 * 1 1           i=2
 * 1 2 1         i=3
 * 1 3 3 1       i=4
 * 1 4 6 4 1     i=5
 * 1 5 10 10 5 1 i=6
 * 其实可以把这个三角形看作一个二维数组  那么这个二维数组的行数就是外层数组的长度  二内层数组的长度是由i来决定
 */
public class ArrayTest_1 {
    public static void main(String[] args) {
        int num = 10;
        int[][] array = new int[num][];
//        初始化这个二维数组
        for (int i = 0; i < array.length; i++) {
//            初始化内层数组的长度
            array[i] = new int[i+1];
            for (int j = 0; j < array[i].length; j++) {
                if(j==0 || j==array[i].length-1){
                    array[i][j] = 1;
                }else{
                    array[i][j] = array[i-1][j]+array[i-1][j-1];
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
}
