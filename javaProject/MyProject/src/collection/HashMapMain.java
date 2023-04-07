package collection;

import java.util.HashMap;

public class HashMapMain {

	public static void main(String[] args) {
		
		// 컨닝페이퍼
//		HashMap<String, SmartPhone> hashMap = new HashMap<>();
//
//		SmartPhone p = new SmartPhone("Spring", "010-1111-2222");
//		hashMap.put("ver", p);
//		
//		SmartPhone p2 = new SmartPhone("SON", "010-1111-2222");
//		hashMap.put("programName", p2);
//		
//		System.out.println(hashMap.get("ver"));
//		System.out.println(hashMap.get("programName"));
//		
//		System.out.println("---------------------------");
//		Set<String> keySet = hashMap.keySet();
//		for(String keyName : keySet) {
//			System.out.println(keyName + " : " + hashMap.get(keyName));
//		}
		
		// 4. 축구선수의 번호를 key로 하고 축구선수 인스턴스를 저장하는 Map<K,V> 
		// 인스턴스를 이용해서 프로그램을 만들어봅시다. 

		HashMap<Integer, FootballPlayer> fpMap = new HashMap<>();
		
//		FootballPlayer fp = new FootballPlayer("손흥민", 7, "토트넘", 30);
//		fpMap.put(7, fp);
		fpMap.put(7, new FootballPlayer("손흥민", 7, "토트넘", 30));
		FootballPlayer fp2 = new FootballPlayer("해리케인", 10, "토트넘", 30);
		fpMap.put(10, fp2);
		
		System.out.println(fpMap.get(7));
		System.out.println(fpMap.get(10));
		
		
		
	}
	
}
