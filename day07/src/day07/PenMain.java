package day07;

public class PenMain {

	public static void main(String[] args) {
		//Pen의 기능 속성을 쓰려면 설계용클래스를 객체로 생성해야합니다.
		//객체의 기능과 속성을 사용할 때는 참조연산자 .을 사용합니다.
		Pen black = new Pen();
		black.ink = "검정";
		black.price = 500;
		black.company = "모나미";
		
		black.write();
		
		Pen red = new Pen();
		red.ink = "빨강";
		red.price = 1000;
		red.company = "하이테크";
		
		red.write();
		
		
		black.info();
		red.info();
		
		
		
		
		
		
		
	}
}


