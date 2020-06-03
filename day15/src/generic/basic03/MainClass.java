package generic.basic03;


public class MainClass {

	public static void main(String[] args) {
		
		Course<Student> course = new Course<>();
		
		course.setNum("1");
		course.setStudent( new Student("홍길동", 20)   );
	
		///////////////////////////////////////
		//사용
		ITBank bank = new ITBank();
		bank.info(course);
		
		Course<Student> s = bank.get();

	}

	
}
