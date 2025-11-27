package leetcode.arraysminheap;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.stream.Stream;

public class LC347_TopKFreqElement {
	
	/**
	 * LeetCode 347 Top K Frequent Elements
	 * Given an integer array nums and an integer k, return the k most frequent elements. 
	 * You may return the answer in any order.
	 * 
	 * @param nums integer array
	 * @param k top k elements
	 * @return array of k most frequent elements
	 */
	public static int [] solve (int nums [], int k) {
		HashMap <Integer, Integer> freqMap = new HashMap<>();
		
		for(int num : nums) {
			
			if(!freqMap.containsKey(num)) {
				freqMap.put(num, 1);
			}
			
			else {
				freqMap.put(num, freqMap.get(num) +1);
			}
		}
		
		PriorityQueue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<> (Comparator.comparingInt(entry ->entry.getValue()));
		
		for(Entry<Integer, Integer> entry : freqMap.entrySet()) {
			minHeap.offer(entry);
			
			if(minHeap.size() > k) {
				minHeap.poll();
			}
		}
		
		Stream <Entry <Integer, Integer>> temp = minHeap.stream();
		
		return minHeap.stream().mapToInt( e -> e.getKey()).toArray();
		
		
	}

}
