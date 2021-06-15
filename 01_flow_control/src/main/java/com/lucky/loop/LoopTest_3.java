package com.lucky.loop;

/**
 *
 * 使用*打印三角形
 *   *号中间没有空格的情况 num是指打印多少行
 *   假设num=3  第一行打印2个空格 然后打印1个 *  此时i=1
 *              第二行打印1个空格 然后打印3个*  此时i=2
 *              第三行打印0个空格 然后打印5个*  此时i=3
 *      打印的空格数为num -i
 *      打印的*数为i*2-1
 *
 *  假设打印4行  第一行的空格数3  打印1个* 此时i=1
 *              第二行打印的空格数为2 打印3个*  此时i=2
 *              第三行打印的空格数为1  打印5个*  此时i=3
 *              第四行打印的空格数为0 打印7个*  此时i=4
 *           打印的空格数  num-i
 *           打印的*个数 i*2-1
 *
 */
public class LoopTest_3 {
    public static void main(String[] args) {
        int num = 7;
        for(int i = 1;i<=num;i++){
//            打印空格数
           for(int j=1;j<=num-i;j++){
               System.out.print(" ");
           }
//           打印*个数
            for(int k=1;k<=i*2-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
