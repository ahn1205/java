package quiz9;

public class MainClass {

	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		cal.add(1);
		cal.add(1, 2);
		cal.add(1, 2, 3);
		System.out.println("결과:" +cal.result);
		
		System.out.println("----------------------");
		
		
		ArrayPrint ap = new ArrayPrint();
		
		String[] arr = {"홍길동", "이순신", "dfsdf"};
		int[] arr2 = {1,2,3,4,5,6,7};
		
		System.out.println( ap.printArray(arr)  );
		System.out.println( ap.printArray(arr2) );
		
		
		
		
		
		
		
	}
}
