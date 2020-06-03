package generic.basic03;

public class ITBank {
	
	//Course<?> - ?는 뭐든 다 들어갈 수 있다.
	//Course<? extends Student> - Student의 자식클래스는 다 들어갈 수 있다.
	//Course<? super Student> - Student의 형태라면 다 들어 갈 수 있다.
	
	//제네릭 클래스를 매개변수로
	public void info(Course<Student> c) {
		
		String num = c.getNum();
		Student student = c.getStudent();
		
		System.out.println("번호:" + num + ", 이름:" + student.getName() + ", 나이:" + student.getAge());
		
		
	}

	//제네릭 클래스를 반환유형으로
	
	public Course<Student> get() {
		
		Course<Student> c = new Course<>();
		c.setNum("2");
		c.setStudent( new Student("홍길순", 30) );
			
		
		return c;
	}
	
	
}
