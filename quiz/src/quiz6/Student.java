package quiz6;

public class Student {

	/*
	 * 멤버변수
	 * name - 학생이름
	 * no - 학생번호
	 * kor - 국어점수
	 * eng - 영어점수
	 * math - 수학점수
	 * 
	 * 생성자
	 * 멤버변수 5개를 초기화 하는 생성자
	 * 
	 * getTotal() - 국어, 영어, 수학 점수를 모두 더해서 합계반환
	 * getAvg() - 총점을 나눈 평균을 반환 (단, 소수점 2자리까지)
	 * 
	 * main에서는 학생의 2명을 각각 생성 하고 확인
	 */
	
	String name;
	int no;
	int kor;
	int eng;
	int math;
	
	Student(String pName, int pNo, int pKor, int pEng, int pMath) {
		name = pName;
		no = pNo;
		kor = pKor;
		eng = pEng;
		math = pMath;
	}
	
	double getTotal() {
				
		return kor + eng + math;
	}
	
	double getAvg() {
		
		return (int)((getTotal() / 3) * 100) / 100.0;
	}
	
	
	
	
	
	
	
	
}
