package exception.multicatch;

public class MainClass {

	public static void main(String[] args) {
		
		/*
		 * main메서드의 실행 매개값을 주는 방법.
		 * run -> run configurations -> arguments -> ${string_prompt}
		 */
		
		try {
			String data1 = args[0];
			String data2 = args[1];
			
			int num1 = Integer.parseInt(data1);
			int num2 = Integer.parseInt(data2);
			
			System.out.println("두수의 합:" + (num1 + num2));
			
			String s = null;
			s.charAt(0);		
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값은 반드시 2개 입력하세요"); 
		} catch (NumberFormatException e) {
			System.out.println("실행 매개값은 반드시 숫자로 입력해주세요");
		} catch (Exception e) {
			System.out.println("기타 예외 입니다");
		}
		
		
		
	}
}
