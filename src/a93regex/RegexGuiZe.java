package a93regex;

public class RegexGuiZe {
	public static void main(String[] args) {

		// Regex -���� Ԥ�����ַ���
		//
		// . �κ��ַ� �������н�����֮�⣩
		// \d ���֣�[0-9]
		// \D �����֣�[^0-9]
		// \s �հ��ַ���[\t\n\x0B\f\r]
		// \S �ǿհ��ַ���[^\s]
		// \w �����ַ���[a-zA-Z_0-9]
		// \W �ǵ����ַ���[^\w]
		// ע�⣺�κ�Ԥ�����ַ�û�м���������֮ǰ��ֻ��ƥ��һ���ַ�����
		// System.out.println("�����ַ�: " + ("%".matches(".")));
		// System.out.println("�����ַ�: " + ("123".matches("\\d\\d")));
		// System.out.println("�������ַ�: " + ("@".matches("\\D")));
		// System.out.println("�հ��ַ�: " + ("\r".matches("\\s")));// \r�ǻس� \n�ǻ��� "
		// "
		// // Ҳ�ǿհ��ַ�
		// System.out.println("�ǿհ��ַ�: " + ("\n".matches("\\S")));
		// System.out.println("�����ַ�: " + ("_".matches("\\w")));
		// System.out.println("�ǵ����ַ�: " + ("_".matches("\\W")));

		// ������
		// Greedy ��������������
		// X? X��һ�λ�һ��Ҳû��
		// X* X����λ���
		// X+ X��һ�λ���
		// X{n} X��ǡ��n��
		// X{n,} X������n��
		// X{n,m} X������n�Σ����ǲ�����m��[ָ���������ֵķ�Χ]
		// System.out.println("��һ�λ�һ�ζ�û�У� "+("1").matches("\\d?") );
		// System.out.println("* ��λ��Σ� "+("4324523").matches("\\d*") );
		// System.out.println("+ һ�λ��Σ� "+("4324523").matches("\\d+") );
		// System.out.println("{n} ǡ��n�Σ� "+("43245233234").matches("\\d{11}") );
		// System.out.println("{n,} ����n�Σ�
		// "+("4324523323473748").matches("\\d{11,}") );
		// System.out.println("{n,m} ����n��,���ǲ�����m�Σ�
		// "+("4324523323473748").matches("\\d{11,20}") );
		//
		// ��Χ��ʾ
		// [abc] a��b �� c�����ࣩ
		// [^abc] �κ��ַ������� a��b �� c���񶨣�
		// [a-zA-Z] a �� z �� A �� Z����ͷ����ĸ�������ڣ���Χ��
		// [a-d[m-p]] a �� d �� m �� p��[a-dm-p]��������  ����ֱ�ӣ�[a-dm-p]
		// [a-z&&[def]] d��e �� f��������   ����ֱ�ӣ�[def]
		// [a-z&&[^bc]] a �� z������ b �� c��[ad-z]����ȥ��
		// [a-z&&[^m-p]] a �� z������ m �� p��[a-lq-z]����ȥ��
		// ע�⣺��Χ�����治�������ж೤��û�������ʵ���϶�ֻ��ƥ��һ���ַ�����
		System.out.println("abc".matches("[abc]{3}"));//��Ҫ����{3}��ƥ������
		System.out.println("huc".matches("[^abc]{3}"));
		System.out.println("�ַ����Գ�����a-z֮�䣺" +("#".matches("[a-zA-Z$#]")));//�����Լ���ӣ���
		 
		
	}
}
