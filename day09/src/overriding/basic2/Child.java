package overriding.basic2;

public class Child extends Parent {

	void method2() {
		System.out.println("자식의 재정의 된 2번 메서드 호출");
	}
	
	void method3() {
		System.out.println("자식의 3번 메서드 호출");
	}
	
}
