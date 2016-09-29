package a93regex;

import java.util.Arrays;

/**
 * ������ʽ����Ҫ���ڲ����ַ����Ĺ���������ʽ���ַ����Ĳ�����Ҫ��һ�¼���Ӧ�ã�
 * 
 * @author GeekQi
 *
 */
/*
 * ƥ��:matches():
 * 
 * �иsplit():
 * 
 * �滻��replaceAll(String regex, String replacement):
 * 
 */
public class RegexMethodExample {
	public static void main(String[] args) {
		mathesPhone("13827485748");
		mathesTel("020-7837478");
		testPlit();
		testPlit2();
		replaceTest();
		replaceTest2();
	}

	// ���󣺱�дһ��������ʽƥ���ֻ�����:
	// ��һλ��1. �ڶ�λ��3.4.5.7.8�� ���ȣ�11.
	public static void mathesPhone(String phone) {
		String reg = "1[34578]\\d{9}";
		System.out.println(phone.matches(reg) ? "�Ϸ��ֻ���" : "�Ƿ��ֻ���");
	}

	// ����ƥ��̶��绰 ���ţ������� ���ţ���λ��0 ���� 3��4λ �����ţ� ��λ������0������7��8
	public static void mathesTel(String tel) {
		System.out.println(tel.matches("0\\d{2,3}-[1-9]\\d{6,7}") ? "�Ϸ��̻�" : "�Ƿ��̻�");
	}

	// ���տո��и�
	public static void testPlit() {
		String str = "��    ��     ��    �� ��";
		String[] datas = str.split(" +");
		System.out.println("�����Ԫ�أ� " + Arrays.toString(datas));
	}

	// �����ص��ʽ����и�
	public static void testPlit2() {
		String str = "��ҼҼҼ���������õõõõÿ���"; // �� �� �� ����
		String[] datas = str.split("(.)\\1+");
		// ��������������Ҫ�����ã���ô��Ҫ����������ݽ��з���()�������Ŀ�ľ����������ĸ����ԡ���Ų���ָ��������Ǵ�1��ʼ��
		// ע��\\1�����һ�������
		System.out.println("�����Ԫ�أ� " + Arrays.toString(datas));

	}
	
	//��ҵ����дһ������ƥ�����䣺12434@qq.com/.cn     @163.net   @qq.com.cn
	
	//�滻
	public static void replaceTest(){
		String str = "������������ϵ�ң�13453445738������������ϵ�ң�13453445738������������ϵ�ң�13453445738������������ϵ�ң�13453445738";
		String reg = "1[34578]\\d{9}";
		str = str.replaceAll(reg, "****");
		System.out.println("���滻������" + str);
	}
	//��ԭ��͵Ļ���������Ҫ����Ŀ
	public static void replaceTest2(){
		String str = "��������ҪҪҪ������������ĿĿĿĿ"; //���ص����滻�ɵ�����
		str = str.replaceAll("(.)\\1+", "$1");//�����Ҫ��replaceAll����������ⲿ����������ݣ���ô��ʹ��"$���"������
		System.out.println("���滻������: " + str);
		
	}
}
