package com.lucky.loop;

/**
 * 一个数如果恰好等于他的因子之和，这个数就被称为完数，例如6=1+2+3
 * 分析:首先要找出它的因数
 * 外层循环i  为被除数  内层循环j为除数 如果i%j == 0 那么j就是它的因数  这时就sum+=j
 * 最后如果加完以后  sum == i 那么就输出这个i  sum清零
 */
public class LoopTest_10 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i < 1000; i++) {
            for(int j=1;j<i;j++){
                if(i%j==0){
                    sum+=j;
                }
            }
            if(sum == i){
                System.out.println(i);
            }
            sum = 0;
        }
    }
}
