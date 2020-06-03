package quiz;

import java.util.Scanner;

public class Quiz11 {

	//quiz07
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("구입할 메뉴는?");
		System.out.println("[수박, 사과, 멜론, 귤, 포도]");
		System.out.print(">");
		String menu = scan.next(); 
		
		switch (menu) {
		case "수박":
			System.out.println(menu + "는 2만원 입니다");
			break;
		case "사과":
			System.out.println(menu + "는 3만원 입니다");
			break;
		case "멜론":
			System.out.println(menu + "는 4만원 입니다");
			break;
		case "귤":
			System.out.println(menu + "는 5만원 입니다");
			break;
		case "포도":
			System.out.println(menu + "는 6만원 입니다");
			break;
		default:
			
			System.out.println(menu + "는 없습니다");
			break;
		}
	}
	
	
}
