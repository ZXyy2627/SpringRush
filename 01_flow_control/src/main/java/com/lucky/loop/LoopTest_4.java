package com.lucky.loop;

/**
 * 打印*+空格的情况
 * 如果num = 4
 * 第一行打*+空格   空3个  i=1       空格数为num-i  *+空格数为i
 * 第二行打两个*+空格 空2格  i=2      空格数为num-i
 * 第三行打三个*+空格 空1格  i= 3      空格数为num-
 * 第四行打4个*+空格  没有空格
 *
 * 打印时  num = 4 空格数
 */
public class LoopTest_4 {
    public static void main(String[] args) {
        int num = 5;
        for(int i=1;i<=num;i++){
//            打印空格
            for(int j=1;j<=num-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
