package a93regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * ��������
 */
//	��ȡ���������
public class RegexMailExample {
	public static void main(String[] args) {
		// .com .cn .com.cn .net
		String content = "������ϵ1122423@163.com448328@qq.comû����ϰ89238980@qq.com�������809843430@163.net";
		String reg = "[a-zA-Z1-9]\\w{5,17}@[a-zA-Z0-9]{2,}(\\.(com|cn|net)){1,2}";
		// ���ַ��������������������
		Pattern p = Pattern.compile(reg);
		// ʹ������������ƥ��������
		Matcher m = p.matcher(content);
//		System.out.println("�з��Ϲ�����ַ�����" + m.find());
		while (m.find()) {
			System.out.println(m.group());
		}
		System.out.println("hello");
	}
}
