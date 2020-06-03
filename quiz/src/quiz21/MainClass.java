package quiz21;

public class MainClass {

	public static void main(String[] args) {
		
		Marine m1 = new Marine();
		Marine m2 = new Marine();
		Marine m3 = new Marine();
		Marine m4 = new Marine();
		
		Tank t1 = new Tank();
		Tank t2 = new Tank();
		
		DropShip ship = new DropShip();

		m1.move(4, 4);
		
		
		//ship.ride(m1);
		ship.ride(m1);
		ship.ride(t1);
		ship.ride(t2);
		
		ship.ride(m1);
		ship.ride(m1);
		ship.ride(m1);
//		ship.ride(m1);
//		ship.ride(m1);
//		ship.ride(m1);
//		ship.ride(m1);
		
		
		
		
		
		
		
		
	}
}
