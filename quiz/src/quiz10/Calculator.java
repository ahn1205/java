package quiz10;

public class Calculator {

	int result; 
	double pi = 3.14;
	
	int add(int n) {
		result += n;
		return result;
	}
	
	int sub(int n) {
		result -= n;
		return result;
	}
	
	int multi(int n) {
		result *= n;
		return result;
	}
	
	int div(int n) {
		result /= n;
		return result;
	}
	
	double circle(int n) {
		return n * n * pi;
	}
	
	
	
	
}
