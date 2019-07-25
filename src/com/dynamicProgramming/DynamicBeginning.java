package com.dynamicProgramming;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DynamicBeginning {

	public static void main(String[] args) {

//		String value = "always be coding";
//		String longestSubstringWithoutRepetiton = longestSubstringWithoutRepetiton(value);
//		System.out.println(longestSubstringWithoutRepetiton);
		
		String longestSubstringWithoutRepetiton1 = getUniqueCharacterSubstring("CODINGISAWESOME");
		System.out.println(longestSubstringWithoutRepetiton1);

	}

	private static String longestSubstringWithoutRepetiton(String value) {
		String output = "";

		for (int i = 0; i < value.length(); i++) {
			Set<Character> visited = new HashSet<>();
			int j = 0;
			for (; j < value.length(); j++) {
				char currChar = value.charAt(j);
				if (visited.contains(currChar)) {
					break;
				} else {
					visited.add(currChar);
				}
			}
			if (output.length() < (j - i + 1)) {
				output = value.substring(i, j);
			}

		}

		return output;
	}
	
	static String getUniqueCharacterSubstring(String input) {
	    Map<Character, Integer> visited = new HashMap<>();
	    String output = "";
	    int start = 0;
	    for (int end = 0; end < input.length(); end++) {
	        char currChar = input.charAt(end);
	        if (visited.containsKey(currChar)) {
	            start = Math.max(visited.get(currChar)+1, start);
	        }
	        if (output.length() < end - start + 1) {
	            output = input.substring(start, end + 1);
	        }
	        visited.put(currChar, end);
	    }
	    return output;
	}

}
