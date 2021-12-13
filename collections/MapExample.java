package kg.learning.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample {

	public static void main(String... args) {
		// TODO Auto-generated method stub
		Map hMap = new HashMap();
		hMap.put("B", new Double(234.90));

		hMap.put("A", new Double(123.90));
		hMap.put("C", new Double(156.99));
		hMap.put("A", new Double(1003.90));
		System.out.println(hMap);

		Set set = hMap.entrySet();
		for(Object obj : set){
			Map.Entry entry = (Entry) obj;
			System.out.println(entry.getKey() + " : " +  entry.getValue());
		}
		System.out.println(set);
	}

}
