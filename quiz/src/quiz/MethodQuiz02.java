package quiz;

import java.util.Arrays;

public class MethodQuiz02 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		System.out.println("배열의길이:" + method07(arr) );
		
		String[] arr2 = method08("안녕", "하세요");
		System.out.println(Arrays.toString(arr2) );
	}
	
	static int maxNum(int a, int b) {
		return a > b ? a : b;
	}
	
	static int abs(int a) {
		
		int result = 0;
		
		if(a < 0) {
			result = -a;
		} else {
			result = a;
		}
		
		return result;
	}
	
	static int method07(int[] arr) {
		return arr.length;
	}
	
	static String[] method08(String a, String b) {

		String[] arr = {a, b};
		
		return arr;
	}
	
	
	
	
	
}
