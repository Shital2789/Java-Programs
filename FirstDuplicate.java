package HashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstDuplicate {

	public static void main(String[] args){

		

		String str = "java programming".toLowerCase().replace(" ", "");

		Map<Character, Integer> map = new LinkedHashMap<>();

		// Step 1: Count frequency
		for (char c : str.toCharArray()) {
		    map.put(c, map.getOrDefault(c, 0) + 1);
		}

		// Step 2: Find first duplicate
		for (char c : str.toCharArray()) {
		    if (map.get(c) > 1) {
		        System.out.println("First duplicate character: " + c);
		        break;
		    }
		}}}