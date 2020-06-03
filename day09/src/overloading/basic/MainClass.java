package overloading.basic;

public class MainClass {

	public static void main(String[] args) {
		
		Basic b = new Basic();
		b.input(1);
		b.input("1");
		b.input(1, 3.14);
		b.input(3.14 , 1);
		
		
	}
}
