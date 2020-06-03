package quiz4;

public class Person {

	String name;
	int age;
	int tall;
	//기본생성자
	Person() {
		
	}
	
	Person(String pName, int pAge, int pTall) {
		name = pName;
		age = pAge;
		tall = pTall;
	}
	
	
	void info() {
		System.out.println("--Person정보---");
		System.out.println("이름:" + name);
		System.out.println("나이:" + age);
		System.out.println("키:" + tall);
	}
	
}
