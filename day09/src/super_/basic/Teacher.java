package super_.basic;

public class Teacher extends Person {

	String subject;
	
	//3개 생성자
	Teacher(String name, int age, String subject) {
		super(name, age);
		this.subject = subject;
	}
	
	String info() {
		return super.info() + ", 과목:" + subject;
	}
	
	
}
