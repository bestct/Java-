package dailyJava;

import java.util.Scanner;

public class Gen {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("请输入a,b,c的值");
		double a=s.nextDouble();
		double b=s.nextDouble();
		double c=s.nextDouble();
		double t=b*b-4*a*c;

		if (t>0) {
			System.out.println("x1="+(-b+Math.sqrt(t))/(2*a)+"x2="+(-b-Math.sqrt(t))/(2*a));
		}
		else if (t<0) {
			System.out.println("无实根");
		}
		else {
			System.out.println("x1=x2="+-b/(2*a));
		}
	}
}
