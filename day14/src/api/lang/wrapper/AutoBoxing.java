package api.lang.wrapper;

public class AutoBoxing {

	public static void main(String[] args) {
		
		//AutoBoxing: 기본타입을 자동으로 객체형으로 변환
		Integer val1 = 100;
		Double val2 = 3.14;
		
		int a = val1;
		double b = val2;
		
		//AutoBoxing이후에 wrapper클래스는 문자열을 기본형으로 변환하는데 많이 사용됩니다.
		System.out.println( Integer.BYTES ); //4
		System.out.println( Integer.MAX_VALUE); 
		
		int v1 = Integer.parseInt("3");
		double v2 = Double.parseDouble("3.14");
		long v3 = Long.parseLong("10");
		
		System.out.println(v1 + v2 + v3);
		
		
		
		
		
	}
}
