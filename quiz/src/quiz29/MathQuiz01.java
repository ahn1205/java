package quiz29;

public class MathQuiz01 {

	public static void main(String[] args) {
		/*
		 * Math.ceil을 사용해서 1-10이 전달되면 1이 반환되는 page메서드 생성
		 * 11-20전달되면 2가 반환되면 됩니다.
		 * 21-30이 전달되면 3이 반환되면 됩니다. 
		 */
		
	}
	
	public static int page(int num) {
		
		int result = (int)Math.ceil( num / 10.0 );
		
		return result;
	}
	
}
