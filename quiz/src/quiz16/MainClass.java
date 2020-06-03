package quiz16;

public class MainClass {

	public static void main(String[] args) {
		
		Mouse mouse = new Mouse();
		Monitor monitor = new Monitor();
		
		//컴퓨터 생성
		Computer com = new Computer(new KeyBoard(), mouse, monitor);
		com.computerInfo();
		
		
		
		System.out.println("-------------------------------------------");
		//getter메서드 사용
		Monitor monitor2 = com.getMonitor();
		monitor2.info();
		
		
		
	}
}
