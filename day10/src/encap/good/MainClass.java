package encap.good;

import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) {
		
		MyDate me = new MyDate();
		me.setYear(2020);
		int year = me.getYear();
		System.out.println("년:" + year); 
		
		
		me.setMonth(12);
		int month = me.getMonth();
		System.out.println("월:" + month);
		
		
		/////////////////////////////////////////////////////////
		
		Member m1 = new Member("hh123", "1234", "홍길동", "google", "서울", 010, 20);
		Member m2 = new Member("kk123", "12345", "홍길자", "naver", "경기", 010, 30);
		Member[] arr2 = new Member[2];
		arr2[0] = m1;
		arr2[1] = m2;
		
		for(int i = 0; i < arr2.length; i++) {
			Member m = arr2[i];
			System.out.println(m.getId());
			System.out.println(m.getPw());
		}
		
		
		
		
		
		
		
		
	}
}
