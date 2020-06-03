package static_.init;

public class Computer {

	static String company; 
	static String model;
	int price;
	
	//static 변수는 정적 초기화자에서 합니다.
	static {
		System.out.println("정적초기화자 호출");
		company = "LG";
		model  = "gram";
	}
		
	//일반 멤버변수는 생성자에서 초기화
	Computer(int price) {
		System.out.println("생성자 호출");
		this.price = price;
	}
	
	
	
	
}
