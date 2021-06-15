package com.lucky.choose.switch_case;

/**
 * switch(表达式)
 *
 * case 表达式1
 *      ....
 *      break;
 * case 表达式2
 *      ...
 *      break;
 * ...
 * default:
 *      ...
 *      break;
 */
public class SwitchCaseTest {
    public static void main(String[] args) {
        //如果你不写break的话 那么他会继续执行下面的所有分支



        int num = 2;
        switch (num){
            case 1:
                System.out.println("one");
//                break;
            case 2:
                System.out.println("two");
//                break;
            case 3:
                System.out.println("three");
//                break;
            default:
                System.out.println("有问题");
        }

//        two
//        three
//        有问题
//        我们可以看到打印结果是这样的，这是因为num= 2 所以它直接匹配到2  但是没有写break 它会继续执行下面的所有分支
//        只有写了break才会只执行当前匹配的分支  一般情况下 我们都需要写上break 以做规范
    }
}
