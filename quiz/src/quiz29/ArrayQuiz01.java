package quiz29;

import java.util.Arrays;

public class ArrayQuiz01 {

	public static void main(String[] args) {


		String[] participant = {"홍길동","홍길자", "이순신", "신사임당"};
		String[] completion = {"홍길동", "신사임당", "이순신"};

		System.out.println( solution(participant, completion) );;
	}
	
	public static String solution(String[] participant, String[] completion) {
		
		Arrays.sort(participant); //정렬
		Arrays.sort(completion);

		for(int i = 0; i < completion.length; i++) {
			if(! participant[i].equals(completion[i])) {
				return participant[i];
			}
		}

		return participant[participant.length-1]; //마지막 번째에 포함된 경우 참가자의 마지막번째를 반환

	}
}
