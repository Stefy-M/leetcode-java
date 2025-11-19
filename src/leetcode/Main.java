package leetcode;
import leetcode.arrays.LC27_RemoveElement;
import leetcode.slidingwindow.*;
import leetcode.arrays.LC1929_ConcatenationOfArray;
import leetcode.arrays.LC169_MajorityElement;

public class Main {

	public static void main(String[] args) {
		System.out.println( LC424_CharacterReplacement.solve("AABABBA",1));
		System.out.println(LC567_PermutationInString.solve("ab","eidbaooo"));
		System.out.println(LC27_RemoveElement.solve(new int [] {0,1,2,2,3,0,4,2}, 2));
		LC1929_ConcatenationOfArray.solve(new int [] {1,3,2,1});
		System.out.println(LC169_MajorityElement.solve(new int [] {2,2,1,1,1,2,2}));
	}

}
