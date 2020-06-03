package day05;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDelete {

	public static void main(String[] args) {
		/*
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		//4번째 인덱스 삭제를 표현.
		for(int i = 4; i < arr.length - 1; i++ ) {
			arr[i] = arr[i+1];
		}
		System.out.println(Arrays.toString(arr));
		*/
		
		Scanner scan = new Scanner(System.in);
		String[] arr = {"강타", "문희준", "토니안", "장우혁", "이재원" };	
		
		System.out.print("삭제할 학생의 별명을 입력하세요>");
		String name = scan.next();
		
		int count = arr.length;
		boolean chk = true;
		
		for(int i = 0; i < count; i++) {
			
			if(name.equals(arr[i])  ) { //삭제할 학생을 찾은 경우
				System.out.println(arr[i] + "학생을 삭제 합니다");
				
				for(int j = i; j < count-1; j++) {
					arr[j] = arr[j+1];
				}
				//삭제의 의미
				chk = false;
				count--;
			}
			
		}
		
		if(chk) {
			System.out.println("별명이 존재하지 않습니다");
		} else {
			System.out.println("------삭제후 정보------");
			for(int i = 0; i <count; i++) {
				System.out.print(arr[i] + " ");
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
