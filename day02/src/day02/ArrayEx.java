package day02;

import java.util.Arrays;

public class ArrayEx {

	public static void main(String[] args) {
		
		//1. 배열의 선언
		int[] arr;
		
		//2. 배열의 생성 - 배열은 생성시에 크기를 명시함. 한번 설정된 크기는 변경 불가
		arr = new int[5]; 
		System.out.println(arr); //0번째 상자가 만들어진 위치를 저장
		
		//3. 배열의 초기화
		arr[0] = 34;
		arr[1] = 100;
		arr[2] = 300;
		arr[3] = 56;
		arr[4] = 200;
		
		//4. 배열의 사용
		System.out.println("배열의 3번째 값:" + arr[2] );
		arr[2] = 123;
		System.out.println("배열의 3번째 값:" + arr[2]);
		
		//5. 배열의 저장된 값을 한눈에 문자열로 확인
		System.out.println( Arrays.toString(arr)  );
		
		//6. 배열의 길이를 알아보는 명령어 배열명.length
		System.out.println("배열의길이:" + arr.length);
		
		//7. 배열의 선언과 생성을 동시에 하는 방법
		byte[] arr2 = new byte[10];
		
		//8. 배열의 선언과 생성과 초기화 동시에 하는 방법
		short[] arr3 = new short[] {10,20,30,40};
		System.out.println( Arrays.toString(arr3)  );
		
		short[] arr4 = {1,2,3,4,5,6};
		System.out.println( Arrays.toString(arr4)  );
		
		
		//배열의 초기값 설정을 하지 않으면 기본값으로 초기화
		System.out.println(Arrays.toString(arr2)  );
		
		/*
		 * String배열 생성 월요일, 화요일, 수요일 저장
		 * 3개의 크기 int배열을 생성 Math.random()으로 1~3까지 랜덤값을 각각 저장 
		 */
		
		String[] arr5 = {"월요일", "화요일", "수요일" };
		System.out.println( Arrays.toString(arr5) );
		
		int[] arr6 = new int[3];
		arr6[0] = (int)(Math.random() * 3) + 1;
		arr6[1] = (int)(Math.random() * 3) + 1;
		arr6[2] = (int)(Math.random() * 3) + 1;
		System.out.println(Arrays.toString(arr6));
		
		
		//오픈채팅:강남 자바 aws국기반 , 참여코드:9138
		
		
	}
}
