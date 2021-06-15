package com.lucky.choose.if_else_exer;

/**
 * 编写程序，声明两个变量并赋值，判断两数之和如果大于50就输出HelloWorld
 */
public class IfExer1 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 42;
        if((num1+num2) > 50)
            System.out.println("Hello World");
        else
            System.out.println("Hello Java");
    }
}
