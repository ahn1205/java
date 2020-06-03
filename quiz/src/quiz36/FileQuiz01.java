package quiz36;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class FileQuiz01 {
	public static void main(String[] args) {
		/*
		 * 1. date클래스 이용 파일 경로에 20200421.txt 이름으로 파일을 씁니다.
		 * 2. 내용은 아무거나 작성 
		 * 3. 파일 정상적으로 썻다면 BufferedReader를 통해서 파일을 읽어 들이세요 
		 */
		FileWriter fw = null;
		Scanner scan = new Scanner(System.in);
		Date date = new Date();
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
			String now = sdf.format(date);
		try {
			
			fw = new FileWriter("D:\\course\\java\\file\\"+now+".txt");
			System.out.println("문장입력하세요 ");
			String st = scan.nextLine();
			
			fw.write(st);
		} catch (Exception e) {
			
		}finally {
			try {
				fw.close();
				scan.close();
			} catch (Exception e2) {
				
			}
		}
		////////////파일 읽기///////////
		FileReader fr = null;
		BufferedReader br= null;
		try {
			fr = new FileReader("D:\\course\\java\\file\\"+now+".txt");
			br = new BufferedReader(fr);
			String data;
			while((data = br.readLine()) != null) {
				System.out.println("데이터 내용:");
				System.out.println(data);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
				fr.close();
			} catch (Exception e2) {

			}
		}
		
	}
}
