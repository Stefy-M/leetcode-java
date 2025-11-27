package leetcode.hashing;

import java.util.HashSet;

public class LC36_ValidSudoku {
	
	/**
	 * LeetCode 36 Valid Sudoku
	 * Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:
	 * Each row must contain the digits 1-9 without repetition.
	 * Each column must contain the digits 1-9 without repetition.
	 * Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.
	 * 
	 * @param board Character array
	 * @return if board is valid
	 */
	
	public static boolean solve (char [][] board) {
		
		HashSet<Character> [] rows = new HashSet[9];
		HashSet<Character> [] cols = new HashSet[9];
		HashSet<Character> [] boxes = new HashSet[9];
		
		for(int i =0; i < 9; i++) {
			rows[i] = new HashSet<>();
			cols[i] = new HashSet<>();
			boxes[i] = new HashSet<>();
		}
		
		for(int r = 0; r < 9; r++) {
			for(int c =0; c < 9; c++) {
				
				char value = board[r][c];
				
				if(value == '.') continue;
				
				int boxIndex = (r/3)*3 + (c/3);
				
				
				if(rows[r].contains(value)) return false;
				if(cols[c].contains(value)) return false;
				if(boxes[boxIndex].contains(value)) return false;
				
				rows[r].add(value);
				cols[c].add(value);
				boxes[boxIndex].add(value);
				
				
			}
		}
		
		
		
		return true;
	}

}
