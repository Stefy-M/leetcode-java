package leetcode.arrays;

public class LC1929_ConcatenationOfArray {
	
	/**
	 * Leetcode 1929 Concatenation of Array
	 * Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
	 * Specifically, ans is the concatenation of two nums arrays.
	 * Return the array ans.
	 * 
	 * @param nums initial array
	 * @return concatenation of two num arrays
	 */
	public static int [] solve(int nums[]) {
		
		int [] ans = new int [nums.length *2];
		
		System.out.print("[");
		for(int i =0; i < ans.length; i++) {
			ans[i] = nums[i % nums.length];
			System.out.print(ans[i]+" ");
		}
		System.out.println("]");
		
		
		return ans;
	}
}
