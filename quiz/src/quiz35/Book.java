package quiz35;

public interface Book {
	public String lend(String book); 
	//Member안에 정보가 있는지 확인 있으면 대여 가능 없으면 불가
	//책을 빌리면 String[]에 저장, 일주일 대여기간을 반환하는 메서드
	public int back(String book, int day);
	//대여기간 넘기지 않으면 0, 넘기면 넘긴 요일당 *500반환 
	public void info();
	//Member에 회원정보
	
}
