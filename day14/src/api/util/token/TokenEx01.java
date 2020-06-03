package api.util.token;

import java.util.StringTokenizer;

public class TokenEx01 {

	public static void main(String[] args) {
		
		//StringTokenizer 클래스 - 특정문자를 기준으로 문자를 잘라서 사용
		
		String str1 = "오늘 날씨는 맑고, 매우 시원합니다";
		String str2 = "2020/04/16";
		
		StringTokenizer token1 = new StringTokenizer(str1);

		System.out.println(token1.countTokens()); //토근사용전에 몇개의 토큰이 있는지 검사

		while(token1.hasMoreTokens()) { //검사할 다음 토큰이 있으면 true반환
			System.out.println(token1.nextToken());
		}

		
		System.out.println("-------------------------------------");
		
		StringTokenizer token2 = new StringTokenizer(str2, "/"); // /를 기준으로 자름
		
		while(token2.hasMoreTokens()) {
			System.out.println(token2.nextToken());
		}
		
		
		
		
		
	}
}
