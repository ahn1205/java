package static_.method;

import java.util.Arrays;
import java.util.Calendar;

public class MainClass {
	
	public static void main(String[] args) {
		
		Count c = new Count();
		c.a = 10;
		c.method1();
		
		//static메서드 사용
		Count.method2();
		Count.method2();
		
		
		//stataic메서드의 예시
//		Math.random(); 
//		String.valueOf('c');
//		Arrays.toString(배열명);
//		Integer.parseInt("1");
//		Calendar.getInstance();
		
		
	}
}
