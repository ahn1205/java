package day02;

public class OperatorEx01 {

	public static void main(String[] args) {
		
		//단항 연산자
		
		//부호연산자 +, -
		int i = -3;
		int j = -i;
		
		//증감연산자 ++, --
		int k = 1;
		int h = k++; //후위연산자- 먼저값을 대입하고, 그 다음에 증가
		System.out.println("k값:" + k);
		System.out.println("h값:" + h);
		
		int x = 1;
		int y = ++x; //전위연산자- 먼저값을 증가하고, 그 다음에 저장
		System.out.println("x값:" + x);
		System.out.println("y값:" + y);
		
		//일반적인 사용
		x = 1;
		x++;
		++x;
		
		System.out.println("x는?" + x);
		
		System.out.println("--------------------------------");
		x = 1;
		y = 1;
		
		System.out.println(x++); //1
		System.out.println(++x); //3
		
		x = 10;
		y = 10;
		
		int result = (x++) + (++y) + (10);
		System.out.println(result);
		//예외
		x = 10;
		y = 10;
		
		int result2 = x++ + x++ + x++; //주의할 점
		System.out.println(result2);
		
		System.out.println("--------------------------------");
		//비트 연산자 ~
		byte b = 10; //0000 1010
		System.out.println(~b); // 1111 0101
		System.out.println(~b+1); //-10
		
		System.out.println("--------------------------------");
		
		//논리 반전 연산자 ! - 반대의 의미
		System.out.println(!true); //f
		System.out.println(!false); //t
		
		boolean bool = !true;
		System.out.println(!bool);
		
	}
}
