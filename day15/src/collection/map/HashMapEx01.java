package collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEx01 {

	public static void main(String[] args) {
		
		//HashMap객체 생성
		//HashMap<K, V> map = new HashMap<>();
		Map<Integer, String> map = new HashMap<>();
		
		//map에 저장 put(key, value)
		map.put(1, "홍길동");
		map.put(2, "이순신");
		map.put(3, "홍길자");
		map.put(4, "신사임당");
		
		System.out.println("맵의 크기:" + map.size());
		System.out.println(map.toString());
		
		
		//맵에 같은 key를 저장했을 경우, 추가하지 않고, key에 value를 수정합니다.
		map.put(4, "김유신");
		System.out.println(map.toString());
		
		//map의 저장된 value값 얻기 get(key)
		String value = map.get(3);
		System.out.println("3번 키에 저장된 값:" + value);
		
		//map에 저장된 값을 순서대로 출력하려면 keySet, entrySet
		
		Set<Integer> keySet = map.keySet(); //key만 뽑아서 set으로 변경해주는 기능
		for(Integer i : keySet ) {
			System.out.println(map.get(i));
		}
		/////////////////////반복자/////////////////////
		Iterator<Integer> iter = keySet.iterator();
		while(iter.hasNext()) {
			
			int i = iter.next();
			System.out.println(map.get(i));
		}
		//////////////////////////////////////////////
		
		Set<Entry<Integer, String> > entry = map.entrySet(); //Entry타입으로 반환
		
		for(Entry<Integer, String> me :entry ) {
			System.out.println(me.getKey() + ":" + me.getValue());
			
		}
		
		//map에 있는 key유무 확인
		if(map.containsKey(1)) { //key가 있다면 true, false
			System.out.println("1번키는 포함되어 있습니다");
		}
		
		//map의 데이터 삭제 remove(key)
		map.remove(2);
		System.out.println(map.toString());
		
		
		
		
		
	}
}
