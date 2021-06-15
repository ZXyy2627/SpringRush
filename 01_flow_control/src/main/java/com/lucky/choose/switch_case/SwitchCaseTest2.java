package com.lucky.choose.switch_case;

import java.util.Scanner;

/**
 * switch表达式类型 只能是  byte short int  char String  enum类型
 *
 * case 常量后只能是一个具体的值，不能是一个范围 也不能是一个判断
 *
 * default 相当于if else 最后的那个else  可以写也可以不写
 *
 * 练习：使用switch把char 从小写转换成大写 只转换 a b c d e
 * 其他的不转换
 */
public class SwitchCaseTest2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char c = (char )scan.nextInt();
        System.out.println(c);
        switch (c){
            case 'a':
                System.out.println('A');
                break;
            case 'b':
                System.out.println("B");
                break;
            case 'c':
                System.out.println("C");
                break;
            case 'd':
                System.out.println("D");
                break;
            case 'e':
                System.out.println("E");
                break;
            default:
                System.out.println("other");
                break;
        }
    }
}
