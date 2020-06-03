package quiz;

import java.util.Scanner;

public class Quiz07 {
	//quiz05
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print(">");
		int num1 = scan.nextInt();
		System.out.print(">");
		int num2 = scan.nextInt();
		
		if(num1 == num2) {
			System.out.println("같은 수 입니다");
		} else if(num1 > num2) {
			System.out.println(num1 + "이 큰 수 입니다");
		} else {
			System.out.println(num2 + "이 큰 수 입니다");
		}
		
		
		scan.close();
		
	}
}
