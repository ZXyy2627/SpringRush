package com.lucky.loop;

/**
 * 遍历1~100以内的质数
 * 分析：质数是只能被它自己整除和1
 * 也就是说 外层循环从2开始  作为被除数 ，内层循环也从2开始 作为除数
 * 如果外层数i能被j除尽 那么就是false 如果不能被除尽就是true
 */
public class LoopTest_8 {
    public static void main(String[] args) {
        boolean flag = true;
        for(int i=1;i<100;i++){
//            i是被除数  现在要找除数 除数应该是从1开始一直循环加到i在这个过程中 i%j 能被除尽说明它不是质数
//            i%j j从2到i本身都不能被除尽说明它是质数
            for(int j=2;j<i;j++){
                if(i%j ==0){
                    //说明i不是质数
                    flag = false;
                }
            }
            if (flag) {
                System.out.println(i);
            }
            flag=true;
        }
    }
}
