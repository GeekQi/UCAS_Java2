package a7set;

import java.util.Comparator;
import java.util.TreeSet;

/*
 treeSet����Զ���Ԫ��:
 
 treeSetҪע������
 	1. ��TreeSet���Ԫ�ص�ʱ�����Ԫ�ر���߱�����Ȼ˳������ԣ���ô�Ͱ���Ԫ����Ȼ˳������Խ�������洢��
 	2. ��TreeSet���Ԫ�ص�ʱ�����Ԫ�ر����߱���Ȼ˳������ԣ���ô��Ԫ�������������Ҫʵ��Comparable�ӿڣ���Ԫ��
 	�ıȽϹ�������compareTo(T o)�����ϡ� 
 	
 	3. ����Ƚ�Ԫ�ص�ʱ��compareTo�������� ����0����ô��Ԫ�ؾͱ���Ϊ�ظ�Ԫ�أ����������.(ע�⣺TreeSet��HashCode��equals������û���κι�ϵ��)
 	
 	4. ��TreeSet���Ԫ�ص�ʱ��, ���Ԫ�ر���û�о߱���Ȼ˳�� �����ԣ���Ԫ����������Ҳû��ʵ��Comparable�ӿڣ���ô����Ҫ�ڴ���TreeSet��ʱ����һ��
 	�Ƚ�����
 	
 	5.  ��TreeSet���Ԫ�ص�ʱ�����Ԫ�ر����߱���Ȼ˳������ԣ���Ԫ�����������Ѿ�ʵ����Comparable�ӿڣ� �ڴ���TreeSet�����ʱ��Ҳ�����˱Ƚ���
 	��ô���ԱȽ����ıȽϹ�������ʹ�á�
 	
 	
 	
 	
 	����Զ��嶨��Ƚ����� �Զ���һ����ʵ��Comparator�ӿڼ��ɣ���Ԫ����Ԫ��֮��ıȽϹ�������compare�����ڼ��ɡ�
 		
 		�Զ���Ƚ����ĸ�ʽ ��
 			
 			class  ����  implements Comparator{
 			
 			}
 	
 	�Ƽ�ʹ�ã�ʹ�ñȽ���(Comparator)�� //��Ϊ��Comparable�Ļ���ֻ���ڸ�����ʹ�á���comparator������ߴ��븴����
 	
 
 */
class Emp implements Comparable<Emp> {

	int id;

	String name;// ע������˵Ļ���refactor��rename�����е�һ�������Ķ���仯

	int salary;

	public Emp(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "{ ��ţ�" + this.id + " ������" + this.name + " нˮ��" + this.salary + "}";
	}
//
	// @Override //Ԫ����Ԫ��֮��ıȽϹ���
	// ����������������������ݴ˶�����С�ڡ����ڻ��Ǵ���ָ������
	public int compareTo(Emp o) {
		Emp e = (Emp) o;
		System.out.println(this.name + "compare" + e.name);
		return this.salary - e.salary;
	}
}

 //�Զ���һ���Ƚ���
class MyComparator implements Comparator<Emp> {

	@Override
	public int compare(Emp o1, Emp o2) {
		// TODO Auto-generated method stub
		Emp e1 = (Emp)o1;
		Emp e2 = (Emp)o2;	
		return e1.id - e2.id;
	}   }

public class TreeSetUse {

	public static void main(String[] args) {
		// ����һ���Ƚ�������
		 MyComparator comparator = new MyComparator();
		// ����TreeSet��ʱ����Ƚ���
		 TreeSet tree = new TreeSet(comparator);
//		TreeSet tree = new TreeSet();// ����ǰ���salary����

		tree.add(new Emp(110, "��½", 100));
		tree.add(new Emp(113, "����", 200));
		tree.add(new Emp(220, "����", 300));
		tree.add(new Emp(120, "�ϲ�", 500));//ע���ϲ�û�к���½��
		//�ڶ��������ݽṹ�У����3���ڵ㶼û���γ����棬����Զ������ڵ㡣���������ã����ٱȽϴ�����
		System.out.println("���ϵ�Ԫ�أ�" + tree);

	}
}
