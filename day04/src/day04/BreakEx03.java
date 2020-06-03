package day04;

public class BreakEx03 {

	public static void main(String[] args) {
		
		
		/*
		boolean bool = false;
		for(char u = 'A'; u <= 'Z'; u++) {
			
			for(char l = 'a'; l <= 'z'; l++) {
				
				System.out.println(u + "-" + l);
				
				if(l == 'c') {
					bool = true;
					break;
				}
			} //내부 for
			
			if(bool) break;
			
		} //바깥  for
		*/
		
		start:for(char u = 'A'; u <= 'Z'; u++) {
			
			for(char l = 'a'; l <= 'z'; l++) {
				
				System.out.println(u + "-" + l);
				
				if(l == 'c') {
					break start;
				}
			} //내부 for
		
		} //바깥  for
		
		
		
		
		
		
		
		
		
		
	}
}
