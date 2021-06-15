package com.lucky.loop;

/**
 * 打印99乘法表
 * 分析
 *  num = 9
 *  1*1=1                          i=1
 *  1*2=2 2*2=4                    i=2
 *  1*3=3 2*3=6 3*3=9              i=3
 *  1*4=4 2*4=8 3*4=12 4*4=16      i=4
 */
public class LoopTest_7 {
    public static void main(String[] args) {
        int num = 9;
        for(int i=1;i<=9;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+"*"+i+"="+j*i+" ");
            }
            System.out.println();
        }
    }
}
