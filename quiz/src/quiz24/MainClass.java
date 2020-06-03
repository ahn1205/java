package quiz24;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		IBag bag = new Bag();
		
		while(true) {
			
			System.out.println("메뉴: 1.추가 2.출력 3.검색 4.삭제");
			System.out.print("메뉴입력>");
			String menu = scan.next();
			
			switch (menu) {
			case "1":
				System.out.print("추가할 아이템>");
				String item = scan.next();
				bag.insert(item);
				
				break;
			case "2":
				System.out.print("아이템>");
				bag.print();
				
				break;
			case "3":
				
				System.out.print("찾을 아이템>");
				String find = scan.next();
				int index = bag.search(find);
				System.out.println(index + "번째에 있습니다");
				
				break;
			case "4":
				
				System.out.print("삭제할 아이템>");
				String del = scan.next();
				boolean bool = bag.delete(del);
				System.out.println("삭제여부:" + bool);
				
				break;
			default:
				break;
			}
			
			
			
		}
		
		
	}
}
