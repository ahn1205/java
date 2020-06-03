package poly.basic;

/*
 * 자바에서 하나의 클래스 파일에 여러 클래스 선언이 가능합니다.
 * 단, 파일명과 동일한 클래스가 존재해야 하고, 해당 클래스만 public이어야 합니다.
 */
class A {}
class B extends A {}
class C extends A {}
class D extends B {}
class E extends C {}


public class Basic {

	/*
	 * 다형성
	 * 자식 객체가 부모타입을 가질 수 있는 특성입니다.
	 */
	A a = new A();
	B b = new B();
	C c = new C();
	D d = new D();
	E e = new E();
	
	int x = 10;
	double y = x;  //int -> double 자동 형변환

	
	A a1 = b; //B -> A로 자동 형변환
	A a2 = new B(); 
	A a3 = new C();
	A a4 = new D();
	A a5 = new E();
	
	//상속관계가 없다면 다형성적용이 불가능.
	//B b1 = new E();
	
	
	//Object타입은 모든 클래스를 저장할 수 있습니다.
	Object o1 = a;
	Object o2 = new B();
	Object o3 = "문자열";
	
	
	
	
	
	
	
}
