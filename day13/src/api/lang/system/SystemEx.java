package api.lang.system;

public class SystemEx {

	public static void main(String[] args) {
		
		/*
		 * currentMillis()는 1970년에서 현재시간까지 시간을 
		 * 밀리초로 반환합니다.
		 * 
		 * 프로그램 실행 시간을 체크하는데 사용할 수 있습니다.
		 */
		
		long start = System.currentTimeMillis(); 
		
		long sum = 0;
		for(long i = 1; i <= 10000000000L; i++) {
			sum += i;
		}

		long end = System.currentTimeMillis();
		
		
		System.out.println("실행소요시간:" +  (end - start) * 0.001  );
		
		
		
		
	}


}
