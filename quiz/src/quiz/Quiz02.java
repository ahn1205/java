package quiz;

public class Quiz02 {
	//quiz01
	public static void main(String[] args) {
		
		int result = (int)(Math.random() * 100) + 1;
		
		System.out.println("랜덤값:" + result);
		
		System.out.println("결과:" +  (result % 2 == 0 ? "짝수" : "홀수")  );
		
		
		
		
	}
}
