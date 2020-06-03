package quiz22;


public class MainClass {

	public static void main(String[] args) {
				
		ChildMenu c1 = new Child1(Price.RICE, 
								  Price.BULGOGI, 
								  Price.YOGURT, 
								  Price.ICECREAM,
								  Price.MILK);
		
		System.out.println("첫번째아이:" + c1.calculating());
		
		
	}
}
