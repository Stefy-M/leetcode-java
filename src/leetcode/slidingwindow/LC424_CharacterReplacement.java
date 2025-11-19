package leetcode.slidingwindow;

import java.util.HashMap;

public class LC424_CharacterReplacement {

	/** LeetCode Problem 424. Longest Repeating Character Replacement
	 * You are given a string s and an integer k. You can choose any character of the string and change it to any other uppercase English character. You can perform this operation at most k times.
	 * Return the length of the longest substring containing the same letter you can get after performing the above operations.
	 * 
	 * @param s The input uppercase string.
	 * @param k The max number of character replacements allowed.
	 * @return the length of the longest substring containing the same letter you can get after performing the above operations.
	 * 
	 * */

	public static int solve(String s, int k) { 
		int left =0;
		int ret =0;
		int maxCount =0;
		HashMap<Character, Integer> charMap = new HashMap<>();
		
		for(int right =0; right < s.length(); right++) {
			
			charMap.put(s.charAt(right), charMap.getOrDefault(s.charAt(right), 0) +1);
			
			maxCount = Math.max(maxCount, charMap.get(s.charAt(right)));
			
			int windowLength = right - left +1;
			
			while (windowLength - maxCount > k) {
				charMap.put(s.charAt(left), charMap.get(s.charAt(left))-1 );
				left++;
				windowLength = right -left+1;
			}
			
			
			
			ret = Math.max(ret, windowLength);
			
		}
		
		
		
		return ret;
	}
}
