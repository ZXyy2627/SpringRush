package com.lucky.loop;

/**
 * 打印倒三角  *+空格
 *
 * 假如num=4
 *      空格=0 *+空格个数为4  i=1     i-1  num-i+1
 *      空格为1 *+空格的个数为3 i=2
 *      空格=2  *+空格的个数为2 i=3
 *      空格=3  *+空格的个数为1 i=4
 */
public class LoopTest_6 {
    public static void main(String[] args) {
        int num = 7;
        for(int i=1;i<=num;i++){
//            打印空格
            for(int j=1;j<=i-1;j++){
                System.out.print(" ");
            }
//            打印*+空格
            for(int k=1;k<=num-i+1;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
