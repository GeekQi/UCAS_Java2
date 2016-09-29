package a93regex;

/**
 * 正则表达式：用于操作字符串的一个规则，正则表达式的规则使用了特殊的符号表示。
 * 
 * @author GeekQi
 *
 */
/*
 * 需求：校验一个QQ号码： 1.不能以0开头 2.长度5～11 3.只能由数字组成
 */
public class RegexJieShao {
	public static void main(String[] args) {
		String qq = "123777";
//		if (!qq.startsWith("0")) {
//			if (qq.length() >= 5 && qq.length() <= 11) {
//				// 判断是数字
//				try {
//					Long.parseLong(qq);
//					System.out.println("恭喜：合法QQ");
//				} catch (Exception e) {
//					System.out.println("非法QQ， 只能由数字组成");
//				}
//			} else {
//				System.out.println("非法QQ， 长度只能是5～11位");
//			}
//		} else {
//			// 以0开头
//			System.out.println("非法QQ， 不能以0开头");
//		}
//用一行代码：代替15行代码：
		System.out.println(qq.matches("[1-9]\\d{4,10}")?"合法QQ":"非法QQ");
		
	}
}
