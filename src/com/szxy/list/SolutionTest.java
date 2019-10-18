package com.szxy.list;

import java.util.List;

/**
 * ≤‚ ‘¿‡
 * 
 * 
 */
public class SolutionTest {
	public static void main(String[] args) {
		int nums[] = {1,2,3};
		List<List<Integer>> subsets = Solution.subsets(nums);
		for (List<Integer> list : subsets) {
			System.out.println(list);
		}
	}
}
