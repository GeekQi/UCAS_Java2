package a5collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/*
����
	toArray() 
*/
public class CollectionToArray {

	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add("��ƻ�");
		c.add("��ź�");
		c.add("������");
		Object[] arr = c.toArray(); // �Ѽ����е�Ԫ��ȫ�� �洢��һ��Object�������з��ء�
		System.out.println("�����Ԫ�أ�" + Arrays.toString(arr));

		Collection c1 = new ArrayList();
		c1.add(new Person(110, "����"));
		c1.add(new Person(119, "��ʣ"));
		c1.add(new Person(120, "����"));
		Object[] arr1 = c1.toArray();
		// ���� �ѱ����110������Ϣ �����
		for (int i = 0; i < arr1.length; i++) {
			Person p = (Person) arr1[i]; // ��Object������ȡ����Ԫ��ֻ��ʹ��Object���������������գ������Ҫ����
											// ��������Ҫ����ǿ������ת����
			if (p.id == 110) {
				System.out.println(p);
			}
		}

	}

}
