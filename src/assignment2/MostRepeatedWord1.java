package assignment2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MostRepeatedWord1 {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 System.out.println("Enter the sentence with multiple same word");
		 String input1= input.nextLine();
		 Map<String, Integer> map = new HashMap<>();
		 
		 for(String word:input1.split(" ") ) {
			 
			 if(map.containsKey(word)) {
				 map.put(word, map.get(word)+1);
			 }
			 else
			 {
				 map.put(word, 1);
				 
			 }
			 
		 }
		 Set<String> repetedWord = map.keySet();
		 for(String rp:repetedWord) {
			 if(map.get(rp)>1) {
				 System.out.println(rp +" "+map.get(rp));
			 }
		 }
	}

}
