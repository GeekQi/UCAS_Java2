package a3string;

/*
 String �Ĺ��췽����
 	//1
 	String()  ����һ�������� ���ַ�������
 	//2
 	String(byte[] bytes)  ʹ��һ���ֽ����鹹��һ���ַ�������
 	String(byte[] bytes, int offset, int length) 
 		bytes :  Ҫ���������
 		offset�� ָ�����������Ǹ�����ֵ��ʼ���롣
 		length����Ҫ������Ԫ�ء�
 	//3
 	String(char[] value)  ʹ��һ���ַ����鹹��һ���ַ�����	
 	String(char[] value, int offset, int count)  ʹ��һ���ַ����鹹��һ���ַ����� ָ����ʼ������ֵ����ʹ���ַ�������
	String(int[] codePoints,int offset,int count)
	String(String original) 
	

��ס�� ʹ���ֽ���������ַ����鶼���Թ���һ���ַ�������


 */
public class StringConstructors {

	public static void main(String[] args) {
		// 1
		String str = new String();// �൱�ڣ� String str = "";
		// 2
		byte[] buf = { 97, 98, 99 };
		str = new String(buf); // ʹ��һ���ֽ����鹹��һ���ַ�������
		System.out.println(str);// ��Ϊ������������ִ洢�ַ�
		// 3
		str = new String(buf, 1, 2); // ʹ��һ���ֽ����鹹��һ���ַ�������,ָ����ʼ���������ֵ�ͽ���ĸ����������룺���ֱ���ַ�
		System.out.println(str);
		// 4
		char[] arr = { '��', '��', '��', 'ʥ', '��' };
		str = new String(arr); // ʹ���ַ����鹹��һ���ַ���
		System.out.println(str);
		str = new String(arr, 3, 2);
		System.out.println(str);
		//5
		int[] buf2 = { 65, 66, 67 };
		str = new String(buf2, 1, 2);
		System.out.println(str);

		str = new String("abc");

		System.out.println("�ַ��������ݣ�" + str);

	}

}
