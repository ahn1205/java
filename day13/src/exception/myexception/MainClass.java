package exception.myexception;

public class MainClass {

	public static void main(String[] args) {
		
		Account acc = new Account();
		
		try {
			acc.withDraw(10000);
		} catch (MyException e) {
			System.out.println(e.getMessage());
			
			
		}
		
		
	}
}
