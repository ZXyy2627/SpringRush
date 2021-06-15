package com.lucky.loop;

/**
 * 嵌套循环
 *
 *  *
 *  **
 *  ***
 *  ****
 *  *****
 *  第一行一个* 第二行两个* ....
 *
 *  总结：外层循环控制行数，内层循环控制列数
 */
public class LoopTest_2 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
