package quiz3;

public class Tv {

	String company = "LG";
	int channel;
	boolean power;
	
	
	int changeChannel(int ch) {
		channel = ch;
		System.out.println(channel + "번 변경");
		
		return channel;
	}
	
	
	void power() {
		if(power) {
			power = false;
			System.out.println("전원을 끕니다");
		} else {
			power = true;
			System.out.println("전원을 켭니다");
		}
	}
	
	void info() {
		System.out.println("---TV의 정보---");
		System.out.println("제조사:" + company);
		System.out.println("채널:" + channel);
	}
	
	
	
	
	
	
}
