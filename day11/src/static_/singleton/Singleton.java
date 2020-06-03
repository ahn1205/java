package static_.singleton;

public class Singleton {

	//싱글톤패턴: 객체가 1개만 생성되도록 클래스를 구성하는 방법.
	
	/* 1. 외부에서 객체를 생성할 수 없도록 생성자를 1개만 생성하고, private을 붙임
	 */
	private Singleton() {
		
	}

	/* 2. 자신의 클래스 안에서 스스로의 객체를 1개 생성합니다 
	 */
	private static Singleton instance = new Singleton();
	
	/* 3. 외부에서 이 클래스의 객체를 요구할 경우 getter메서드를 통해서
	 *    2번에서 생성해둔 하나의 객체를 제공합니다.
	 */
	
	public static Singleton getInstance() {
		return instance;
	}
	
	
	///////////////////////////////////////////////////////
	private String name = "홍길동";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	
	
	
	
	
	
	
}
