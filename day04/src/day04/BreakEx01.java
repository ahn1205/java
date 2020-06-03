package day04;

public class BreakEx01 {

	public static void main(String[] args) {
		
		/*
		 * 무한반복문
		 * - 반복문의 횟수를 정확히 모를 때 주로 사용하면서,
		 *   자바에서는 while(true)문장을 많이 사용합니다.
		 * 
		 * 특정 조건에서 반복문을 종료시키는 형태로  사용합니다. 
		 */
		
		int i = 1;
		while(true) {
			
			if(i == 15) {
				break;
			}
			
			
			System.out.println(i);
			
			
			i++;
		}
		
		
	}
}
