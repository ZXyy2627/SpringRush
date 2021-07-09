package com.lucky.array.dataStructure;

/**
 * 查找 线性查找
 * 从前往后找
 */
public class ArrayTest_9 {
    public static void main(String[] args) {
        String[] arr1 = new String[]{"aa","bb","cc","dd","ee","ff"};
        //线性查找就是从前往后一个个的查找

        String dest =  "bb";
        boolean flag = false;
        for (int i = 0; i < arr1.length; i++) {
            if(dest.equals(arr1[i])){
                flag = true;
                System.out.println("找到了，它是数组的第"+(i+1)+"个元素");
                break;
            }
        }
        if(!flag){
            System.out.println("数组中不存在这个元素!");
        }

    }
}
