package com.lucky.loop.for_loop_exer;

/**
 * 输入1~100的奇数和
 */
public class ForExer_1 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i=1;i<=100;i+=2){
            if(i%2 != 0){
                sum += i;
            }
        }
        System.out.println("1~100奇数和是:"+sum);
    }
}
