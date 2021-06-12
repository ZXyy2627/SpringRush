package com.lucky.if_else;

import java.util.Scanner;

/**
 * 如果考试成绩为：
 * 考试成绩等于100,奖励一台劳斯莱斯
 * 考试成绩大于90 奖励一台奔驰
 * 考试成绩大于80 奖励一台特斯拉
 * 考试成绩大于70 奖励一台帕萨特
 * 考试成绩大于60 奖励一台轩逸
 * 考试成绩小于60 奖励一台摩拜
 *
 *
 * 总结：
 *  如果条件表达式之间是互斥关系，那么条件可以任意顺序写
 *  如果条件表达式之间是包含关系，那么条件不能任意顺序写
 *
 *
 */
public class IfTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("请输入考试成绩:");
        int score = scan.nextInt();

        /*
        这是包含关系，如果我们这样写，当分数为95时 ，它不会走条件大于90  而是直接走了条件大于80的分支
        if(score == 100){
            System.out.println("奖励一台劳斯莱斯");
        }else if(score > 80){
            System.out.println("奖励一台特斯拉");
        }else if(score > 90){
            System.out.println("奖励一台奔驰");
        }
        */


        if(score == 100){
            System.out.println("一台劳斯莱斯到手");
        }else if ( score >= 90 & score < 100){
            System.out.println("一台奔驰到手");
        }else if(score >= 80 & score<90){
            System.out.println("一台特斯拉到手");
        }else if (score >= 70 & score < 80) {
            System.out.println("一台帕萨特到手");
        } else if (score >= 60 & score < 70) {
            System.out.println("一台轩逸到手");
        } else if (score < 60) {
            System.out.println("一台摩拜到手");
        }else{
            System.out.println("你输入的分数有误");
        }
    }
}
