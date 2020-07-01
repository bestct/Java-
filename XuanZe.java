package xt.xi;

/**
 * @Author :changting
 * @Description 选择排序（1）冒泡排序是比较相邻位置的两个数，而选择排序是按顺序比较，找最大值或者最小值；
 * （2）冒泡排序每一轮比较后，位置不对都需要换位置，选择排序每一轮比较都只需要换一次位置；
 * （3）冒泡排序是通过数去找位置，选择排序是给定位置去找数；
 *  冒泡排序优缺点：优点:比较简单，空间复杂度较低，是稳定的；
 *                               缺点:时间复杂度太高，效率慢；
 * 选择排序优缺点：优点：一轮比较只需要换一次位置；
 * @Date :2020/7/1
 */
public class XuanZe {
    public static void main(String[] args) {


        int arr1[] = {23, 12, 46, 24, 87, 65, 18, 14, 43, 434, 65, 76};
        // 排序
        int l = 0;
        for (int i = 0; i < arr1.length - 1; i++) {
            for (int j = i + 1; j < arr1.length ; j++) {
                if (arr1[i] < arr1[j]) {
                    int t = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = t;
                    l++;
                }
                System.out.print("i=" + i + "的第j=" + j + "次交换\t");
                for (int d = 0; d < arr1.length; d++) {
                    System.out.print(arr1[d] + "\t");
                }
                System.out.println();
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + "\t");
        }
        System.out.println();
        System.out.println("交换的次数为" + l);
    }
}