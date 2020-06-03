package quiz7;

public class MainClass {

	public static void main(String[] args) {
		
		Warrior w1 = new Warrior();
		w1.hp = 1000;
		w1.mp = 500;
		w1.name = "강한친구";
		
		Wizard w2 = new Wizard();
		w2.hp = 500;
		w2.mp = 1000;
		w2.name = "구르미그린달빛";
		
		w1.info();
		w1.bash();
		
		w2.info();
		w2.iceArrow();
	}
}
