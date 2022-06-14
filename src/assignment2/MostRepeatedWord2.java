package assignment2;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MostRepeatedWord2 {
	public static void main(String[] args) {
	//mostRepetedword("");
	mostRepetedword("mmm nn mmm nn nn mmm hhj");
	}
	public static void mostRepetedword(String input) {
		
		String [] input1 = input.split(" ");
		Map<String,Integer> map = new HashMap<String,Integer>();
		for(String word: input1){
			if(map.containsKey(word)) {
				map.put(word.toLowerCase(), map.get(word)+1);
			}
			else {
				map.put(word, 1);
			}	
		}
		Set<String> repetedWord = map.keySet();
		
		String key = Collections.max(map.entrySet(),Map.Entry.comparingByValue()).getKey();
		System.out.println(key+" "+map.get(key) );
		
		for(String rp:repetedWord) {
			if(map.get(rp)>1) {
				System.out.println(rp+ " : "+map.get(rp));
			}
		}
	}
	
}
