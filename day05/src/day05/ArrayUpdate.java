package day05;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayUpdate {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String[] arr = {"강타", "문희준", "토니안", "장우혁", "이재원" };
		
		System.out.print("수정할 학생의 별명을 입력>");
		String name = scan.next();
		
		
		boolean chk = true;
		for(int i = 0; i < arr.length; i++) {
			
			if(name.equals(arr[i])) { //입력받은 학생이 배열에 있는 경우
				System.out.println(arr[i] + "별명을 변경합니다");
				System.out.print(">");
				arr[i] = scan.next();
				chk = false; //변경되었다는 의미.
			} 
		}
		
		if(chk) {
			System.out.println("별명이 존재하지 않습니다");
		} else {
			System.out.println(Arrays.toString(arr));
		}
		 
		
		
	}
}
