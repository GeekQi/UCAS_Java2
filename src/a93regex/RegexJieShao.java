package a93regex;

/**
 * ������ʽ�����ڲ����ַ�����һ������������ʽ�Ĺ���ʹ��������ķ��ű�ʾ��
 * 
 * @author GeekQi
 *
 */
/*
 * ����У��һ��QQ���룺 1.������0��ͷ 2.����5��11 3.ֻ�����������
 */
public class RegexJieShao {
	public static void main(String[] args) {
		String qq = "123777";
//		if (!qq.startsWith("0")) {
//			if (qq.length() >= 5 && qq.length() <= 11) {
//				// �ж�������
//				try {
//					Long.parseLong(qq);
//					System.out.println("��ϲ���Ϸ�QQ");
//				} catch (Exception e) {
//					System.out.println("�Ƿ�QQ�� ֻ�����������");
//				}
//			} else {
//				System.out.println("�Ƿ�QQ�� ����ֻ����5��11λ");
//			}
//		} else {
//			// ��0��ͷ
//			System.out.println("�Ƿ�QQ�� ������0��ͷ");
//		}
//��һ�д��룺����15�д��룺
		System.out.println(qq.matches("[1-9]\\d{4,10}")?"�Ϸ�QQ":"�Ƿ�QQ");
		
	}
}
