package com.szxy.integer;

public class IntegerTest {
	public static void main(String[] args) {
		Integer a1=100,a2=100,a3=150,a4=150,a6=128;
		/**
		 *  Integer �Զ�װ��ײ��ǵ��� valueOf ����
		 *  ������ valueOf ����ʱ����Դ���� int ���͵ı������ж�
		 *  ���� int �������� -128 ��С�� 127
		 *  ��ֱ�Ӵ� Integer ������ȡ���� int ������Ӧ�� Integer ����ʵ��
		 *  ��֮���´���һ�� Integer ����
		 */
		Integer a5 = Integer.valueOf(128);
		System.out.println((a1 == a2) +" "+ (a6 == a5));
		System.out.println(a3 == a4);
	}
}
