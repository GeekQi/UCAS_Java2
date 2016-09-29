package a90map;

import java.util.Comparator;
import java.util.TreeMap;

/*
˫�м��ϣ�
-------------| Map  �����ʵ����Map�ӿڵļ����࣬�߱����ص㣺 �洢�����ݶ����Լ�ֵ�Ե���ʽ���ڵģ��������ظ���ֵ�����ظ���
----------------| HashMap  �ײ�Ҳ�ǻ��ڹ�ϣ��ʵ�� �ġ�
HashMap�Ĵ洢ԭ����
	��HashMap����Ԫ�ص�ʱ�����Ȼ���ü���hashCode�����õ�Ԫ�� �Ĺ�ϣ��ֵ��Ȼ�󾭹�����Ϳ��������
	Ԫ���ڹ�ϣ���еĴ洢λ�á� 
	���1�� ��������λ��Ŀǰû���κ�Ԫ�ش洢����ô��Ԫ�ؿ���ֱ�����ӵ���ϣ���С�
	
	���2�������� ��λ��Ŀǰ�Ѿ�����������Ԫ�أ���ô������ø�Ԫ�ص�equals���������λ���ϵ�Ԫ�ؽ��бȽ�
	�����equals�������� ����false����ô��Ԫ���������洢�����equals�������ص���true����ô��Ԫ�ر���Ϊ
	�ظ�Ԫ�أ����ʴ洢��

----------------| TreeMap   TreeMapҲ�ǻ��ں�����������������ݽṹʵ�� �ģ� �ص㣺���Ԫ�صļ���������洢��

TreeMap Ҫע������
	1.  ��TreeMap����Ԫ�ص�ʱ�����Ԫ�صļ��߱���Ȼ˳����ô�ͻᰴ�ռ�����Ȼ˳�����Խ�������洢��
	2.  ��TreeMap����Ԫ�ص�ʱ�����Ԫ�صļ����߱���Ȼ˳�����ԣ� ��ô�������������Ҫʵ��Comparable�ӿڣ��Ѽ�
	�ıȽϹ�������CompareTo�����ϡ�
	
	3. ��TreeMap����Ԫ�ص�ʱ�����Ԫ�صļ����߱���Ȼ˳�����ԣ����Ҽ���������Ҳû��ʵ��Comparable�ӿڣ���ô�ͱ���
	�ڴ���TreeMap�����ʱ����Ƚ�����
	

----------------| Hashtable 
*/
class Emp {//implements Comparable<Emp>{
	
	String name;
	
	int salary;

	public Emp(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	
	
	@Override
	public String toString() {
		return "[������"+this.name+" нˮ��"+ this.salary+"]";
	}

/*
	@Override
	public int compareTo(Emp o) {
		return this.salary - o.salary;
	}*/
	
}


//�Զ���һ���Ƚ���
class MyComparator implements Comparator<Emp>{

	@Override
	public int compare(Emp o1, Emp o2) {
		return o1.salary - o2.salary;
	}
	
}




public class TreeMapSortKeyValue {
	
	public static void main(String[] args) {
	/*	TreeMap<Character, Integer> tree = new TreeMap<Character, Integer>();
		tree.put('c',10);
		tree.put('b',2);
		tree.put('a',5);
		tree.put('h',12);
		System.out.println(tree);*/
		
		//����һ���Զ���Ƚ���
		MyComparator comparator = new MyComparator();
		
		TreeMap<Emp, String> tree = new TreeMap<Emp, String>(comparator);
		tree.put(new Emp("����", 2000),"001");
		tree.put(new Emp("�ұ�", 1000),"002");
		tree.put(new Emp("ϰ��", 3000),"003");
		tree.put(new Emp("��ǿ", 5000),"005");
		
		tree.put(new Emp("�ƺ�", 5000),"008");
		System.out.println(tree);
		
		
		
		
	}

}