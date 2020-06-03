package abs.bad;

public class MainClass {

	public static void main(String[] args) {
		
		//재정의를 뺴먹는다면, 잘못된 메서드의 실행으로 이어질 수도 있다는 뜻입니다.
		SeoulStore s = new SeoulStore();
		s.apple();
		s.banana();
		s.melon();
		s.orange();
		
	}
}
