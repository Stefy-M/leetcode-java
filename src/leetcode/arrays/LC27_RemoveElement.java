package leetcode.arrays;




public class LC27_RemoveElement {
	
	/**
	 * Leetcode Problem 27 Remove Element
	 * Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. 
	 * The order of the elements may be changed. 
	 * Then return the number of elements in nums which are not equal to val.
	 * 
	 * @param nums integer array.
	 * @param val value to remove from array.
	 * @return the number of elements in nums which are not equal to val.
	 */
	public static int solve(int [] nums, int val) {
		int k=0;
		
		for(int i =0; i < nums.length; i++) {
			if(nums[i] != val) {
				nums[k] = nums[i];
				k++;
			}
		}
		
		return k;
	}
	
}
