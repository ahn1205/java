package quiz11;

public class MainClass {

	public static void main(String[] args) {
		
		MyCart cart = new MyCart(2000);
		cart.buy("tv");
		cart.buy("com");
		cart.buy("com");
		cart.buy("radio");
		cart.buy("tv");
		
		

	}
}
