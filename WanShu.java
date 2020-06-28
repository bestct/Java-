package dailyJava;

public class WanShu {
public static void main(String[] args) {
	for (int i = 2; i <=1000; i++) {
		if(i==yinSum(i)) {
			
			System.out.println(i);
		}
	}
}

public static int  yinSum(int x) {
	int sum=0;
	for (int i = 1; i < x; i++) {
		if (x%i==0) {
			sum+=i;
		}
	}
	return sum;
}
}
