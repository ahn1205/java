package day06;

public class MethodEx01 {

	public static void main(String[] args) {
		
		/*
		 * 메서드는 메서드 내부에 선언할 수 없습니다.
		 * main밖에, 클래스 안 어디서든 선언할 수 있습니다.
		 */
		

		System.out.println("1~100까지 합:" +  calSum() );
		System.out.println("1~100까지 합:" +  calSum() );
		System.out.println("1~100까지 합:" +  calSum() );
		
		int result = calSum();
		System.out.println("1~100까지 합:" + result);
		
		String result2 = randomStr();
		System.out.println("결과:" + result2);
		
		String result3 = randomStr2();
		System.out.println("결과:" + result3);
		
	} //메인 끝
	
	static int calSum() {
		
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			sum += i;
		}
		
		return sum;
	}
	
	static String randomStr() {
		
		String str = "";
		for(char c = 'A'; c <= 'Z'; c++) {
			str += c;
		}
		
		return str;
	}
	
	static String randomStr2() {
		double d = Math.random();

		if(d > 0.66) {
			return "가위";
		} else if(d > 0.33) {
			return "바위";
		} else {
			return "보";
		}
		
	}
	
	
	
	
	
	
	
	
}
