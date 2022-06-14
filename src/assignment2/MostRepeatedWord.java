package assignment2;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MostRepeatedWord {

	public static void main(String[] args) {
		
		mostRepeatedWord("va java va va  va is ja ja va ja ma ka ja va");
		/*
		 * String input = "I love java because java is best java is awesome";
		 * Map<String, Integer> map = new HashMap<>(); for(String word:input.split(" "))
		 * { if(map.get(word)==null) { map.put(word, 1); } else { map.put(word,
		 * map.get(word)+1); }
		 * 
		 * } String key =Collections.max(map.entrySet(),
		 * Map.Entry.comparingByValue()).getKey();
		 * System.out.println("Most repeated word in the sentence is : "+key );
		 * System.out.println(key+ " is repeated : " + map.get(key)+" times");
		 */

	}
	
	public static void mostRepeatedWord(String input) {
		
		if(input == null || input.isEmpty()) {
			System.out.println("Given input is empty");
		}
		else {
			String [] words = input.split(" ");
			String repetedWord ="";
			int temp =0;
			for(int i=0; i<words.length; i++) {
				int counter =0;
				for(int j=1; j<words.length; j++) {
					if(words[i].equals(words[j])) {
						counter++;
					}
				}
				temp=Math.max(temp, counter);
				
				if(counter>=temp) {
					repetedWord=words[i];
				}
			}
			System.out.println("Most repeated word in the sentence is : "+repetedWord);
			System.out.println(repetedWord+	" is repeated : "+temp);
		}
	}

}
