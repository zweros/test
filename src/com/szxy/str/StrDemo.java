package com.szxy.str;

import com.szxy.annotation.Main;
	
	/**
	 * ����һ���ַ��� s ,�ٸ���һ���ַ��� t 
	 * �ж��ַ��� t �Ƿ����ַ��� s �������
	 * ע���ַ����ж�ΪӢ��Сд��ĸ
	 */
	public class StrDemo {
		
		public static boolean test(String s,String t){
			
			if(t.length() != s.length()){
				return false;
			}
			//���� int �������飬���ÿ��Сд��ĸ���ֵĴ���
			int[] bit = new int[26];
			
			//���� �ַ��� t��ͳ���ַ��� t ��Сд��ĸ���ֵĴ���
			//Ȼ������� int ��������
			for(int i=0;i < t.length();i++){
				bit[t.charAt(i)-'a']++;
			}
			
			//�����ַ��� s ��ÿȡ��һ���ַ������ڶ�Ӧ int ���������Ԫ�ص�ֵ��һ
			//�� ��Ӧint ���������Ԫ�ص�ֵС�� 0�����ʾ�ַ��� s �����ַ��� t �������
			for(int i=0;i < t.length();i++){
				if(--bit[s.charAt(i)-'a'] < 0){
					return false;
				}
			}
			
			// ��ʾ�ַ��� s ���ַ��� t �������
			return true;
			
		}
		public static void main(String[] args) {
			String t = "aabxbccba";
			String s = "ccbbaabxa";
			System.out.println(test(t,s));
		}
		
	}
