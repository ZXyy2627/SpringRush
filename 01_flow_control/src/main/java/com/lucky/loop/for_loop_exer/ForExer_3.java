package com.lucky.loop.for_loop_exer;

/**
 * 打印水仙花数  什么是水仙花数 ？就是一个三位数  各个位置上数的立方之和 等于这个数
 */
public class ForExer_3 {
    public static void main(String[] args) {
        for(int i=100;i<=999;i++){
            //获得百位数字
            int a = i/100;
//            获得10位上的数
            int b = (i-a*100)/10;
//            获得个位上的数
            int c = i%10;

            int sum = a*a*a + b*b*b +c*c*c ;
            if(sum ==i){
                System.out.println("这个水仙花数是:"+i);
            }
        }
    }
}
