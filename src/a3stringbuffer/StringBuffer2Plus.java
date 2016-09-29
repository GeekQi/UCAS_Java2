package a3stringbuffer;
/*
�����ҪƵ���޸��ַ��� �����ݣ�����ʹ���ַ������� �ࣨStringBuffer����


StringBuffer ��ʵ����һ���洢�ַ� ��������

������Ŀ��ʹ��Stringbuffer�� �εĹ��캯������ һ������ʱ��Ĭ�ϵĳ�ʼ�����Ƕ��٣� ������Ȳ���ʹ���ˣ��Զ��������ٱ���
	StringBuffer �ײ���������һ���ַ�������ܴ洢�ַ����� �ģ����ַ�������Ĭ�� �ĳ�ʼ������16�� ����ַ�����ĳ��Ȳ���ʹ�� �����Զ�����1����


StringBuffer ��һ���洢�ַ������� 

�����ľ߱� ����Ϊ
	
	String 
	
	����
		append(boolean b)    ��������������� �����ݵ�������
		insert(int offset, boolean b)  ָ�����������ֵ�������Ӧ �����ݡ� 

	ɾ��
		delete(int start, int end)  ����ָ���Ŀ�ʼ�����������ֵɾ����Ӧ�����ݡ�
		deleteCharAt(int index)   ����ָ�� ������ֵɾ��һ���ַ���
	
	
	�޸�
	
		replace(int start, int end, String str) ����ָ�� �Ŀ�ʼ���������ֵ�����ָ�������ݡ�
		reverse()   ��ת�ַ�������������ݡ�  abc--->cba
		
        setCharAt(int index, char ch)  ��ָ������ֵ���ַ��滻ָ�����ַ��� 
        substring(int start, int end)  ����ָ��������ֵ��ȡ�Ӵ���
		ensureCapacity(int minimumCapacity)  ָ��StringBuffer�ڲ����ַ����鳤�ȵġ�//һ�㲻�á�һ���ô�������StringBuffer��int capacity��
		
	�鿴
		indexOf(String str, int fromIndex) ����ָ�����ַ�����һ�γ��ֵ�����ֵ,����ָ����ʼ���ҵ�λ�á�
		lastIndexOf(String str) 
		
		capacity() �鿴��ǰ�ַ�����ĳ��ȡ� 
		length() �洢���ַ�����
		
		charAt(int index) ����ָ��������ֵ�����ַ�
		
		
		toString()   ���ַ��������������ת���ַ������ء�
		

StringBuffer �� StringBuilder����ͬ���벻ͬ����
	
	��ͬ�㣺
		1. �����඼���ַ��������ࡣ
		2. ������ķ�������һ�µġ�
	��ͬ�㣺
		1. StringBuffer���̰߳�ȫ�ģ�һ��ʱ�����һ�����������һ���߳���ִ�У�,����Ч�ʵ� ��StringBuilder���̷߳ǰ�ȫ�ģ�һ��ʱ�����һ����������ɶ���߳���ִ�У�,����Ч�ʸߡ�
		2. StringBuffer��jdk1.0���� �ģ�StringBuilder ��jdk1.5��ʱ����ֵġ�
		
�Ƽ�ʹ�ã� StringBuilder����Ϊ����Ч�ʸߡ�
		
*/

public class StringBuffer2Plus {

	public static void main(String[] args) {
		// ��ʹ��StringBuffer�޲εĹ��캯������һ���ַ��������ࡣ
		StringBuffer sb = new StringBuffer();
		sb.append("abcjavaabc");
		sb.append(true);
		sb.append(3.14f);
		System.out.println(sb);
		// 2���
		sb.insert(2, "С��");
		System.out.println(sb);
		// 3ɾ�� : ɾ����ʱ��Ҳ�ǰ�ͷ����β
		sb.delete(2, 3);
		System.out.println(sb);
		// 3ɾ�� ������ָ������ֵɾ��һ���ַ�
		sb.deleteCharAt(3);
		System.out.println(sb);
		// 4�޸� ���滻
		sb.replace(2, 4, "��С��");
		System.out.println(sb);
		// 4�޸� �� ��ת�ַ���������
		sb.reverse();
		System.out.println(sb);
		// 4�޸� �� ��ָ������ֵ���ַ��滻ָ�����ַ���
		sb.setCharAt(3, '��');
		System.out.println(sb);

		// 4�޸� �� ����ָ��������ֵ��ȡ�Ӵ���
		String subString = sb.substring(3, 6);
		System.out.println("�Ӵ������ݣ�" + subString);
		System.out.println(sb);

		/*
		 * 5�鿴
		 */
		int index = sb.indexOf("ba", 3);
		System.out.println("����ֵΪ��" + index);
		//5�鿴�ַ�����ĳ��ȡ�ע������������ĳ��ȡ�Ӧ����16�� 2 �� 2 �� 34������ע��
		sb.append("javajava");
		System.out.println("�鿴�ַ�����ĳ��ȣ�"+sb.capacity());

		System.out.println("�洢���ַ�������" + sb.length());
		System.out.println("����ָ��������ֵ�����ַ���" + sb.charAt(2));
		System.out.println("�ַ�������������ݣ�" + sb);

		String content = sb.toString();
		test(content);
	}

	public static void test(String str) {

	}

}
