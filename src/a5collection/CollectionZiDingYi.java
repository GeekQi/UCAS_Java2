package a5collection;

import java.util.ArrayList;
import java.util.Collection;

/*
�ж�
	isEmpty() 
	contains(Object o) 
	containsAll(Collection<?> c)
*/

class Person {

	int id;

	String name;

	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "{��ţ�" + this.id + " ������" + this.name + "}";
	}

	@Override
	public boolean equals(Object obj) {//Ĭ�ϱȽ��ڴ��ַ
		Person p = (Person) obj;
		return this.id == p.id;
	}

	// java�淶�� һ����дequlas�������Ƕ�����дhashCode�����ġ�
	@Override
	public int hashCode() {
		return this.id;
	}

}

class Dog {
}

public class CollectionZiDingYi {

	public static void main(String[] args) {

		Collection c = new ArrayList();
		c.add("��ƻ�");
		c.add("��ź�");
		c.add("������");
		System.out.println("�жϼ����Ƿ�Ϊ��Ԫ�أ�" + c.isEmpty());
		System.out.println("�жϼ������Ƿ����ָ����Ԫ�أ�" + c.contains("������"));

		// ��������Զ����Ԫ��
		Collection c1 = new ArrayList();
		c1.add(new Person(110, "����"));
		c1.add(new Person(119, "��ʣ"));
		c1.add(new Person(120, "����"));

		Collection c2 = new ArrayList();
		c2.add(new Person(110, "����"));
		c2.add(new Person(119, "��ʣ"));
		c2.add(new Person(120, "�¹�ʣ"));

		c.contains(new Dog());//ע�������õ�����ʵ�ε�equals���������Կ�Դ�����ж�
		System.out.println("c1�����а���c2�����е�����Ԫ����" + c1.containsAll(c2));

		// �������ʵ�����У�ֻҪ���֤���һ�£���ô��Ϊͬһ���ˡ�
		System.out.println("���ڸ�Ԫ����" + c1.contains(new Person(120, "������"))); // ��ʵcontains�����ڲ���������equals�������бȽϵġ�
		System.out.println("���ϵ�Ԫ�أ�" + c1);

	}
}
