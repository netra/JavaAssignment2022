package assignment2;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MostRepeatedCharacter {

	public static void main(String[] args) {
		Map<Character, Integer> map = new HashMap<>();
		String input = "aa bb cc dd ee aa";
		
		for (Character c : input.toCharArray()) {
			if (map.get(c) == null) {
				map.put(c, 1);
			} 
			else {
				map.put(c, map.get(c) + 1);
			}

		}
		Character key = Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
		
		System.out.println("Most repeated word in the sentence is : " + key);
		System.out.println(key + " is repeated : " + map.get(key) + " times");
		
		
		Set<Character> repeatedWord = map.keySet();
		for(Character rp:repeatedWord) {
			if(map.get(rp)>1) {
				System.out.println(rp + " : "+map.get(rp));
			}
		}

	}

}
