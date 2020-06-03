package generic.bad;

public class MainClass {

	public static void main(String[] args) {
		
		ABC abc = new ABC();
		
		abc.setObj("홍길자");
		String name = (String)abc.getObj();
		
		
		
		ABC p = new ABC();
		p.setObj( new Person() );

		Person name2 = (Person)p.getObj();
		
		//Object형으로 선언하면 무엇이든 저장할 수 있지만, 반대로 저장했던 값을 사용할 때
		//타입별로 형변환을 해야하는 문제가 발생.
		//잘못 형변환 한다면 예외를 발생시킵니다.
		
		
		
		
		
		
	}
}
