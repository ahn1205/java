package quiz;

import java.util.Arrays;

public class Quiz26 {

	public static void main(String[] args) {
		/*
		int x = 1;
		int y = 5;
		
		//swap
		int temp = x;
		x = y;
		y = temp;
		System.out.println("x의 값:" + x + ", y의 값:" + y);
		*/
		
		
		int[] arr = {1,2,3,4,5,6,7,8,9};
		
		//1. 1~9까지 절대 중복 되지 않는 숫자로 만들어진 3개의 크기의 배열을 만들어내는 프로그램
		//   arr에서 절대 중복되지 않게 끔 3개의 숫자를 추출 합니다
		//   새로운 배열에 옴겨 담습니다.
		
		//arr에서 임의의 요소를 뽑아서 0, 1, 2 인덱스로 옴깁니다.
		for(int i = 0; i < arr.length; i++) {
			
			int j = (int)(Math.random() * arr.length);  //0~8
			
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		System.out.println(Arrays.toString(arr));

		//for문을 통해서 0, 1 , 2인덱스의 값을 옴깁니다.
		int[] newArr = new int[3];
		
		for(int i = 0; i < newArr.length; i++) {
			newArr[i] = arr[i];
		}
		System.out.println(Arrays.toString(newArr));
		
		
		
		
		
	}
}
