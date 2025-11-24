package leetcode.arraysorting;

import java.util.Arrays;

public class LC912_SortAnArray {

	public static int[] solve(int[] nums) {

		return mergeSort(0, nums.length, nums);
	}

	private static int[] mergeSort(int start, int end, int[] nums) {

		if ((end - start) <= 1)
			return Arrays.copyOfRange(nums, start, end);

		int mid = (start + end) / 2;
		int[] left = mergeSort(start, mid, nums);
		int[] right = mergeSort(mid, end, nums);

		return merge(left, right);

	}

	private static int[] merge(int[] left, int[] right) {
		// Merge
		int[] ret = new int[left.length + right.length];
		int index = 0;
		int l = 0;
		int r = 0;

		while (l < left.length || r < right.length) {
			if (l == left.length) {
				ret[index] = right[r];
				index++;
				r++;
			} else if (r == right.length) {
				ret[index] = left[l];
				index++;
				l++;
			} else if (left[l] < right[r]) {
				ret[index] = left[l];
				index++;
				l++;
			} else {
				ret[index] = right[r];
				index++;
				r++;
			}
		}

		return ret;
	}

}
