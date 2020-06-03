package inter.baisc3;

//클래스의 사용방법 정의해 놓는다
public interface Printed {

	public void turnOn();
	public void turnOff();
	public void print(String document);
	public void colorPrint(String document, String color);
	public int copy(int n);
}
