package static_.singleton;

public class MainClass {

	public static void main(String[] args) {
		
//		Singleton.instance = null;
//		System.out.println(Singleton.instance);
		
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		Singleton s3 = Singleton.getInstance();
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		System.out.println(s1.getName() );
		System.out.println(s2.getName() );
		System.out.println(s3.getName() );
		
	}
}
