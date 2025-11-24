package leetcode.hashing;

public class LC705_HashSet {
	
	private boolean [][] bucket;
	private int BUCKET_SIZE = 1000;
	
	public LC705_HashSet(){
		bucket = new boolean [BUCKET_SIZE][];
	}
	
	private int hash1(int key) {
		return key % BUCKET_SIZE;
	}
	
	private int hash2(int key) {
		return key / BUCKET_SIZE;
	}
	
	public void add(int key) {
		int b1 = hash1(key);
		int b2 = hash2(key);
		
		if(bucket[b1] == null) {
			bucket[b1] = new boolean[BUCKET_SIZE+1];
		}
		bucket[b1][b2] = true;
		
		
	}
	
	public void remove(int key) {
		int b1 = hash1(key);
		int b2 = hash2(key);
		
		if(bucket[b1] != null) {
			bucket[b1][b2] = false;
		}
		
	}
	
	public boolean contains(int key) {
		int b1 = hash1(key);
		int b2 = hash2(key);
		
		if(bucket[b1] != null) {
			return bucket[b1][b2];
		}
		
		return false;
	}

}
