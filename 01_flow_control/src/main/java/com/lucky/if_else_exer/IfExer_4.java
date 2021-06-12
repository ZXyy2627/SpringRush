package com.lucky.if_else_exer;

import java.util.Scanner;

/**
 * 模拟中彩票  随机生成一个两位数
 * 用户输入 一个两位数
 * 如果这两个两位数相等  那么中10000元
 * 如果这两个两位数十位和个位互换  那么中3000元
 * 如果这两个两位数十位相等 那么中1000元
 * 如果这两个两位数个位相等 那么中500y元
 * 如果都不同  那么没中将
 */
public class IfExer_4 {
    public static void main(String[] args) {
        //随机生成一个数
        int random = (int) (Math.random()*99+10);
        System.out.println("中奖号码为："+random);
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个两位数");
        int userNum = scan.nextInt();
        if(random == userNum){
            System.out.println("奖励10000元");
        }else{
           if((random/10) == (userNum/10)){
               System.out.println("奖励10000");
           }else if((random%10) == (userNum%10)){
               System.out.println("奖励500元");
           }else if(((random%10) == (userNum/10)) && ((random/10) == (userNum%10)) ){
               System.out.println("奖励3000元");
           }else{
               System.out.println("没有中奖");
           }
        }
    }

}
