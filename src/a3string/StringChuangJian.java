package a3string;
/*
 String �ַ�����:
  
 ������Ŀ��new String("abc")�����˼�������
 
  �������� һ�������� λ���ַ����������У�һ��������λ�ڶ��ڴ��С�
  
  
  
  
 */

public class StringChuangJian {

	public static void main(String[] args) {

		String str1 = "hello";
		String str2 = "hello";
		String str3 = new String("hello");
		String str4 = new String("hello");
		System.out.println("str1==str2?" + (str1 == str2)); // true
		System.out.println("str2==str3?" + (str2 == str3)); // false
		System.out.println("str3==str4?" + (str3 == str4)); // false
		System.out.println("str3.equals(str2)?" + (str3.equals(str4))); // true

		// ��String����д��Object��equals�������Ƚϵ��������ַ������� ������ �Ƿ�һ�¡�
		// ע����Դ���룬���ǲ�����д��
		// "=="���ڱȽ� ���������������ݵ�ʱ��Ƚϵ����������� ���ڴ��ַ��equals����Ĭ������±Ƚ�Ҳ���������� ���ڴ��ַ��

		test("�й�");
//		test(null);
	}

	public static void test(String str) {
		if ("�й�".equals(str)) {//д�����������ַ��������ٵ���equals ������������Ϊ����������Զ���ᷢ���쳣��
//			if (str.equals("�й�")) {//�����test(null)����ָ���쳣����Ϊ����������Ϊstr���Ǹ�����������Ϊnull��
			//ϰ�ߣ�������Ϊeauqls�����ĵ�����
			System.out.println("�ش���ȷ");
		} else {
			System.out.println("�ش����");
		}
	}

}
