package A_Ch3;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Map_Ch3 {
	public static void main(String[] args) {
		Map<Integer, String> map1 = new HashMap<Integer, String>();
		Map<String, String> map2 = new TreeMap<String, String>();
		
		map1.put(0, "ぶどう");
		map1.put(3, "もも");
		System.out.println(map1);
		
		map1.put(0, "マスカット");
		System.out.println(map1);
		
		System.out.println(map1.get(0));
		System.out.println(map1.get(1));
		
		System.out.println(map1.containsKey(0));
		System.out.println(map1.containsValue("ぶどう"));
		
		System.out.println(map1.size());
		
		map1.remove(0);
		System.out.println(map1);
		map1.remove(1);
		System.out.println(map1);
		
		map1.remove(3, "なし");
		System.out.println(map1);
		map1.remove(3, "もも");
		System.out.println(map1);
		
		
		
	}

}
