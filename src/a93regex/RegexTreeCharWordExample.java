package a93regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * ���ң�
 * 
 * @author GeekQi
 *
 */

// * ���ң� ��Ҫʹ�õĶ��� 1.Pattern(������� 2.Matcher(ƥ��������)
// *
// * 1���Ƚ�������ʽ������������ʹ�õ���Pattern��һ����̬�ķ�����compile(regex);
// * 2������������Ҫ�������ַ����������ͨ��matcher������ɣ�������ƥ��������//���е�״̬��פ����ƥ������
// * 3��ͨ��ƥ��������ķ���������ģʽ���õ��ַ����϶��ַ�����������ԵĹ��ܲ���
// * ����Pattern p = Pattern.compile("a*b");
// * ����Matcher m = p.matcher("aaaaab");
// * ����boolean b = m.matches();
// *
// * ���󣺻�ȡ��3����ĸ��ɵĵ��ʡ�
// *
// ƥ����Ҫʹ�õķ�����
// 1.find() ֪ͨƥ����ȥƥ���ַ��������ҷ��Ϲ�����ַ���������ܲ��ҵ����Ϲ�����ַ���������true�����򷵻�false
// 2.group() ��ȡ���Ϲ�����ִ���
// ע�⣺ʹ��group������ʱ��һ��Ҫ�ȵ���find������ƥ����ȥ���ҷ��Ϲ�����ַ���������ᱨ��

public class RegexTreeCharWordExample {
	public static void main(String[] args) {
		String content = "da jiang de jia qi wan bi liao kai xin ma";
//		String reg = "[a-zA-Z]{3}b";
		String reg = "\\b[a-zA-Z]{3}\\b";
		// ��Ҫ���ַ�������������Pattern����
		Pattern p = Pattern.compile(reg);
		// ʹ���������ƥ���ַ������ڲ���һ��Matcher����
		Matcher m = p.matcher(content);
		// System.out.println("�з��Ϲ�����ַ�����" + m.find());
		// System.out.println("��ȡ����� " + m.group());
		while (m.find()) {
			System.out.println(m.group());
		}
		// ע���˷����������ǻ�����������з֡�
	}
}
