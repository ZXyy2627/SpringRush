package com.lucky.loop.do_while_loop;

/**
 * doWhile的区别
 * 不论是否满足循环条件，这个循环都会执行一次
 * ①
 * do{
 *   ③
 *   ④
 * }while(②)
 */
public class DoWhileTest {
    public static void main(String[] args) {
        int num = 0;
        do{
            if(num%2 == 0){
                System.out.print(num+" ");
            }
            num++;
        }while (num<=100);
    }
}
