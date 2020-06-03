package quiz27;

public class MainClass {

	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		
		try {
			int result = cal.input();
			System.out.println("결과:" + result);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
				
		
	}
}
