package quiz17;

public class MainClass {

	public static void main(String[] args) {
		
		
		Warrior me = new Warrior("나");
		Warrior w1 = new Warrior("강한친구");
		Wizard w2 = new Wizard("구르미그린달빛");

		me.bash(w1);
		me.bash(w2);
		
		System.out.println("----------------");
		me.info();
		w1.info();
		w2.info();
		
		System.out.println("----------------");
		Player[] arr = {me, w1 };
		w2.blizzard(arr);
		w2.blizzard(arr);
		w2.blizzard(arr);

		me.info();
		w1.info();
		
		
		
		
		
	}
}
