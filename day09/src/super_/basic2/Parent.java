package super_.basic2;

public class Parent {

	String father;
	String mother;
	
	Parent(String father, String mother) {
		this.father = father;
		this.mother = mother;
	}
	
	
	void info() {
		System.out.println("아버지:" + father + ", 어머니:" + mother);
	}
	
	
	
}
