package quiz;

public class Quiz12 {

	public static void main(String[] args) {
		
		String[] arr = {"안녕", "hello", "니하오", "#$%"};
		
		/*
		Math.random()을 이용해서 0~3랜덤수를 발생 시킵니다.
		해당 랜덤수를 배열의 index에 적용
		선택된 단어가 한국어, 영어, 중국어 인지 처리해주세요.
		*/
	
		int index = (int)(Math.random() * arr.length);
		System.out.println("선택된단어:" + arr[index]  );
		
		switch (arr[index] ) {
		case "안녕":
			System.out.println("한국어 입니다");
			break;
		case "hello":
			System.out.println("영어 입니다");
			break;
		case "니하오":
			System.out.println("중국어 입니다");
			break;
		default:
			System.out.println("알수 없는 언어 입니다");
			break;
		}
	}
}
