package quiz35;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Member implements Book{

	private String name;
	private String adress;
	private String phone;
	private List<String> book=new ArrayList<>();
	
	@Override
	public String lend(String book) {
		this.book.add(book);
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd");
		String now = sdf.format(date);
		return now;
	}
	@Override
	public int back(String book, int day ) {
		this.book.remove(book);
		if(day <=7) {
			return 0;
		}else 
		return day*500;
	}
	@Override
	public void info() {
		System.out.println("회원 정보");
		System.out.println("이름: "+name+"주소:"+adress+"전화번호:"+phone);
		for(int i = 0; i <book.size();i++) 
			System.out.println(book.get(i));
	}
	
	public Member(String name, String adress, String phone) {
		super();
		this.name = name;
		this.adress = adress;
		this.phone = phone;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public List<String> getBook() {
		return book;
	}
	public void setBook(List<String> book) {
		this.book = book;
	}
	
	
}
