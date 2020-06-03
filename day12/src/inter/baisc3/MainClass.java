package inter.baisc3;

public class MainClass {

	public static void main(String[] args) {
		
		Printed p = new Samsung();  //new LG();
		
		p.turnOn();
		p.print("마바사");
		p.colorPrint("가나다라", "검정");
		p.copy(10);
		p.turnOff();
		
		
		
	}
}
