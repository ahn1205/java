package quiz;

import java.util.Scanner;

public class Quiz18 {

	public static void main(String[] args) {
		
		//1~부터 입력받은 수 까지의 약수들의 합.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수입력>");
		int num = scan.nextInt();
		
		int i = 1; //제어변수
		int sum = 0;//합계변수
		while(i <= num) {
			
			if(num % i == 0) 
				sum += i;
			
			i++;
		}
		
		System.out.println("입력받은" + num +"까지 약수의 합:" + sum);
		
		
		
	}
}
