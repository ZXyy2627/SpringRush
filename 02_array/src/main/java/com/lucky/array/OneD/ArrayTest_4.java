package com.lucky.array.OneD;

/**
 * 遍历数组 通过数组的索引获取元素或者设置元素  索引从0开始
 */
public class ArrayTest_4 {
    public static void main(String[] args) {
        String[] strs = {"古力娜扎","迪丽热巴","马尔扎哈"};
        for (String str : strs) { //增强for循环
            System.out.println("增强for获取的"+str);
        }

        for (int i = 0; i < strs.length; i++) {
            System.out.println("索引方式获取的"+strs[i]);
        }

//        获取或设置数组中的某个元素
        System.out.println(strs[0]);
        strs[0] = "古力娜扎王八蛋";
    }
}
