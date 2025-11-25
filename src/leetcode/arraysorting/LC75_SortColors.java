package leetcode.arraysorting;

public class LC75_SortColors {
	
	/**
	 * Leetcode 75 Sort Colors.
	 * Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
	 * We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
	 * You must solve this problem without using the library's sort function.
	 * 
	 * @param nums an array with n objects colored red, white, blue. Will be sorted in-place
	 * @return sorted array
	 */
	public static int [] solve (int [] nums) {
		int left =0;
		int right = nums.length -1;
		int i =0;
		
		while (i <= right) {
			
			if(nums[i] == 0) {
				swap(nums, left,i);
				left++;
				i++;
			}
			else if(nums[i] == 1) {
				i++;
			}
			else {
				swap(nums,right,i);
				right--;
				i++;
			}
		}
		
		return nums;
		
	}
	
	private static void swap(int [] nums, int a, int b) {
		int temp = nums[a];
		nums[a] = nums[b];
		nums[b] = temp;
	}

}
