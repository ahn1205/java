package api.lang.object;

public class MainClass {

	public static void main(String[] args) {
		
		Person p = new Person("홍길동");
		String name = p.getName();
		
		System.out.println( p.toString() );
		
		Person p2 = new Person("홍길자");
				
		System.out.println(  p.equals(p2) );
		

		p = null;
		p2 = null;
		System.gc();
		
		
		
		
	}
}
