package this_.basic;

public class Teacher extends Person {

	String subject;
	
	//3개 생성자
	Teacher(String name, int age, String subject) {
		this.name = name;
		this.age = age;
		this.subject = subject;
	}
	
	String info() {
		return "이름:" + name + ", 나이:" + age + ", 과목:" + subject;
	}
}
