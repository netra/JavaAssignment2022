package assignment1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapListPrint {

	public static void main(String[] args) {
		Map<Integer, String> stateList = new HashMap<>();
		stateList.put(10, "california");
		stateList.put(5, "Nevada");
		stateList.put(8, "Arizona");
		stateList.put(2, "Newyork");
		stateList.put(9, "Texas");
		System.out.println("HashMap State Code and State Name \n"+stateList);
		
        // 1. Iterating HashMap using For Loop
		System.out.println("\nIterating HashMap using For Loop :");
		for (Integer i : stateList.keySet()) {
			System.out.println("key : " + i + " Value : " + stateList.get(i));
		}

		// 2. Iterating HashMap using For-each Loop
		System.out.println("\nHashMap using For-each Loop :");
		for (Map.Entry sl : stateList.entrySet()) {
			System.out.println("Key : " + sl.getKey() + " Value : " + sl.getValue());
		}

		// 3. Iterate through a HashMap EntrySet using Iterator
		System.out.println("\nHashMap EntrySet using Iterator :");
		Iterator<Entry<Integer, String>> itr = stateList.entrySet().iterator();
		while (itr.hasNext()) {
			Entry<Integer, String> entry = itr.next();
			System.out.println(entry.getKey() + " " + entry.getValue());

		}
		// 4. Iterate through a HashMap KeySet using Iterator
		System.out.println("\nHashMap KeySet using Iterator :");
		Iterator<Integer> itr1 = stateList.keySet().iterator();
		while (itr1.hasNext()) {
			Integer key = itr1.next();
			System.out.println(key + " " + stateList.get(key));

		}

	}

}
