package com.lucky.choose.switch_case_exer;

/**
 * 输入一个成绩 如果大于60  合格
 * 小于60 不及格
 *
 * 如果某些表达式的操作一样  case  可以合并
 */
public class SwitchCaseExer_1 {
    public static void main(String[] args) {
        int score = 78;

        switch (score / 10){
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("不及格");
                break;
            case 6:
            case 7:
            case 8:
            case 9:
                System.out.println("及格");
                break;
            default:
                System.out.println("other");
                break;
        }
    }
}
