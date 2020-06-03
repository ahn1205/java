package quiz6;

public class MainClass {

	public static void main(String[] args) {
		
		Student s1 = new Student("홍길동", 123 ,50, 50, 60);
		System.out.println("합계:" + s1.getTotal() );
		System.out.println("평균:" + s1.getAvg() );
		
		Student s2 = new Student("홍길자", 124, 60, 40, 30);
		System.out.println("합계:" + s2.getTotal() );
		System.out.println("평균:" + s2.getAvg() );
		
	}
}
