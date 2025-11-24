package leetcode.hashing;

import java.util.LinkedList;

public class LC706_HashMap {
	
	class Pair {
		int key;
		int value;
		
		Pair(int key, int value){
			this.key = key;
			this.value = value;
		}
		
	}
	
	LinkedList<Pair> [] bucket;
	int BUCKET_SIZE = 1000;
	
	private int hash(int key) {
		return key % BUCKET_SIZE;
	}
	
	public LC706_HashMap() {
		bucket = new LinkedList[BUCKET_SIZE];
		
	}
	
	public void put (int key, int value) {
		int index = hash(key);
		
		if(bucket[index] == null) {
			bucket[index] = new LinkedList<>();
		}
		
		for (Pair p : bucket[index]) { //Changes value of key thats already in bucket
			if(p.key == key) {
				p.value = value;
				return;
			}
		}
		
		bucket[index].add(new Pair(key, value));
	}
	
	public int get (int key) {
		int index = -1;
		int hIdx = hash(key);
		
		if(bucket[hIdx] == null) return -1;
		
		for(Pair p : bucket[hIdx]) {
			if(p.key == key) {
				return p.value;
			}
		}
		
		
		return index;
	}
	
	public void remove (int key) {
		int index = hash(key);
		
		if(bucket[index] == null) return;
		
		bucket[index].removeIf(p -> p.key == key);
		
	}

}
