package day07;

public class Variable {

	//멤버변수: 초기화 하지않으면 자동으로 초기화
	int a;
	
	//메서드 선언.
	void printNumber(int c) {
		
		int b = 1;
		System.out.println("멤버:" + a);
		System.out.println("지역:" + b);
		System.out.println("매개:" + c);
		
	}
	 
	
	
	
	
}
