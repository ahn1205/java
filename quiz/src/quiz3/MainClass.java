package quiz3;

public class MainClass {

	public static void main(String[] args) {
		//현실에 찾아볼 수 있는 물건, 생각해서 클래스로 표현 2개이상
		//멤버변수 2개이상, 메서드 2개이상
		//생성해서 사용.
		
		Tv tv = new Tv();
		tv.power();
		
		tv.changeChannel(10);
		tv.info();
		
		tv.power();
		
	}
}
