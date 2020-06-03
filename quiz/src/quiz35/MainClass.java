package quiz35;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class MainClass {
	/*
	 * 1.List, Set, Map을 이용해서 간단한 관리프로그램을 정합니다.
	 * (도서관리, 회원 관리, 예약 관리, 물품관리 등등)
	 * 
	 * 2.인터페이스를 반드시 하나이상 사용 합니다.
	 * book 
	 * 3.기능은 3개 이상 생성.
	 * 대여 , 반납, 회원 정보
	 * 
	 * 4.클래스를 이용 
	 * 맴버
	 * 이름, 주소 , 전화번호 , 빌려간 책임 배열
	 */
	public static void main(String[] args) {

		Set<Member> set = new HashSet<>();
		Scanner scan = new Scanner(System.in);
		String date = " ";
		while(true) {
			System.out.println("회원 정보 입력");
			System.out.println("1.회원가입| 2.대여| 3.반납| 4.회원정보 확인 |5.종료");
			int menu = scan.nextInt();

			menu:switch (menu) {
			case 1:
				System.out.println("이름을 입력하세요");
				String name = scan.next();
				System.out.println("주소 입력");
				String adress = scan.next();
				System.out.println("번호를 입력하세요 ");
				String phone = scan.next();
				Member member = new Member(name,adress, phone);
				for(Member m :set) {
					if(m.getPhone().equals(phone)) {
						System.out.println("이미등록된 회원입니다.");
						break menu;
					}
				}
				set.add(member);
				System.out.println("등록 되었습니다.");
				break;
			case 2:
				System.out.println("이름을 입력하세요");
				String name1 = scan.next();
				System.out.println("번호를 입력하세요 ");
				String phone1 = scan.next();
				for( Member m: set) {
					if(m.getPhone().equals(phone1)) {
						System.out.println("책이름 입력");
						String book = scan.next();
						date = m.lend(book);
						break menu;
					}
				}
				break;
			case 3:
				System.out.println("이름을 입력하세요");
				String name2 = scan.next();
				System.out.println("번호를 입력하세요 ");
				String phone2 = scan.next();

				for(Member m :set) {
					if(m.getPhone().equals(phone2)) {
						String book = scan.next();
						int day = scan.nextInt();
						System.out.println("연체로:"+m.back(book,day));
					}
				}

				break;
			case 4:
				System.out.println("이름을 입력하세요");
				String name3 = scan.next();
				System.out.println("번호를 입력하세요 ");
				String phone3 = scan.next();
				for(Member m:set) {
					if(m.getPhone().equals(phone3))
						m.info();
						break menu;
				}System.out.println("회원 정보가 없습니다.");
				break;
			case 5:
				System.out.println("프로그램 종료");
				scan.close();
				System.exit(menu);
				break;

			default:
				break;
			}

		}
	}

}
