package com.lucky.loop;

/**
 * 质数优化
 * break 停止当前循环 并不再执行循环  continue 停止当前循环执行下一次循环
 */
public class LoopTest_9 {
    public static void main(String[] args) {
        boolean flag = true;
        long start = System.currentTimeMillis();
        for (int i = 2; i < 100000; i++) {
//            优化二:我们可以想想j的范围  它一定是要到i才能证明吗？
//            其实不是  也可以到i/2  想想为什么 比如证明96是否是质数 那么我们不需要让它除以48以上的数
//            因为它可以被i/2除尽的话 那它就一定不是质数
//            更进一步  继续想想为什么可以使用i<Math.sqrt(i);
//            假设i为36  也就是说如果它能被根号36除尽 也就相当于它不是质数了  所以只要小于等于根号i也可以了
//            这种优化就是尽量缩小范围  让循环尽量少发生
            for(int j=2;j<=Math.sqrt(i);j++){
                if(i%j==0){
                    flag = false;
                    //优化一:一旦在这个过程中有一次被除尽那么它肯定不是质数，就直接结束这一次循环
                    break;
                }
            }
            if (flag) {
                System.out.println(i);
            }
            flag = true;
        }
        long end = System.currentTimeMillis();
        System.out.println("所花费的时间为:"+(end - start));//1579 //Math.sqrt()87毫秒
    }
}
