package quiz12;

public class MainClass {

	public static void main(String[] args) {
		
		Warrior w1 = new Warrior("강한친구");

		Wizard w2 = new Wizard("구르미그린달빛");

		w1.info();
		w1.bash();
		
		w2.info();
		w2.iceArrow();
	}
}
