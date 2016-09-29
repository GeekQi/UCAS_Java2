package a93regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * 网络爬虫
 */
//	爬取邮箱的正则。
public class RegexMailExample {
	public static void main(String[] args) {
		// .com .cn .com.cn .net
		String content = "有事联系1122423@163.com448328@qq.com没事练习89238980@qq.com发红从诶809843430@163.net";
		String reg = "[a-zA-Z1-9]\\w{5,17}@[a-zA-Z0-9]{2,}(\\.(com|cn|net)){1,2}";
		// 把字符串的正则编译成正则对象
		Pattern p = Pattern.compile(reg);
		// 使用正则对象产生匹配器对象
		Matcher m = p.matcher(content);
//		System.out.println("有符合规则的字符串吗？" + m.find());
		while (m.find()) {
			System.out.println(m.group());
		}
		System.out.println("hello");
	}
}
