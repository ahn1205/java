package modi.member.pac2;

import modi.member.pac1.A;

public class C {

	public C() {
		A a = new A();
		a.var1 = 1;
//		a.var2 = 1; //default (x)
//		a.var3 = 1; //private (x)
		
		a.method1();
//		a.method2(); //default (x)
//		a.method3(); //private (x)
	}
}
