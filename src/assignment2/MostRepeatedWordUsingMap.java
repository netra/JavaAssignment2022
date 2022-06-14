package assignment2;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MostRepeatedWordUsingMap {

	public static void main(String[] args) {
		
		  String input = " va java va va  va is ja ja va ja ma ka ja va";
		 Map<String, Integer> map = new HashMap<>(); 
		 for(String word:input.split(" ")){ 
			 if(map.get(word)==null)
			 { 
				map.put(word, 1); 
			 } else 
			 { 
				 map.put(word, map.get(word)+1); 
			}
		  
		  } 
		 String key =Collections.max(map.entrySet(),Map.Entry.comparingByValue()).getKey();
		 
		 System.out.println("Most repeated word in the sentence is : "+key );
          System.out.println(key+ " is repeated : " + map.get(key)+" times");
          
          Set<String> repeatedWord = map.keySet();
  		for(String rp:repeatedWord) {
  			if(map.get(rp)>1) {
  				System.out.println(rp + "  : "+map.get(rp));
  			}
  		}

		  
		 
	}
}


