package static_.basic;

public class Calculator {

	/*
	 * 계산기 마다 색깔이나 결과값은 다를 수 있기 때문에
	 * 일반 멤버변수로 선언합니다.
	 * 
	 * 계산기 마다 원주율은 동일하기 때문에 static변수로 선언하는게 좋습니다.
	 */
	private String color;
	private int result;
	
	public static double pi = 3.14;
	
	/*
	 * 일반 멤버변수를 참조하고 있는메서드는 static메서드로
	 * 선언하면 안됩니다.
	 */
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	
	public void add(int a) {
		result += a;
	}
	
	public int getResult() {
		return result;
	}
	
	/*
	 * 메서드 내부에서 일반 멤버변수를 쓰지 않고
	 * 범용성 있게 사용하는 메서드는 static키워드를 사용하는 편이 좋습니다.
	 */
	
	public static double circle(int r) {
		return r * r * pi;
	}
	public static double rect(int side) {
		return side * side;
	}
	
	
	
	
	
	
	
	
	
	
}
