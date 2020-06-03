package abs.good;

public class SeoulStore extends HeadStore {

	@Override
	public void apple() {
		System.out.println("서울지점 사과는 600원");
	}

	@Override
	public void banana() {
		System.out.println("서울지점 바나나 700원");
	}

	@Override
	public void orange() {
		System.out.println("서울지점 오렌지 800원");
	}

	@Override
	public void melon() {
		System.out.println("서울지점 멜론은 900원");
	}

}
