package leetcode.slidingwindow;

public class LC567_PermutationInString {
	/**
	 * LeetCode Problem 567 Permutation in String
	 * Given two strings s1 and s2, return true if s2 contains a permutation of s1, or false otherwise.
	 * In other words, return true if one of s1's permutations is the substring of s2.
	 * 
	 * @param s1 First string
	 * @param s2 Second String
	 * @return return true if one of s1's permutations is the substring of s2.
	 */
	public static boolean solve(String s1, String s2) {
		
		if(s1.length() > s2.length()) return false;
		
		int [] need = new int [26];
		int [] have = new int [26];
		int k = s1.length();
		
		for (int i =0; i < k; i++) {
			need[s1.charAt(i) - 'a']++;
		}
		
		int left =0;
		for (int right =0; right < s2.length(); right++) {
			char rChar = s2.charAt(right);
			have[rChar -'a']++;
			
			while(right -left +1 > k) {
				char lChar = s2.charAt(left);
				have[lChar - 'a']--;
				left++;
			}
			
			
			if((right -left +1) == k && matches(need,have)) return true;
			
		}
		
		
		return false;
	}



	private static boolean matches(int[] need, int[] have) {
		
		for (int i =0; i < 26; i++) {
			if(need[i] != have[i]) return false;
		}
		
		return true;
	}
}
