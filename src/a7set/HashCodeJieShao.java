package a7set;

public class HashCodeJieShao {

	public static void main(String[] args) {
		String str1 = "hello";//�ַ���������
		String str2 = new String("hello");//���ڴ�
		System.out.println("������ͬһ��������" + (str1 == str2));
		System.out.println("str1��hashCode��" + str1.hashCode());
		System.out.println("str2��hashCode:" + str2.hashCode());
		/*
		 * HashCodeĬ������±�ʾ�����ڴ��ַ��String ���Ѿ���д��Object��hashCode�����ˡ�
		 * 
		 * ע�⣺ ��������ַ���������һ�£���ô���ص�hash Code ��϶�Ҳ��һ�µġ�
		 *
		 * 
		 */
	}

}
