package generic.baisc01;

public class MainClass {

	public static void main(String[] args) {
		
		//제네릭을 사용하면, 객체로 생성할 때 사용할 타입을 지정할 수 있고,
		//다양한 값을 저장하도록 생성할 수 있습니다.
		
		
		ABC<String> abc = new ABC<>(); //생성자의 타입은 생략이 가능함
		abc.setT("홍길자");
		String name = abc.getT();
		
		//ABC<int> abc2 = new ABC<int>(); //제네릭에는 기본형이 저장될 수 없습니다
		ABC<Integer> abc2 = new ABC<>();
		abc2.setT(1);
		int num = abc2.getT();
		
		
		ABC<Person> abc3 = new ABC<>();
 		abc3.setT( new Person() );
		Person p = abc3.getT();
 		
 		
 		
		
		
		
		
	}
}
