package dailyJava;

import java.util.Random;
import java.util.Scanner;

public class Grass {
public static void main(String[] args) {
	System.out.println("���ʲô����ʯͷ��2��������1)����0��");
	Random random=new Random();
	Scanner sc=new Scanner(System.in);
	int r=random.nextInt(3);
	int m=sc.nextInt();
	System.out.println("�����������"+cai(r)+",�������"+cai(m)+"  "+pan(r,m));
}

public static String cai(int x) {
	if(x==0) {
	return "��";
	}
	if (x==1) {
		return "����";
	}
	if (x==2) {
		return "ʯͷ";
	}
	return null;
	
}
public static String pan(int x,int y) {
	if(x==y) {
		
		return "ƽ��";
	}
	else if(x>y) {
		if(x+y==2)
			
			return "��Ӯ��";
		else {
			return "������";
		}
	}
	else {
	if(x+y==2)
			
			return "������";
		else {
			return "��Ӯ��";
		}
	}	
	}
		
	

	}


