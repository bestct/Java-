package dailyJava;

import java.util.Random;
import java.util.Scanner;

public class Grass {
public static void main(String[] args) {
	System.out.println("你出什么？（石头（2）剪刀（1)布（0）");
	Random random=new Random();
	Scanner sc=new Scanner(System.in);
	int r=random.nextInt(3);
	int m=sc.nextInt();
	System.out.println("计算机出的是"+cai(r)+",你出的是"+cai(m)+"  "+pan(r,m));
}

public static String cai(int x) {
	if(x==0) {
	return "布";
	}
	if (x==1) {
		return "剪刀";
	}
	if (x==2) {
		return "石头";
	}
	return null;
	
}
public static String pan(int x,int y) {
	if(x==y) {
		
		return "平局";
	}
	else if(x>y) {
		if(x+y==2)
			
			return "你赢了";
		else {
			return "你输了";
		}
	}
	else {
	if(x+y==2)
			
			return "你输了";
		else {
			return "你赢了";
		}
	}	
	}
		
	

	}


