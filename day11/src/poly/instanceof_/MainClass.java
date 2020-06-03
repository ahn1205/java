package poly.instanceof_;

public class MainClass {

	public static void main(String[] args) {

		//다형성 적용
		Student hong = new Student("홍길동", 20, "123");

		Teacher kim = new Teacher("김유신", 50, "역사");
		
		Employee choi = new Employee("최강창민", 20, "회계");
		
		
		printInfo(hong);
		printInfo(kim);
		printInfo(choi);
		
	}
	
	public static void printInfo(Person p) {
		
		if(p instanceof Student) { //p값이 Student라면 true반환
			Student s = (Student)p;
			System.out.println( s.info() );
		} else if(p instanceof Teacher ) {
			
			Teacher t = (Teacher)p;
			System.out.println( t.info() );
			
		} else if(p instanceof Employee) {
			
			Employee e = (Employee)p;
			System.out.println( e.info() );
		}
		
 		
		
		
		
	}
	
}
