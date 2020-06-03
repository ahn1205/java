package quiz28;


public class StringQuiz03 {
	
	public static void main(String[] args) {

	}
	
	public static String palindrome(String word) {

//		word = word.replace(" ", "");
//		for(int i = 0; i < word.length() / 2 ; i++) {
//
//			if(word.charAt(i) !=  word.charAt( word.length() -1 -i )    ) {
//				return "회문이 아닙니다";
//			}
//		}
//		return "회문 입니다";

		word = word.replace(" ", "");
		
		StringBuffer sb = new StringBuffer(word);
		if(sb.reverse().toString().equals(word) ) {
			return "회문입니다";
		} else {
			return "회문이 아닙니다";
		}
		
	}

	
}
