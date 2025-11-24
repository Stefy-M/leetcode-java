package leetcode;
import leetcode.arrays.LC27_RemoveElement;
import leetcode.arraysorting.LC912_SortAnArray;
import leetcode.hashing.LC705_HashSet;
import leetcode.hashing.LC706_HashMap;
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
		
		LC705_HashSet hashset = new LC705_HashSet();
		hashset.add(0);
		hashset.add(234);
		hashset.add(1234);
		hashset.add(1000021);
		hashset.remove(234);
		System.out.println(hashset.contains(234));
		
		LC706_HashMap hashmap = new LC706_HashMap();
		hashmap.put(1, 22);
		hashmap.put(1001, 23);
		System.out.println(hashmap.get(1001));
		hashmap.remove(1);
		
		LC912_SortAnArray.solve(new int [] {5,3,1,2});
		
		
		
	}

}
