package abs.good;

public class MainClass {

	public static void main(String[] args) {
		
		//1. 추상클래스(추상메서드)를 사용하면 오버라이딩이 강제화 되기때문에
		//   프로그래머의 오버라이딩 실수를 줄일 수 있습니다.
		
		//2. 다형성을 안전하게 사용할 수 있게 해주는 원리.

		//추상클래스는 객체로 생성할 수 없습니다
		//HeadStore h = new HeadStore();
		
		HeadStore s = new SeoulStore();
		System.out.println("상호명:"+ s.getName() );
		s.apple();
		s.banana();
		s.orange();
		s.melon();
		s.mango();
		
		System.out.println("------------------------");
		
		HeadStore b = new BusanStore();
		System.out.println("상호명:" + b.getName());
		b.apple();
		b.banana();
		b.orange();
		b.melon();
		b.mango();
		
		
	}
}
