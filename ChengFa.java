package xt.xi;

/**
 * @Author :changting
 * @Description
 * @Date :2020/7/1
 */
public class ChengFa {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j+"*"+i+"="+(i*j)+"  ");
            }
            System.out.println();
        }
    }
}
