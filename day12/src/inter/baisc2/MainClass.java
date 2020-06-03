package inter.baisc2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {
		
		Animal baduk = new Dog();
		Animal nabi = new Cat();
		Animal hodol = new Tiger();
		
		//1. Animal[] 생성후 baduk, nabi, hodol를 저장한 후에 향상된 포문으로 Animal의 공통 기능을 출력
		Animal[] arr = {baduk, nabi, hodol };
		
		for(Animal a : arr ) {
			a.eat();
		}

		//2. IPet[] 생성후 baduk, nabi, 금붕어 를 저장하고 향상된 포문으로 IPet의 공통 기능을 출력
		//baduk이는 Animal타입이지만, 하위클래스가 상호연관이 있다면, 형변환이 가능함
		IPet[] arr2 = new IPet[3];
		
		arr2[0] = (IPet)baduk; 
		arr2[1] = (IPet)nabi;
		arr2[2] = new GoldFish();
		
		
		for(IPet i :  arr2) {
			i.play();
		}
		
		System.out.println("-----------------------------");

		PetHouse house = new PetHouse();
		house.carePet( (IPet) baduk  );
		house.carePet( (IPet) nabi );
		house.carePet(  new GoldFish() );
		
		house.petInfo(arr2);
		
		
		
		
		
		
	}
}
