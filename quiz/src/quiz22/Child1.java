package quiz22;

public class Child1 extends ChildMenu{

	public Child1(int rice, int bulgogi, int yogurt, int icecream, int milk) {
		super(rice, bulgogi, yogurt, icecream, milk);

	}

	@Override
	public int calculating() {
		return rice + bulgogi + yogurt;
	}

}
