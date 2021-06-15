package com.lucky.choose.switch_case_exer;

import java.util.Scanner;

/**
 * 输入一个月份  345是春季 678是夏季  91011是秋季  1212是冬季
 */
public class SwitchCaseExer_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int month = scan.nextInt();
        switch (month){
            case 3:
            case 4:
            case 5:
                System.out.println("春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋季");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("冬季");
                break;
            default:
                System.out.println("没有此月份");
                break;
        }
    }
}
