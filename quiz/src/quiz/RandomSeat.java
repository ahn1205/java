package quiz;

import java.util.Arrays;
import java.util.Scanner;

public class RandomSeat {

	public static void main(String[] args) {
		
		/*
		 * 1. 사람수를 입력받을 수 있습니다.
		 * 2. 입력받은 사람수만큼 랜덤값을 생성해서 배열에 중복되지 않게 랜덤으로 저장합니다.
		 * 
		 * 
		 * 3. 해당배열의 크기만큼 ○으로 출력해주세요. ㅁ한자 9
		 * 4. 스캐너를 통해서 랜덤으로 배정된 좌석을 선택할 수 있습니다.
		 * 3. 제대로 선택된 좌석이라면 자리번호를 공개하고, 제대로 선택되지 않은 좌석이면 "경고문을 띄워주세요"
		 * 
		 * 선택된자리는 ● 로 다시 표시해 주세요.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.print("배정할 좌석의 크기를 지정하세요>");
		int size = scan.nextInt();
		
		
		int[] arr = new int[size];
 		int index = 0;
 		
		start:while(true) {
			if(index == size) break; //순서가 꽉차면 탈출
			
			int seat = (int)(Math.random() * size) + 1; //1~21까지 랜덤수 발생
			//중복검사(랜덤값과 배열의 index번째가 동일한게 있다면 다시 처음부터
			for(int i = 0; i < index; i++) { 
				if( seat == arr[i]) {
					continue start;
				} 
			}
			arr[index] = seat; //랜덤값 추가
			index++;		   //배열순서 증가
		}


 		while(true) {
 			System.out.println("-----------------------좌석 선택 프로그램-----------------------");
 			for(int i = 0; i < arr.length; i++) {
 				System.out.printf("%-3d", i+1);
 			}
 			System.out.println();
 			
 			for(int i = 0; i < arr.length; i++) {
 				if(arr[i] == 0) 
 					System.out.printf("%-3s", "●");
 				else 
 					System.out.printf("%-3s", "○");
 			}
 			System.out.println();
 			 			
 			System.out.print("좌석 선택>");
 			int seat = scan.nextInt();

 			if(arr[seat -1] == 0 ) 
 				System.out.println("제대로 선택하실래요?");
 			else {
 				System.out.println("자리번호를 공개합니다:" + arr[seat-1]);
 				arr[seat-1] = 0;
 			}
 			
 			
 			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				System.out.println("선택중 에러발생");
			}
 		}
		
		
		
		
	}
}
