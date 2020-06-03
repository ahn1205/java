package day04;

public class MultiForEx02 {

	public static void main(String[] args) {

		//조건이 바뀌는 for문

		/*
		 *  *
		 *  **
		 *  ***
		 *  ****
		 *  ***** 
		 */

		int star = 5;
		for(int i = 0; i < star; i++) { //행을 나타내는 for문

			for(int j = 0; j < i+1; j++) { //출력
				System.out.print("★");
			}

			System.out.println(); //줄바꿈
		}

		System.out.println("-------------------------");

		/*
		 * *****
		 * ****
		 * ***
		 * **
		 * *
		 * 
		 */


		for(int i = 0; i < star; i++) { //행을 나타내는 for문

			for(int j = 0; j < star-i; j++) {
				System.out.print("★");
			}

			System.out.println();
		}


		System.out.println("-------------------------");

		/*
		 * ****
		 * ***
		 * **
		 * *
		 * 
		 * 
		 */
		
		star = 10;
		for(int i = 0; i < star; i++) { //행의 수.
			
			for(int j = 0; j < star-1-i; j++) { //공백 출력
				System.out.print("   ");
			}
	
			for(int j = 0; j < 2*i + 1; j++) {
				System.out.print("★");
			}
			
			System.out.println();
		}









	}

}
