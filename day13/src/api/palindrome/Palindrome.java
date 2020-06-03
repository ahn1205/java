package api.palindrome;

public class Palindrome {
	
	public static String palindrome(String word) {

		word = word.replace(" ", "");
		for(int i = 0; i < word.length() / 2 ; i++) {

			if(word.charAt(i) !=  word.charAt( word.length() -1 -i )    ) {
				return "회문이 아닙니다";
			}
		}

		return "회문 입니다";
	}

	
}
