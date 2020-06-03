package quiz36;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Filecopy {
	public static void main(String[] args) {
		/*
		 * 1.스케너를 통해서 파일 명을 정확히 입력받습니다 .
		 * 
		 * 2. upload폴더에 해당파일이 있다면, 해당파일을 uploadcopy폴더로 복사하세요 
		 * 	파일이 없다면 파일명이 없습니다. 예외 구문을 출력합니다 .
		 * 
		 * 3. 복사도중에 에러가 발생하면 "파일 처리줄 예외발생" 구문을 출력.
		 */
		FileInputStream oldFile = null;
		FileOutputStream newFile= null;
		Scanner scan = new Scanner(System.in);
		try {
			System.out.print("복사할 파일명 입력");
			String name = scan.next();
			oldFile= new FileInputStream("D:\\course\\java\\upload\\"+name+".pdf");//읽을 경로
			newFile= new FileOutputStream("D:\\course\\java\\uplaodcopy\\"+name+"copy.pdf");//복사할 경로 


			int result;
			byte[] arr = new byte[100];
			while((result =oldFile.read(arr))!= -1) { 
				newFile.write(arr, 0, result);
				
			}
			System.out.println("파일이 정상적으로 복사 되었습니다.");
			
		}catch(FileNotFoundException e) {
			System.out.println("선택하신 파일명이 없습니다.");
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				scan.close();
				oldFile.close();
				newFile.close();
				
			} catch (Exception e2) {

			}
		}
	}
}
