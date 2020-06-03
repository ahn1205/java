package quiz10;

public class Computer extends Calculator{

	/*
	 * Calculator의 기능이 생략.. 
	 */
	double circle(int n) {
		return n * n * Math.PI;
	}
	
	//오버로딩
	double rect(double a) {
		return a * a;
	}
	
	double rect(double a, double b) {
		return a * b;
	}
	
	double rect(double a, double b, double c) {
		return a * b * c;
	}
}
