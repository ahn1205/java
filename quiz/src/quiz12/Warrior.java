package quiz12;

public class Warrior extends Player {
	
	//name은 전달받아서 초기화, hp = 1000, mp = 500, attack = 10, armor = 5 
	Warrior(String name) {
		this.name = name;
		this.hp = 1000;
		this.mp = 500;
		this.attack = 10;
		this.armor = 5;
	}
	
	
	void bash() {
		System.out.println("bash스킬 사용");
	}
}
