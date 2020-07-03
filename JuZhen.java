package xt.xi;

import java.util.Scanner;

/**
 * @Author :changting
 * @Description 矩阵的加减乘；
 * @Date :2020/7/3
 */
public class JuZhen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //两个计算矩阵，一个结果矩阵
        int[][] a1 = new int[3][3];
        int[][] a2 = new int[3][3];
        int[][] a3 = new int[3][3];
        int sum;
        String s;
        boolean a=true;
        System.out.println("请输入3*3的矩阵");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a1[i][j] = sc.nextInt();
            }
        }
        System.out.println("请输入3*3的矩阵");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a2[i][j] = sc.nextInt();
            }
        }
        System.out.println("输入+，-，或*来计算结果");
        s = sc.next();
        while (a){
        switch (s) {
            case "+":
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        a3[i][j] = a1[i][j] + a2[i][j];
                    }
                }
                a=false;
                break;
            case "-":
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        a3[i][j] = a1[i][j] - a2[i][j];
                    }
                }
                a=false;
                break;
            case "*":
                for (int i = 0; i < 3; i++) {
                    sum = 0;
                    for (int j = 0; j < 3; j++) {

                        sum += a1[i][j] * a2[j][i];

                    }
                    for (int j = 0; j < 3; j++) {
                        a3[i][j] = sum;
                    }
                }
                a=false;
                break;
            default:
                System.out.println("输入不规范请再输一次");
                s=sc.next();
        }
        }    for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(a3[i][j]+" ");
            }
            System.out.println();
        }
    }
}