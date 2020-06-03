package day07;

//설계도 클래스는 메인메서드가 없습니다.
public class Pen {

	//클래스 속성을 나타내는 것을 멤버변수(필드) 라고 부릅니다.
	String ink;
	int price;
	String company;
	
	//클래스 안에 기능을 나타내는 것을 메서드로 라고 부릅니다.
	void write() {
		System.out.println(ink + "색상 글씨를 씁니다");
	}
	
	void info() {
		System.out.println("----펜의 정보----");
		System.out.println("색상:" + ink);
		System.out.println("가격:" + price);
		System.out.println("제조사:" + company);
	}
	
	//생성자(생략)
	Pen() {
		
	}
	
	
	
	
	
	
}
