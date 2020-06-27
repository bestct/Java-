package one;/*
 *@author:常挺
 *@date：2020/5/11
 *
 */

import java.util.Random;

public class Random_1 {
    Random rand =new Random();
    int val;
    double prob_1;
    double prob_2;
    double prob_3;
    double prob_4;
    double prob_5;
    double prob_6;
   public int getVal(){
       return val=rand.nextInt(6)+1;
   }
   public void setRandom(int k){
       int val_1=0;
       int val_2=0;
       int val_3=0;
       int val_4=0;
       int val_5=0;
       int val_6=0;
       for (int i = 0; i <k ; i++) {
           switch (getVal()){
               case 1:val_1++;break;
               case 2:val_2++;break;
               case 3:val_3++;break;
               case 4:val_4++;break;
               case 5:val_5++;break;
               case 6:val_6++;break;


           }
       }
       prob_1=val_1/(k*1.0);
       prob_2=val_2/(k*1.0);
       prob_3=val_3/(k*1.0);
       prob_4=val_4/(k*1.0);
       prob_5=val_5/(k*1.0);
       prob_6=val_6/(k*1.0);

   }


}
class Action{
    public static void main(String[] args) {
        Random_1 random_1=new Random_1();
        random_1.setRandom(1000);
        System.out.println("1出现的概率"+random_1.prob_1);
        System.out.println("2出现的概率"+random_1.prob_2);
        System.out.println("3出现的概率"+random_1.prob_3);
        System.out.println("4出现的概率"+random_1.prob_4);
        System.out.println("5出现的概率"+random_1.prob_5);
        System.out.println("6出现的概率"+random_1.prob_6);


    }



}