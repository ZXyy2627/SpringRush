package com.lucky.loop.while_loop;

/**
 * 循环要素：
 * ① 初始化赋值
 * while(②){ 循环表达式
 *     ③ 循环要做的事
 *     ④ 步长
 * }
 */
public class WhileTest {
    public static void main(String[] args) {
        int i = 0;
        while (i <= 100) {
            if(i%2 ==0){
                System.out.print(i+" ");
            }
            i++;
        }
    }
}
