package xt.xi;

import java.awt.*;

/**
 * @Author :changting
 * @Description
 * @Date :2020/7/1
 */
public class YangHui {
    public static void main(String[] args) {
        int[][] arr=new int[11][11];

        //先把第一列
        for (int i = 0; i <11 ; i++) {
            arr[i][0]=1;

        }
        for (int i = 1; i < 11; i++) {
            for (int j = 1; j <i; j++) {
                arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
            }
        }
        for (int i = 1; i < 11; i++) {
            for (int j =0; j < (10-i); j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(arr[i][j]+"   ");
            }
            System.out.println();
        }
    }
}
