package quiz12;

public class Wizard extends Player{
	
	//name은 전달받아서 초기화, hp = 500, mp = 1000, attack = 20, armor = 3
	
	Wizard(String name) {
		this.name = name;
		this.hp = 500;
		this.mp = 1000;
		this.attack = 20;
		this.armor = 3;
	}
	
	void iceArrow() {
		System.out.println("얼음 화살 사용");
	}
}
