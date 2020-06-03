package static_.method;

public class Count {

	public int a;
	public static int b;
	
	//일반메서드 - 일반멤버변수, 정적멤버변수 모두 사용이 가능.
	public int method1() {
		a = 10;
		return ++b;
	}
	
	//정적메서드 - static이 붙은 변수나 메서드만 사용 가능.
	//        - 단, 객체생성을 통해서는 일반 변수의 사용이 가능.
	public static int method2() {
		//a = 10;
		Count c = new Count();
		c.a = 10;
		
		return ++b;
	}
	
	
	
}
