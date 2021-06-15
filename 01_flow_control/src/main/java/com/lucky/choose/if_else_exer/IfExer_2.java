package com.lucky.choose.if_else_exer;

/**
 * 输入两个double类型的数字，
 * 如果第一个数大于10.0 且第二个数小于20.0 那么就打印两数之和
 * 否则打印两数之积
 */
public class IfExer_2 {
    public static void main(String[] args) {
        double a = 7.8;
        double b = 25.4;

        if( a > 10.0 && b < 20.0)
            System.out.println("a + b = " + (a+b));
        else
            System.out.println("a * b = " + (a*b));
    }
}
