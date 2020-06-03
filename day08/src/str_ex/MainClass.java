package str_ex;

public class MainClass {

	public static void main(String[] args) {
		
		String str1 = "홍길자";
		String str2 = "홍길자";
		String str3 = new String("홍길자");
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		
		System.out.println("------------------------------");
		
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		
		/*
		 * 같은 클래스 내부에서 문자열을 저장하더라도, 직접 String객체 생성을 내리거나
		 * 다른 클래스에서 넘어오는 String은 다른 주소를 가지게 됩니다.
		 * 
		 * 문자열에 비교시에는 == 대신에 String클래스가 제공하는 equals() 메서드를 통해서
		 * 문자열 동등비교를 해야합니다.
		 * 
		 */
		
		//equals()는 문자열 그 자체를 비교해서 동일하면 true, 다르면 false를 반환합니다.
		if(str1.equals(str3) ) {
			System.out.println("문자열 자체가 같음");
		}
		
		
		
		
		
		
		
	}
}
