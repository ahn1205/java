package abs.good;

public abstract class HeadStore {

	/*
	 * 1. 메서드에 abstract를 붙이면 추상메서드가 됩니다. 이 메서드는 상속을 통해
	 *    반드시 오버라이딩 해야합니다.
	 * 2. 추상메서드는 {}가 없는 메서드 이며, 세미콜론으로 메서드를 마감합니다.
	 * 3. 일반클래스에 추상메서드를 선언할 수 없습니다.
	 *    추상메서드가 하나라도 있다면, 클래스도 추상클래스가 됩니다.
	 * 4. 추상클래스는 일반메서드, 일반변수, 생성자 모두 사용할 수 있습니다.   
	 */
	
	private String name = "호식이 과일가게";
	
	public HeadStore() {
		System.out.println("추상클래스 생성자 호출");
	}
	//게터 메서드
	public String getName() {
		return name;
	}
	
	public final void mango() {
		System.out.println("망고의 가격은 2000원 입니다");
	}

	public abstract void apple();
	public abstract void banana();
	public abstract void orange();
	public abstract void melon();
	
}
