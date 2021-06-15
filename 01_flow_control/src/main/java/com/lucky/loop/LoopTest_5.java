package com.lucky.loop;

/**
 * 打印倒三角不带空格的情况
 * 如果num = 4 第一行打印7个* 不空格 i=1   *为(num-i)*2+1  空格为i-1
 * 第二行打印5个*  空1格  i=2
 * 第三行打印3个*  空2格  i=3
 * 第四行打印1格*  空3格  i=4
 */
public class LoopTest_5 {
    public static void main(String[] args) {
        int num = 4;
        for(int i=1;i<=4;i++){
//            打印空格
            for(int j=0;j<i-1;j++){
                System.out.print(" ");
            }
//            打印*
            for(int k=1;k<=(num-i)*2+1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
