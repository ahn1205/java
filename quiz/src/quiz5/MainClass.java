package quiz5;

public class MainClass {

	public static void main(String[] args) {
		
		Account acc = new Account("홍길자", "1234", 3000);

		acc.deposit(1000); //입금
		acc.withDraw(2000); //출금
 		
		int bal = acc.getBalance();
		System.out.println(acc.name + "님 잔액:" + bal  );
		
		
		
		
	}
}
