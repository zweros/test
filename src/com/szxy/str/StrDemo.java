package com.szxy.str;

import com.szxy.annotation.Main;
	
	/**
	 * 给定一个字符串 s ,再给定一个字符串 t 
	 * 判断字符串 t 是否是字符串 s 的重组词
	 * 注：字符串中都为英文小写字母
	 */
	public class StrDemo {
		
		public static boolean test(String s,String t){
			
			if(t.length() != s.length()){
				return false;
			}
			//创建 int 类型数组，存放每个小写字母出现的次数
			int[] bit = new int[26];
			
			//遍历 字符串 t，统计字符串 t 中小写字母出现的次数
			//然后将其放入 int 类型数组
			for(int i=0;i < t.length();i++){
				bit[t.charAt(i)-'a']++;
			}
			
			//遍历字符串 s ，每取出一个字符，则在对应 int 类型数组的元素的值减一
			//若 对应int 类型数组的元素的值小于 0，则表示字符串 s 不是字符串 t 的重组词
			for(int i=0;i < t.length();i++){
				if(--bit[s.charAt(i)-'a'] < 0){
					return false;
				}
			}
			
			// 表示字符串 s 是字符串 t 的重组词
			return true;
			
		}
		public static void main(String[] args) {
			String t = "aabxbccba";
			String s = "ccbbaabxa";
			System.out.println(test(t,s));
		}
		
	}
