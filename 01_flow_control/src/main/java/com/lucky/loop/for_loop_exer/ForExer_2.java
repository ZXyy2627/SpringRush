package com.lucky.loop.for_loop_exer;

/**
 * 求1~100间7的倍数的和
 *
 */
public class ForExer_2 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 7 == 0) {
                sum+=i;
            }
        }
        System.out.println("1~100之间7的倍数的和是:"+sum);
    }
}
