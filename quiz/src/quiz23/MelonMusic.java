package quiz23;

public class MelonMusic implements SongList {

	private String[] list = new String[100];
	private int count = 0;
	
	/*
	 * SongList인터페이스를 상속받아서 기능을 구현합니다.
	 * insertList() 는 list배열에 순서대로 저장
	 * playList() list의 음악을 랜덤하게 출력
	 * playLength() 는 저장된 음악의 개수를 반환
	 */
	
	@Override
	public void insertList(String song) {
		list[count] = song;
		count++;
		
	}
	@Override
	public void playList() {
		
		for(int i = 0; i < count; i++) {
			
			int ran = (int)(Math.random() * count);
			System.out.println(list[ran]);
		}
		
		
	}
	@Override
	public int playLength() {
		
		return count;
	}

	
}
