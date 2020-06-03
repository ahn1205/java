package static_.init;

public class MainClass {

	public static void main(String[] args) {
		
		/*
		 * 클래스가 호출될 때 정적초기화자는 단 한번
		 * 호출 됩니다.
		 */
		
		
		Computer com1 = new Computer(1000);
		Computer com2 = new Computer(2000);
		Computer com3 = new Computer(3000);
		
		System.out.println(Computer.company);
		System.out.println(Computer.model);

		
	}
}
