package quiz20;

public class MainClass {

	public static void main(String[] args) {
		
		Shape r = new Rect("정사각형", 5);
		
		System.out.println(r.getName());
		System.out.println(r.getArea());
		
		Shape c = new Circle("원", 4);
		System.out.println(c.getName());
		System.out.println(c.getArea());
		
	}
}
