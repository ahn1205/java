package quiz;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz20 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("수를 입력하세요>");
		int num = scan.nextInt();
		
		int[] arr = new int[num];		
		
		int i = 0; //시작은 0에서
		while(i < arr.length) {
			
			arr[i] = i+1;
			
			i++;
		}
		
		//배열의 내부구조를 한눈에 보는 방법
		System.out.println( Arrays.toString(arr));
		
		
		
		
		
		
		
	}
}
