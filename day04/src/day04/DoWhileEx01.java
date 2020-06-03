package day04;

public class DoWhileEx01 {

	public static void main(String[] args) {
		
		int k = 1;
		int sum2 = 0;
		while(k <= 10) {

			sum2 += k;
			
			k++;
		}
		
		System.out.println("1~10까지 합:" + sum2);
		
		System.out.println("-------------------------------");
		
		int i = 1;
		int sum = 0;
		do {
			
			sum += i;
			
			i++;
		} while(i <= 10);
		
		System.out.println("1~10까지 합:" + sum);
		
		
		
		
		
		
		
	}
}
