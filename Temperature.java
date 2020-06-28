package dailyJava;

import java.util.Scanner;

public class Temperature {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
System.out.println("请输入华氏度");
		double hs=s.nextDouble();
		double ss;	ss=(5/9.0)*(hs-32);	
		System.out.println("对应的摄氏度："+ss);

}
}
