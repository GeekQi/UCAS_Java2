package a7set;

import java.util.TreeSet;
/*
TreeSet�ǿ��Զ��ַ����������� �ģ� ��Ϊ�ַ����Ѿ�ʵ����Comparable�ӿڡ�

�ַ����ıȽϹ���
	
	���һ�� ��Ӧλ���в�ͬ���ַ����֣� �ͱȽϵľ��Ƕ�Ӧλ�ò�ͬ���ַ���

	��� ������Ӧλ���� ���ַ���һ�����Ƚϵľ����ַ����ĳ��ȡ�
	
//�Ǹ����ĸ��ź���

 */


public class TreeSetCompareString {
	
	public static void main(String[] args) {
		TreeSet tree = new TreeSet();
		tree.add("abcccccccccccccccccc");
		tree.add("abc");
		System.out.println(tree);
		
		System.out.println("abw".compareTo("abcccccccccccc"));
		
	}

}
