package a6list;

import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;

/*
��ϰ�� ʹ�����ַ�ʽ�������ϵ�Ԫ��. 	
��һ�֣� ʹ��get����������
�ڶ��֣� ʹ�õ��������������
�����֣� ʹ�õ��������������

*/
public class ListThreeBianLi {
	
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("����");
		list.add("����");
		list.add("����");
		
		System.out.println("======get��������=======");
		for(int i = 0 ; i<list.size() ; i++){ 
			System.out.print(list.get(i)+",");
		}
		
		System.out.println("\n======ʹ�õ������������==========");
		ListIterator it = list.listIterator();	//��ȡ��������
		while(it.hasNext()){
			System.out.print(it.next()+",");
		}
		
		System.out.println("\r\n======ʹ�õ������������==========");
		//ע�������ϱߵĵ�����������Ҫ���»�ȡ������
		while(it.hasPrevious()){
			System.out.print(it.previous()+",");
		}
		
		
	}

}