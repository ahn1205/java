package quiz32;

import java.util.List;
import java.util.Scanner;

public class Point implements InterPoint {
	Scanner scan = new Scanner(System.in);
	
	@Override
	public void showPointUI() {
		System.out.println("===========================================================");
		System.out.printf("%4s%10s%10s%10s %11s%11s%11s %11s\n"
				, "학번", "이름", "국어", "영어", "수학", "총점"
				, "평균", "학점");
		System.out.println("===========================================================");
		
	}

	@Override
	public void input(List<Student> students) {
		
		Student stu = new Student();
		String result = stu.inputStuInfo();//학생정보입력
		
		for(Student s :students ) {
			if(s.getStuId().equals(result)  ) {
				System.out.println("---이미 등록된 학번입니다---");
				return;
			}
		}
		
		stu.calcTotAvg(); //평균계산 메서드
		students.add(stu); //리스트에 추가
		System.out.println(stu.getName() + "님의 정보가 정상 등록되었습니다");
	}

	@Override
	public void showAll(List<Student> students) {
		/*
	    1. 리스트 안에 들어있는 학생객체들의 정보를 반복문을 통해 전체 출력하세요.
	    2. 우리반의 전체평균을 가장 아랫부분에 출력하세요.
		 */
		showPointUI();
		
		double totalAvg = 0;
		for(Student s : students) {
			totalAvg += s.getAvg(); //학생평균
			s.outputInfo();
		}
		
		System.out.println("우리반 전체 평균:" + (totalAvg/ students.size())  );
	}

	@Override
	public void search(List<Student> students) {
		String stuid = scan.next();
		
		for( Student std : students) {
			if(std.getStuId().equals(stuid)) {
				std.outputInfo();
				return;
			}
		}
		System.out.println("찾지 못했다.");
		
	}

	@Override
	public void modify(List<Student> students) {
		String stuid = scan.next();
		for(Student std : students) {
			if(std.getStuId().equals(stuid)) {
				System.out.println("국어 점수 입력");
				int kor = scan.nextInt();
				std.setKor(kor);
				System.out.println("영어 점수 입력");
				int Eng = scan.nextInt();
				std.setEng(Eng);
				System.out.println("수학 점수 입력");
				int Math = scan.nextInt();
				std.setMath(Math);
				return;
			}
		}
		System.out.println("존재하지 않는 학번입니다.");
	}

	@Override
	public void delete(List<Student> students) {
		String stuid = scan.next();
		for(Student std:students) {
			if(std.getStuId().equals(stuid)) {
				students.remove(std);
				return;
			}
		}
		System.out.println("존재하지않는 학번입니다.");
	}

}
