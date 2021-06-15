package com.lucky.loop.for_loop;

import java.util.Scanner;

/**
 * 输入两个正整数 m和n 求其最大公约数和最小公倍数
 * 1.最大公约数  首先最大公约数一定是小于等于两个数中较小的那一个 并且两个数除以这个数余数等于0
 * 2.最小公倍数  肯定是大于最大的那一个  并且这个最小公倍数除以这两个数的余数也为0
 */
public class ForTest_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入第一个正整数");
        int m = scan.nextInt();
        System.out.println("请输入第二个正整数");
        int n = scan.nextInt();

//        求最大公约数，比最小的那个数小于等于  两个数能除尽
        int f = Math.min(m,n);
        for (int i = f; i >=1 ; i--) {
            if((m%i == 0) && (n%i == 0)){
                System.out.println("最大公约数是:"+i);
                break;
            }
        }

//        最小公倍数一定大于那个较大的数 并且它除以两个数能除尽 并且肯定小于m*n
        int max = Math.max(m,n);
        for(int i = max;i <= m*n;i++){
            if(i%m == 0 && i%n == 0){
                System.out.println("最大公倍数是:"+i);
                break;
            }
        }
    }
}
