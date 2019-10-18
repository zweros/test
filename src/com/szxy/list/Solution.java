package com.szxy.list;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	
	/**
	 *	 ����һ����������ͬԪ�ص��������ϣ�nums���������п���
	 *	���Ӽ����ϡ�����м��ϲ��ܰ����ظ����Ӽ���
	 *  @param nums
	 */
	public static List<List<Integer>> subsets(int[] nums){
		// ������ս��
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		
		if(nums == null || nums.length == 0){
			return res;
		}
		
		// ��ż���õ����Ӽ�
		List<Integer> item = new ArrayList<Integer>();
		//  ʹ�õݹ�Ѱ�� ����������Ԫ�ؼ���(���ظ�)���Ӽ�
		dfs(nums, 0, item, res);
		
		res.add(new ArrayList<Integer>());  //��ӿռ�
		
		return res;
	}
	
	/**
	 * ʹ�õݹ�Ѱ�� ����������Ԫ�ؼ���(���ظ�)���Ӽ�
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
