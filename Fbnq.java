package xt.xi;

import java.util.Scanner;

/**
 * @Author :changting
 * @Description
 * @Date :2020/7/5
 */
public class Fbnq {
    public static void main(String[] args) {
        Scanner sca=new Scanner(System.in);
        int a=sca.nextInt();
        System.out.println(digui(a));


    }
public static int digui(int i){

            if (i==0){

                return 0;
            }
            else if (i==1){

                return 1;
            }
            else {
                int a=digui(i-1)+digui(i-2);
                System.out.print(a+"  ");
                return a;
            }


}

}
