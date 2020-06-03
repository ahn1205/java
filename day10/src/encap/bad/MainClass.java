package encap.bad;

public class MainClass {

	public static void main(String[] args) {
		
		//멤버변수를 public으로 선언하면 잘못된 값이 저장 될 수도 있음.
		MyDate me = new MyDate();
		me.year = 2020;
		me.month = 13;
		me.day = 100;
		me.ssn = "이게 뭐죠?";
		
		me.info();
		
	}
}
