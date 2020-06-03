package encap.obj;

public class MainClass {

	public static void main(String[] args) {
		
		Hotel h = new Hotel();
		
		h.setEmp(new Employee());
		h.getEmp().work();
		
//		Employee e = h.getEmp();
//		e.work();
		
		Chef c = new Chef();
		h.setChef(c);
		h.getChef().cook();
		
		
		
		
		
	}
}
