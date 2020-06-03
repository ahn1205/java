package quiz24;

public class Bag implements IBag{
	
	private String[] arr = new String[100];
	private int count;
	
	@Override
	public void insert(String item) {
		arr[count] = item;
		count++;
	}

	@Override
	public void print() {
		for(int i = 0; i < count; i++) {
			System.out.print( arr[i] + " ");
		}
		System.out.println();
	}

	@Override
	public int search(String item) {
		
		for(int i = 0; i < count; i++) {
			if(arr[i].equals(item)) {
				return i;
			}
		}
		return -1;
	}

	@Override
	public boolean delete(String item) {
		
		for(int i = 0; i < count; i++) {
			if(arr[i].equals(item)) {
				//뒤에 있는 요소를 당겨오는 과정
				for(int j = i; j <count-1; j++) {
					arr[j] = arr[j+1];
				}
				//카운트 감소
				count--;
				return true;
			}
		}

		return false;
	}

}
