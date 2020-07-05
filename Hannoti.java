package xt.xi;

import java.util.Scanner;

/**
 * @Author :changting
 * @Description
 * @Date :2020/7/5
 */
public class Hannoti {
    public static void main(String[] args) {
        Scanner sca=new Scanner(System.in);
        int s=sca.nextInt();
        hannuta('X','Z','Y',s);
    }
    public static void hannuta(char a,char b,char c,int i){
        if (i==1){
            System.out.println("第"+i+"个盘"+a+"-->"+c);
        }
        else {
            //每次递归都是目标柱和中介柱互换
            hannuta(a,c,b,i-1);
           System.out.println("第"+i+"个盘"+a+"-->"+c);
           //每次递归都是原始柱和中介柱互换
           hannuta(b, a, c, i-1);

        }



    }
}
