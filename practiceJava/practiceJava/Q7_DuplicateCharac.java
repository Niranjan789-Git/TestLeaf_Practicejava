package practiceJava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.Map.Entry;

public class Q7_DuplicateCharac {

	public static void main(String[] args) {
		String str = "When life gives you lemons, make lemonade";
		// Method 1
		HashMap<Character, Integer> duphmap = new HashMap<Character, Integer>();
		char[] charArray = str.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if (duphmap.containsKey(charArray[i])) {
				duphmap.put(charArray[i], duphmap.get(charArray[i]) + 1);

			} else {
				duphmap.put(charArray[i], 1);
			}
		}
		for (Entry<Character, Integer> entry : duphmap.entrySet()) {
			if (entry.getValue() > 1)
				System.out.println("Duplicate Char is : " + entry.getKey());
		}

		// Method 2

		char[] charArray2 = str.toCharArray();
		Set<Character> charSet = new LinkedHashSet<>();
		Set<Character> dupCharSet = new LinkedHashSet<>();
		for (int i = 0; i < charArray2.length; i++) {

			if (!charSet.add(charArray2[i])) {
				dupCharSet.add(charArray2[i]);
			}

		}

		List<Character> dupCharList = new ArrayList<>(dupCharSet);
		System.out.println(dupCharList);

	}

}
