package xt.xi;

import javafx.animation.PathTransition;

import java.util.Scanner;

/**
 * @Author :changting
 * @Description 鸡兔同笼问题
 *
 * @Date :2020/7/3
 */
public class MeiJu {
    public static void main(String[] args) {

        for (int i = 0; i <40 ; i++) {
            for (int j = 0; j <50 ; j++) {
                if (i*4+j*2==100&&i+j==40)
                {
                    System.out.println("兔有"+i+"鸡有"+j);
                }
            }
        }


    }
}