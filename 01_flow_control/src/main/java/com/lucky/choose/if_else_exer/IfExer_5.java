package com.lucky.choose.if_else_exer;

import java.util.Scanner;

/**
 * 如果一个男的  有三个属性  高：180上  富1000万  帅是
 * 满足3个条件就一定要嫁
 * 满足任意一个或两个  就勉强嫁
 * 都不满足就不嫁
 */
public class IfExer_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入身高:");
        int height = scan.nextInt();
        System.out.println("请输入财富:");
        int money = scan.nextInt();
        System.out.println("请输入帅:");
        boolean isHandsome = scan.nextBoolean();

        if(height>=180 && money>=1000 && isHandsome){
            System.out.println("一定要嫁");
        } else if (height >= 180 || money >= 1000 || isHandsome) {
            System.out.println("勉强嫁");
        } else {
            System.out.println("不嫁");
        }
    }
}
