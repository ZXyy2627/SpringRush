package com.lucky.array.dataStructure;

public class HuiXingUtils {
    public static int[][] huiXing(int n){
        int length=n*n;
        int [][]result=new int[n][n];
        int direction=1;
        int i=0,j=0;
        for (int k=1;k<=length;k++){
            result[i][j]=k;
            DirectionEnum directionEnum=DirectionEnum.getDirectionByCode(direction%4);
            switch (directionEnum){
                case RIGHT:{
                    if (j==n-1||result[i][j+1] != 0){
                        i++;
                        direction++;//改变方向
                    }else{
                        j++;
                    }
                }break;
                case DOWN:{
                    if (i==n-1||result[i+1][j]!=0){
                        j--;
                        direction++;//改变方向
                    }else{
                        i++;
                    }
                }break;
                case LEFT:{
                    if (j==0||result[i][j-1]!=0){
                        i--;
                        direction++;//改变方向
                    }else{
                        j--;
                    }
                }break;
                case UP:{
                    if (i==0||result[i-1][j]!=0){
                        j++;
                        direction++;//改变方向
                    }else{
                        i--;
                    }
                }break;
                default:
            }
        }
        return result;
    }
}
