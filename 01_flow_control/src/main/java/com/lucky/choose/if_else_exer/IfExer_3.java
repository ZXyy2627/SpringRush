package com.lucky.choose.if_else_exer;

import java.util.Scanner;

/**
 * 狗的前两年 每年相当于人的10.5年
 * 狗过了两年后 每年相当于人的4年
 */
public class IfExer_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入狗的年龄");
        int age = scan.nextInt();

         float f = 0.0f;
        if(age >= 2){
            f = 2f*10.5f +((float)(age-2))*4;
            System.out.println("相当于人类年龄的:"+f+"岁");
        }else if(age == 1){
            f = 10.5f;
            System.out.println("相当于人类年龄的:"+f+"岁");
        }else{
            System.out.println("输入的数字有误");
        }
    }
}
