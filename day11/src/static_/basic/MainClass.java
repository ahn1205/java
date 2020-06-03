package static_.basic;

public class MainClass {

	public static void main(String[] args) {
		
		/*
		 * 1. 녹색, 빨강색 계산기를 각각 생성
		 * 2. 계산기 색상을 확인하세요.
		 * 3. add(int a)메서드를 추가합니다.
		 * 4. 계산기 result값도 각각 확인.
		 * 5. pi와 circle() 사용해서 원의넓이를 구하세요.
		 */
		
		Calculator cal1 = new Calculator();
		cal1.setColor("green");
		Calculator cal2 = new Calculator();
		cal2.setColor("red");
		
		System.out.println("cal1색:" + cal1.getColor());
		System.out.println("cal2색:" + cal2.getColor());
		
		cal1.add(1);
		cal2.add(10);
		System.out.println("cal1의값:" + cal1.getResult() );
		System.out.println("cal2의값:" + cal2.getResult() );
		
		
		System.out.println("----------------------------");
		
		System.out.println(Calculator.pi * 4 * 4 );
		System.out.println(Calculator.circle(4)  );
		
		
		System.out.println("---------------------------");
		
		int[] arr = {1,2,3,4,5,6,7,8};
		System.out.println( ArrayPrint.printArray(arr) );
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
