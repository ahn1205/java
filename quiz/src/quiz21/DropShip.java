package quiz21;

public class DropShip extends Unit {

	public Unit[] unit = new Unit[8];
	public int index = 0;
	
	public DropShip() {
		super(0, 0, 60);
	}
	
	/*
	 * location()의 기능은 동일합니다
	 */
	@Override
	public void location() {
		System.out.println("수송선현재위치:" + x + "," + y);
		
	}
	
	/*
	 * move()은 마린과 동일함
	 * 단, 수송선이 이동하면, 수송선 배열에 있는 모든 유닛의 위치를 수송선의 위치로 바꾼다.
	 * 
	 */
	@Override
	public void move(int x, int y) {
		
		int length = (x - this.x) * (x - this.x) + (y - this.y) * (y - this.y);
		int distance =  (int)Math.sqrt(length);
		System.out.println("수송선이동거리:" + distance);
		//위치변경
		this.x = x;
		this.y = y;
		
		//배열안에 유닛의 위치 변경
		for(int i = 0; i < index; i++) {
			
			if(unit[i] != null) {
				unit[i].x = this.x;
				unit[i].y = this.y;
			}
		}
		
		
		location();
	}
	
	
	
	
	/*
	 * void ride(모든 유닛을 받도록 선언)
	 * 
	 * 1. 배열의 크기는 8이고, 수송선 배열에는 탱크와, 마린이 탈 수 있다.
	 *    탱크는 배열을 4칸씩 사용한다. 마린은 배열을 1칸씩 사용
	 * 
	 * 2. 배열에 유닉이 탈수 있으면 유닛을 배열에 저장합니다.(탱크가 배열에 타면 인덱스를 4칸 처리)   
	 *    배열이 전부 차거나, 탈수 있는 공간이 없으면 "수송선에 공간이 부족합니다"를 출력
	 *    
	 * 3. 수송선에 탄 유닛을 가로로 출력한다.
	 * 
	 * main에서 Marine객체 4마리 생성, 탱크 2대, 수송선 1대 생성하고, 수송선에 넣어서 확인
	 */
	
	public void ride(Unit unit) {
		
		//마린이 들어갈 수 있는 조건
		if(unit instanceof Marine && index <= 7 ) {
			this.unit[index] = unit;
			index++;
		} else if(unit instanceof Tank && index <= 4) {
			this.unit[index] = unit;
			index+=4;
		} else {
			System.out.println("수송선에 공간이 부족합니다");
			return;
		}
		
		//수송선의 정보 출력
		System.out.print("수송선정보:");
		for(int i = 0; i < this.unit.length; i++) {
			
			if(this.unit[i] instanceof Marine) {
				System.out.print("마린 ");
			} else if(this.unit[i] instanceof Tank) {
				System.out.print("탱크 ");
			}
		}
		System.out.println();
		
		
		
	}
	
	
	
	
}
