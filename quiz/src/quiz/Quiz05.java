package quiz;

public class Quiz05 {

	public static void main(String[] args) {
		
		//-5~5까지 랜덤값을 만들고 0이라면 0출력 양수라면 양수, 음수라면 음수 출력
		
		int result = 5 - (int)(Math.random() * 11); //-5~5
		
		System.out.println(  result == 0 ? "0" : (result < 0 ? "음수" : "양수")   );
		
		
		
		
		
		
	}
}
