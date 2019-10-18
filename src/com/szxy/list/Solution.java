package com.szxy.list;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	
	/**
	 *	 给定一个不包含相同元素的整数集合，nums，返回所有可能
	 *	的子集集合。解答中集合不能包含重复的子集。
	 *  @param nums
	 */
	public static List<List<Integer>> subsets(int[] nums){
		// 存放最终结果
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		
		if(nums == null || nums.length == 0){
			return res;
		}
		
		// 存放计算得到的子集
		List<Integer> item = new ArrayList<Integer>();
		//  使用递归寻找 整型数组中元素集合(不重复)的子集
		dfs(nums, 0, item, res);
		
		res.add(new ArrayList<Integer>());  //添加空集
		
		return res;
	}
	
	/**
	 * 使用递归寻找 整型数组中元素集合(不重复)的子集
	 * @param nums
	 * @param start
	 * @param item
	 * @param res
	 */
	private static void dfs(int[] nums, int start, List<Integer> item, List<List<Integer>> res ){
		
		for(int i = start; i < nums.length; i++){
			
			item.add(nums[i]);
			
			dfs(nums, i+1, item, res);
			
			res.add(new ArrayList<Integer>(item));
			
			item.remove(item.size() - 1);
		}
	}
	
}
