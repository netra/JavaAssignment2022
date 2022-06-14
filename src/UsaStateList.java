import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class UsaStateList {

	public static void main(String[] args) {
		ArrayList<String> states = new ArrayList<>();
		states.add("California");
		states.add("Arizona");
		states.add("Nevada");
		states.add("Wshington");
		states.add("New Mexico");
		states.add("Texas");
		states.add("Colorado");
		states.add("Oregon");
		states.add("Utah");
		System.out.println("\n" + "----Array list----" + "\n");
		System.out.println(states + "\n");
		for (String x : states) {
			System.out.println(x);
		}

		Set<String> states1 = new HashSet<>();
		states1.add("Ohio");
		states1.add("New york");
		states1.add("Florida");
		states1.add("Ohio");
		states1.add("Albama");
		states1.add("Georgia");
		states1.add("Ohio");
		System.out.println("\n" + "---- Hash set ----" + "\n");
		System.out.println(states1 + "\n");

		// Adding duplicate value does nothing, Sets only contain unique items
		// states1.add("Ohio");
		// System.out.println("\n" + "---Again HashSet list, No duplicate--- " + "\n"
		// +states1+"\n");

		for (String i : states1) {
			System.out.println(i);
		}

		// Tree set sorts in natural order
		Set<String> states2 = new TreeSet<>();
		states2.add("New yorkT");
		states2.add("FloridaT");
		states2.add("OhioT");
		states2.add("AlbamaT");
		states2.add("GeorgiaT");
		System.out.println("\n" + "---- Tree set ----" + "\n");
		System.out.println(states2 + "\n");
		for (String j : states2) {

			System.out.println(j + "\n");
		}

		Set<Integer> numbers = new HashSet<>();
		numbers.add(2);
		numbers.add(5);
		numbers.add(12);
		numbers.add(4);
		System.out.println(numbers + "\n");
		for (int num = 1; num <= 5; num++) {
			if (numbers.contains(num)) {
				System.out.println(num + " Found in set");
			} else {
				System.out.println(num + " Not found in set");
			}
		}

		// Linked Hash set display item the order we added
		Set<Integer> numbers1 = new LinkedHashSet<Integer>();
		numbers1.add(28);
		numbers1.add(32);
		numbers1.add(49);
		numbers1.add(50);
		System.out.println("\n" + " --- Linked Hash Set --- " + "\n" + numbers1 + "\n");

	}

}
