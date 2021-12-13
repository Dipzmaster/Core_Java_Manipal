package kg.learning.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Sai");
		hm.put(2, "Ram");
		hm.put(3, "Shyam");
		hm.put(4, "Sai");
		hm.put(5, "Kumar");
		hm.put(6, "Prasad");
		hm.put(7, "Raman");
		
		
		System.out.println(hm);
		
		
		
		TreeMap tm = new TreeMap();
		tm.put("a", "Sai");
		tm.put("b", "Ram");
		tm.put("d", "Shyam");
		tm.put("e", "Sai");
		tm.put("g", "Kumar");
		tm.put("f", "Prasad");

		tm.putAll(hm);
		System.out.println(tm);

		
		
		
	}

}
