package day02;

public class OperatorCondition {

	public static void main(String[] args) {
		
		//랜덤한 double값을 발생시키는 기능 (0.0이상~ 1.0미만)
		//System.out.println(  Math.random()  );
		
		//1~10까지 랜덤값
		/*
		double d = Math.random() * 10;
		int result = (int)d + 1; //1~10
		System.out.println(result);
		*/
		
		int result = (int)(Math.random() * 10) + 1;
		System.out.println(result);
		String result2 = result % 3 == 0 ? "3의배수입니다" : "3의 배수가 아닙니다";
		System.out.println(result2);
		
		
		
		
		
		
		
		
		
	}
}
