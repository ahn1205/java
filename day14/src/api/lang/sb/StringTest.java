package api.lang.sb;

public class StringTest {

	public static void main(String[] args) {
		
		long start = System.currentTimeMillis();
		
//		String s = "";
//		for(int i = 1; i <= 300000; i++) {
//			s += "A";
//		}
		
		StringBuffer sb = new StringBuffer();
		for(int i = 1; i <= 300000; i++) {
			sb.append("A");
		}
				
		long end = System.currentTimeMillis();
		
		System.out.println("수행시간:" +  (end - start) * 0.001);
		
		
		
		
		
	}
}
