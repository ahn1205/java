package abs.bad;

public class SeoulStore extends HeadStore {

	@Override
	public void apple() {
		System.out.println("서울 지점사과 500원 입니다");
	}

	@Override
	public void banana() {
		System.out.println("서울 지점바나나 600원 입니다");
	}

	@Override
	public void melon() {
		System.out.println("서울 지점 멜론 700원 입니다");
	}

	//프로그래머가 실수로 메서드 재정의를 빼먹었다면..?
}
