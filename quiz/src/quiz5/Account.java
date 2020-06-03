package quiz5;

public class Account {

	String name;
	String password;
	int balance;
	
	Account() {
		
	}
	//생성자
	Account(String pName, String pw, int bal) {
		name = pName;
		password = pw;
		balance = bal;
	}
	//입금기능
	void deposit(int money) {
		balance += money;
	}
	//출금기능
	void withDraw(int money) {
		balance -= money;
	}
	//잔액조회
	int getBalance() {
		return balance;
	}
	
	
}
