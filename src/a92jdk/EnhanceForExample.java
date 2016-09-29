package a92jdk;

import java.util.Iterator;

//�Զ�һ����ʹ����ǿforѭ��
class MyList implements Iterable<String>{
	
	Object[] arr = new Object[10];
	
	int index = 0 ;	//��ǰ��ָ��
	
	public void add(Object o){
		arr[index++] = o;  // 1
	}
	
	public int size(){
		return index;
	}

	@Override
	public Iterator<String> iterator() {
		
		
		return new Iterator<String>() {//���������ڲ������

			int cursor  = 0;

			@Override
			public boolean hasNext() {//���Բο�ArrayList ��Iterator�ķ�����д
				return cursor<index;
			}

			@Override
			public String next() {
				return (String) arr[cursor++];
			}

			@Override
			public void remove() {
				
			}
		};
	}
}

public class EnhanceForExample {
	
	public static void main(String[] args) {
		MyList list = new MyList();
		list.add("����");
		list.add("����");
		list.add("����");
		
		for(String item :list){
			System.out.println(item);
		}
		
		
		
	}
	
}
