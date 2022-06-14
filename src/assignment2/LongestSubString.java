package assignment2;

import java.util.LinkedHashMap;
import java.util.Map;

public class LongestSubString {

	public static void main(String[] args) {
		 
		longestSubString("abbacsdacs");
	}
	public static void longestSubString(String s) {
		String longestSubString = null;
		int longestSubStringLength = 0;
		
		Map<Character, Integer> map = new LinkedHashMap<>();
		
		char[] arr =s.toCharArray();
		
		for(int i=0; i<arr.length; i++) {
			char ch = arr[i];
			
			if(!map.containsKey(ch)) {
				map.put(ch, i);
			}
			else {
				i = map.get(ch);
				map.clear();
			}
			if(map.size()>longestSubStringLength ) {
				longestSubStringLength = map.size();
				longestSubString = map.keySet().toString();
				
			}
		}
		
		System.out.println("The Longest sunstring : "+longestSubString);
		System.out.println("The Longest sunstring Length : "+ longestSubStringLength);
	}


}
