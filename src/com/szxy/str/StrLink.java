package com.szxy.str;

/**
 *  
 * @author zwer
 *
 */
public class StrLink {
	public static void main(String[] args) {
		String s1 = "a";
		String s2 = s1+"b"; 
		String s3 = "a"+"b"; // javac �����ڱ����ڼ���ַ�����������Ż�
		System.out.println(s2 == "ab");
		System.out.println(s3 == "ab");
		/**
		 * ��һ������ӡ�Ľ��Ϊ false���ڶ�������ӡ�Ľ��Ϊ true����˵��
		 * javac ������Զ��ַ�������ֱ����ӵı��ʽ�����Ż�������Ҫ�ȵ�����
		 * ��ȥ���мӷ����㴦�������ڱ���ʱȥ�����еļӺţ�ֱ�ӽ�������һ
	     * ����Щ���������Ľ����
		 */
		String s4 = "a"+"b"+"c"+"d";//ֻ����һ������
		System.out.println(s4); 
	}
}
