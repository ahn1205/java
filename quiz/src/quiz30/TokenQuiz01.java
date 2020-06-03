package quiz30;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class TokenQuiz01 {

	public static void main(String[] args) {
		/*
		 * 1. 스캐너를 통해서 nextLine() 문장을 받습니다.
		 * 2. 입력된 문자열을 토크나이저를 이용해서 공백기준으로 분리
		 * 3. 분리한 토큰의 개수를 출력
		 * 4. 분리된 토큰을 콘솔에 숫자를 붙여서 세로로 출력
		 *    1. 안녕
		 *    2. 하세요.
		 *    3. 오늘은 
		 * 5. 분리된 문자열을 배열에 저장
		 */

		Scanner scan = new Scanner(System.in);

		System.out.print("문장을 입력하세요: ");
		String str = scan.nextLine();

		//토크나이저 클래스
		StringTokenizer st = new StringTokenizer(str); //공백으로 자름
		
		String[] arr = new String[st.countTokens()];
		
		
		for(int i = 0; st.hasMoreTokens() ; i++) {
			
			String word = st.nextToken(); //다음 토큰값을 얻음
			arr[i] = word;
			System.out.println(i+1 + "." + word);
			
		}
		
		System.out.println(Arrays.toString(arr));
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
