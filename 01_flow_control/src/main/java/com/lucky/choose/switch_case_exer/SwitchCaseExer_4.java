package com.lucky.choose.switch_case_exer;

import java.util.Scanner;

/**
 * 上面是计算2021年的第几天   那么随便一年呢 ？
 * 就首先需要判断此年是否是闰年
 */
public class SwitchCaseExer_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入年份");
        int year = scan.nextInt();
        System.out.println("请输入月份");
        int month = scan.nextInt();
        System.out.println("请输入日期");
        int day = scan.nextInt();

        //判断闰年  一般%4 == 0 || 当%400 == 0
        boolean flag = ((year%4 == 0) && (year%100 != 0)) || (year%400==0);
        int sum=0;
        switch (month){
            case 12:
                sum+=30;
            case 11:
                sum+=31;
            case 10:
                sum+=30;
            case 9:
                sum+=31;
            case 8:
                sum+=31;
            case 7:
                sum+=30;
            case 6:
                sum+=31;
            case 5:
                sum+=30;
            case 4:
                sum+=31;
            case 3:
                if(flag){
                    sum+=29;
                }else {
                    sum+=28;
                }
            case 2:
                sum += 31;
            case 1:
                sum += day;
        }
        System.out.println("这是第"+sum+"天");
    }
}
