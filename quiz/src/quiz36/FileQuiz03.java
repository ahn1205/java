package quiz36;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class FileQuiz03 {
	public static void main(String[] args) {
		/*
		 * 1.date클래스를 이용해서 File경로에 하위폴더로 20200421file 폴더를 생성ㅅ합니다.
		 * 2.스케너로 파일명을 입력받고 bufferedWriter를 이용해서 .txt파일을 생성합니다.
		 * 3.그만 입력을 받을때 까지 엔터를 포함해서 입력을 받습니다.
		 * 		\r \n 적절하게 이용해서 파일 출력 완료
		 *  4. 파일을 다 썻다면 아무방법으로 읽어들여서 이클리스 창에 출력
		 */
		Date date = new Date();
		FileWriter fw = null;
		BufferedWriter br = null;
		Scanner scan = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		String now = sdf.format(date);
		
		System.out.println("파일명 입력");
		String name = scan.next();
		scan.nextLine();//엔터 값을 잡아주는것 
		
		
		try {
			File file = new File("D:\\course\\java\\file\\"+now);
			if(!file.exists()) {
				file.mkdir();
				System.out.println("폴더 생성완료");
			}else {
				System.out.println("이미있는 폴더 입니다.");
			}
			fw = new FileWriter("D:\\course\\java\\file\\"+now+"\\"+name+".txt");
			br = new BufferedWriter(fw);
			
			while(true) {
				System.out.println("그만 입력시 탈출");
				System.out.println("문장 입력");
				String str = scan.nextLine();
				if(str.equals("그만")) {
					break;
				}
				br.write(str+"\r\n");
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
				fw.close();
				scan.close();
			} catch (Exception e2) {

			}
		}
		
		FileReader fr = null;
		BufferedReader bbr = null;
		try {
			fr = new FileReader("D:\\course\\java\\file\\"+now+"\\"+name+".txt");
			bbr = new BufferedReader(fr);
			String nn;
			while((nn=bbr.readLine())!=null) {
				System.out.println(nn);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				bbr.close();
				fr.close();
				
			} catch (Exception e2) {
				
			}
		}
		
		
	}
}
