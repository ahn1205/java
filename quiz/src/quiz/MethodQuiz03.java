package quiz;

public class MethodQuiz03 {

	public static void main(String[] args) {
		String result = java(10);
		System.out.println(result);

		
		System.out.println("약수의합:" + sum(10)  );
		System.out.println("소수의 개수:" + primeNum(10));
		System.out.println(sumNum(3, 5));
		
	}
	static String java(int a) {

		String str = "";
		for(int i = 1; i <= a; i++) {
			str = i % 2 == 1 ? (str+="자") : (str+="바");
		}
		
		return str;
	}

	static int sum(int n) {
		
		int sum = 0;
		for(int i = 1; i<= n; i++) {
			if(n % i == 0)
				sum += i;
		}
		return sum;
	}

	static int primeNum(int n) {
		
		int prime = 0;
		for(int i = 1; i <= n; i++) {
			
			int count = 0;
			for(int j = 1; j <= i; j++) {
				
				if(i % j == 0)
					count++;
				
				if(count > 2) break; 
					
			} //내부 for문 끝
			
			if(count == 2)
				prime++;
		}
		
		return prime;
	}
	
	static int sumNum(int a, int b) {
		
		if(a > b ) {
			
			int sum = 0;
			for(int i = b; i <= a; i++) {
				sum += i;
			}
			return sum;
			
		} else if( a < b ) {
			
			int sum = 0;
			for(int i = a; i <= b; i++) {
				sum += i;
			}
			return sum;

		} else {
			
			return a;
		}
		
		
	}
	
	
}





