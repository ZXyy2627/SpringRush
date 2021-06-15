package com.lucky.choose.switch_case_exer;

import java.util.Scanner;

/**
 * 编写程序 要求输入2021年的 month和day
 * 然后计算打印出这是2021年的多少天
 */
public class SwitchCaseExer_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入月份");
        int month = scan.nextInt();
        System.out.println("请输入天");
        int day = scan.nextInt();

        int sum = 0;
//        这种写法太冗余了
//        switch (month){
//            case 1:
//                sum = day;
//                break;
//            case 2:
//                sum = 31+day;
//                break;
//            case 3:
//                sum = 31+28+day;
//                break;
//            case 4:
//                sum = 31*2+28+day;
//                break;
//            case 5:
//                sum = 31*2+30+28+day;
//                break;
//            case 6:
//                sum = 31*3+30+28+day;
//                break;
//            case 7:
//                sum = 31*3+30*2+28+day;
//                break;
//            case 8:
//                sum = 31*4+30*2+28+day;
//                break;
//            case 9:
//                sum = 31*5+30*2+28+day;
//                break;
//            case 10:
//                sum = 31*5+30*3+28+day;
//                break;
//            case 11:
//                sum = 31*6+30*3+28+day;
//                break;
//            case 12:
//                sum = 31*6+30*4+28+day;
//                break;
//            default:
//                System.out.println("输入的月份有误");
//                break;
//        }
//        应该倒着月份写 并且不写break ，那么就可以自动让程序累加
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
                sum+=28;
            case 2:
                sum += 31;
            case 1:
                sum += day;
        }
        System.out.println("这是第"+sum+"天");
    }
}
