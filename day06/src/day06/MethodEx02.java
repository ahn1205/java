package day06;

public class MethodEx02 {

	public static void main(String[] args) {
		/*
		 * 매개변수(parameter)
		 * 1. 매개변수는 메서드 호출할 때 실행에 필요한 값을 전달하는 매개체 입니다.
		 * 2. 매개변수를 몇개 받을지는 메서드를 선언할 때 결정합니다.
		 * 
		 * 3. 매개변수 여러개 받고 싶다면 ,로 연결하면 됩니다.
		 * 4. 매개변수를 받지 않는다면 () 를 비워두면 됩니다.
		 */
		
		System.out.println("1~100까지 합:" + calSum(100) );
		System.out.println("1~50까지 합:" + calSum(50) );
		System.out.println("1~10까지 합:" + calSum(10) );
		
		int result = calSum2(10, 20);
		System.out.println("10~20까지 합:" + result);
		
		String result2 = calSum3(1, 10, "가");
		System.out.println("결과:" + result2);
		
		
	} //메인 끝
	
	static int calSum(int end) {
		
		int sum = 0;
		for(int i = 1; i <= end; i++) {
			sum += i;
		}
		
		return sum;
	}
	
	static int calSum2(int start, int end) {
		
		int sum = 0;
		for(int i = start; i <= end; i++) {
			sum += i;
		}
		
		return sum;
	}
	
	static String calSum3(int start, int end, String s) {
		
		String str = "";
		for(int i = start; i <= end; i++) {
			str += s;
		}
		
		return str;
	}
	
	
	
	
	
	
}
