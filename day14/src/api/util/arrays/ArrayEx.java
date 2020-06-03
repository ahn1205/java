package api.util.arrays;

import java.util.Arrays;

public class ArrayEx {

	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4,5,6,7};
		
		//배열의 정렬
		Arrays.sort(arr);
				
		//배열의 검색 (선행조건: 오름차순 정렬)
		int index = Arrays.binarySearch(arr, 1);
		System.out.println("5가 있는 위치:" + index);
		
		int index2 =  Arrays.binarySearch(arr, 123);
		System.out.println(index2); //찾는 값이 없다면 쓰레기값을 돌려줍니다.
		
		//배열복사
		int[] copyArr = Arrays.copyOf(arr, arr.length );
				
		//배열문자열로 확인
		System.out.println(Arrays.toString(copyArr) );
		
		//배열복사
		int[] copyArr2 = Arrays.copyOfRange(arr, 3, arr.length);
		System.out.println(Arrays.toString(copyArr2));
				
		//배열의 내부요소가 동일한지 확인
		if(Arrays.equals(arr, copyArr)) {
			System.out.println("배열 요소가 같다");
		}
		
		
		
		
		
		
		
		
		
		
	}
}
