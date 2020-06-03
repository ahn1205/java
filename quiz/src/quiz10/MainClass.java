package quiz10;

public class MainClass {

	public static void main(String[] args) {
		/* 요구사항
		 * Calculator를 부모클래스로 선언하세요.
		 * Calculator를 상속받는 Computer클래스 생성 합니다.
		 * 
		 * Calculator의 멤버변수 result, pi를 선언하세요
		 * Calculator의 메서드
		 * add(int) - result에 값을 누적시키는 기능
		 * sub(int) - result에 값을 차감시키는 기능
		 * multi(int) - result에 값을 곱하기 기능 
		 * div(int) - result에 값을 나누는 기능
		 * circle(int) - pi를 이용해서 원의 넓이를 구하는 기능
		 * ------------------------------------------------------------------
		 * Computer 클래스의 메서드
		 * circle()메서드를 오버라이딩 하고, pi대신 하는 Math.PI를 사용해서 원의 넓이를 구하세요.
		 * rect(double) - 정사각형의 넓이 를 리턴
		 * rect(double, double) - 직사각형의 넓이 를 리턴
		 * rect(double, double, double) - 직육면체의 넓이 를 리턴
		 * 
		 * 
		 * 메인클래스에서 Calculator, Computer를 생성하고 메서드를 확인하세요.
		 */
		
		Calculator cal = new Calculator();
		System.out.println( cal.add(10) );
		System.out.println( cal.sub(5)  );
		System.out.println( cal.multi(4) );
		System.out.println( cal.div(2) );
		System.out.println( cal.circle(5) );
		
		System.out.println("-----------------------------");
		
		Computer com = new Computer();
		System.out.println( com.add(10) );
		System.out.println( com.sub(5)  );
		System.out.println( com.multi(4) );
		System.out.println( com.div(2) );
		System.out.println( com.circle(5)); //오버라이딩 된 메서드
		
		System.out.println( com.rect(3) ); //오버로딩
		System.out.println( com.rect(3, 4)); //오버로딩
		System.out.println( com.rect(3, 4, 5)); //오버로딩
		
		
		
		
		
	}
}
