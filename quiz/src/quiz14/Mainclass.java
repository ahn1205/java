package quiz14;

public class Mainclass {

	public static void main(String[] args) {
		
		SuperSonicAp ap = new SuperSonicAp("대한항공");
		
		System.out.println(ap.info());
		ap.takeOff();
		ap.fly();
		ap.flyMode = 1;
		ap.fly();
		ap.land();
		
		
	}
}
