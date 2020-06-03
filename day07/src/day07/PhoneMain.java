package day07;

public class PhoneMain {

	public static void main(String[] args) {
		
		Phone basic = new Phone();
		basic.info();
		
		Phone black = new Phone("블랙");
		black.info();
		
		Phone white = new Phone("하얀", 400000);
		white.info();
		
		Phone iPhone = new Phone("그레이", "아이폰PRO");
		iPhone.info();
		
		//모든 멤버변수를 받는 생성자를 생성
		//그린, 100000, 샤오미 전달해서 객체를 생성
		
		Phone shaomi = new Phone("그린", 1000000, "shaomi");
		shaomi.info();
		
		
		
		
		
		
		
		
		
		
	}
}
