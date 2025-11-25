package leetcode.arraysorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class LC49_GroupAnagrams {
	
	
	/**
	 * Leetcode 49. Group Anagrams
	 * Given an array of strings strs, group the anagrams together. You can return the answer in any order.
	 * 
	 * @param strs and array of strings
	 * @return nested list of anagrams found in strs
	 */
	public static List<List<String>> solve(String [] strs){
		HashMap <String, List<String>> map = new HashMap<>();
		
		for(String str : strs) {
			char [] chars = str.toCharArray();
			Arrays.sort(chars);
			String sorted = new String(chars);
			
			map.computeIfAbsent(sorted, k -> new ArrayList<>()).add(str);
			
		}
		
		
		List<List<String>> ret = new ArrayList<>();
		
		ret.addAll(map.values());
		return ret;
	}

}
