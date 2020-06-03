package quiz22;

public abstract class ChildMenu {
	//부모클래스
	
	public int rice;
	public int bulgogi;
	public int yogurt;
	public int icecream;
	public int milk;
	
	public ChildMenu(int rice, int bulgogi, int yogurt, int icecream, int milk) {
		super();
		this.rice = rice;
		this.bulgogi = bulgogi;
		this.yogurt = yogurt;
		this.icecream = icecream;
		this.milk = milk;
	}
	
	public abstract int calculating(); 
	
}
