package com.lucky.loop.for_loop;

/**
 * 编写程序  打印1到150  如果是3的倍数，那么就在后面加上foo
 * 如果是5的倍数 就在后面加上biz
 * 如果是7的倍数  就在后面加上baz
 */
public class ForTest_1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 150; i++) {

            System.out.println(i+" ");

            if (i % 3 == 0) {
                System.out.println(i + " foo");
            }
            if (i % 5 == 0) {
                System.out.println(i + " baz");
            }
            if (i % 7 == 0) {
                System.out.println(i + " biz");
            }
        }
    }
}