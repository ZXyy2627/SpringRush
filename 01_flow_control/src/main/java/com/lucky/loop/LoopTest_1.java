package com.lucky.loop;

import java.util.Scanner;

/**
 * 从键盘输入个数不确定的整数，并判断读入的正数和负数的个数，输入为0时程序结束
 */
public class LoopTest_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counta = 0;
        int countb = 0;
        int num;
        do {
            System.out.println("请输入一个整数:");
            num = scanner.nextInt();
            if(num>0){
                counta++;
            }
            if(num<0){
                countb++;
            }
        }while(num != 0);
        System.out.println("正数的个数为:"+counta);
        System.out.println("负数的个数为:"+countb);
    }
}
