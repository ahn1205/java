package quiz;

public class Quiz03 {
	//quiz02
	
	public static void main(String[] args) {
		
		int result = 5 - (int)(Math.random() * 11); //-5~5
		System.out.println("랜덤값:" + result);
		System.out.println("절대값:" + (result < 0 ? -result: result) );
		
	}
}
