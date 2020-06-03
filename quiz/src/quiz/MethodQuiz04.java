package quiz;

import java.util.Arrays;

public class MethodQuiz04 {

	public static void main(String[] args) {
		
		int[] arr = lottoNum();
		System.out.println(Arrays.toString(arr));
		
		long money = lottoRun(arr);
		System.out.println("당첨되기까지 사용한 금액:" + money);
	}
	
	static int[] lottoNum() {
		int[] arr = new int[6];
		
		int index = 0;
		
		start:while(true) {
			if(index == 6) break;
			int num = (int)(Math.random() * 45) + 1;
			//중복검사
			for(int i = 0; i < index; i++) {
				if(num == arr[i]) continue start;
			}
			arr[index] = num;
			index++;
		}

		return arr;
	}
	
	static long lottoRun(int[] arr) {
		long count = 0;
		Arrays.sort(arr);
		
		
		while(true) {
			
			int[] arr2 = lottoNum();
			Arrays.sort(arr2);
			
			System.out.println(count++);
			
			if(Arrays.equals(arr, arr2)) { //동일한 값을 가지고 있으면 true반환
				return count * 1000;
			} else {
				count++;
			}
		}
		
	
	}
	
	
	
	
	
	
	
	
	
}
