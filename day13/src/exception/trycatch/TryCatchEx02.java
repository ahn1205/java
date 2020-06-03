package exception.trycatch;

public class TryCatchEx02 {

	public static void main(String[] args) {
		
		String[] greeting = {"홍길동", "홍길자", "이순신" };
		
		int i = 0;
		while(i < 4) {
			
			try {
				System.out.println(greeting[i]);
				
				
			} catch (Exception e) {
				System.out.println("배열의 참조범위를 벗어났습니다");
			} finally {
				System.out.println("이 문장은 예외 여부와 상관없이 항상 출력됩니다");
			}
						
			i++;
		}
		
		System.out.println("프로그램 정상 종료");
		
		
		
		
		
		
		
	}
}
