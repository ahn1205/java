package quiz21;

public class Tank extends Unit {

	public Tank() {
		super(0, 20, 100);
	}
	
	//location과 move()의 기능은 동일
	@Override
	public void location() {
		System.out.println("탱크현재위치:" + x + "," + y);
		
	}
	
	@Override
	public void move(int x, int y) {
		
		int length = (x - this.x) * (x - this.x) + (y - this.y) * (y - this.y);
		int distance =  (int)Math.sqrt(length);
		System.out.println("탱크이동거리:" + distance);
		//위치변경
		this.x = x;
		this.y = y;
		
		location();
	}
	
	public void changeMode() {
		
	}

	
	
}
