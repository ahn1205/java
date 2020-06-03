package quiz;

public class Quiz21 {

	public static void main(String[] args) {
		//금액의 동전 - 금액을 큰 금액부터 거슬러서 몇개가 나와야 하는지 처리
		int[] arr = {1000, 500, 100, 50, 10};
		
		int money = 17780; //금액

		
		int i = 0;
		while(i < arr.length) {
			System.out.println(arr[i] + "원:" + money / arr[i]);
			money %= arr[i];
			
			i++;
		}
		
		
		
		
		
	}
}
