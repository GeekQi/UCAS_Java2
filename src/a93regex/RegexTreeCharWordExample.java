package a93regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 查找：
 * 
 * @author GeekQi
 *
 */

// * 查找： 需要使用的对象： 1.Pattern(正则对象） 2.Matcher(匹配器对象)
// *
// * 1，先将正则表达式编译成正则对象。使用的是Pattern类一个静态的方法。compile(regex);
// * 2，让正则对象和要操作的字符串相关联，通过matcher方法完成，并返回匹配器对象。//所有的状态都驻留在匹配器中
// * 3，通过匹配器对象的方法将正则模式作用到字符串上对字符串进行针对性的功能操作
// * －－Pattern p = Pattern.compile("a*b");
// * －－Matcher m = p.matcher("aaaaab");
// * －－boolean b = m.matches();
// *
// * 需求：获取由3个字母组成的单词。
// *
// 匹配器要使用的方法：
// 1.find() 通知匹配器去匹配字符串，查找符合规则的字符串。如果能查找到符合规则的字符串，返回true。否则返回false
// 2.group() 获取符合规则的字串。
// 注意：使用group方法的时候，一定要先调用find方法让匹配器去查找符合规则的字符串。否则会报错

public class RegexTreeCharWordExample {
	public static void main(String[] args) {
		String content = "da jiang de jia qi wan bi liao kai xin ma";
//		String reg = "[a-zA-Z]{3}b";
		String reg = "\\b[a-zA-Z]{3}\\b";
		// 先要把字符串的正则编译成Pattern对象。
		Pattern p = Pattern.compile(reg);
		// 使用正则对象匹配字符串用于产生一个Matcher对象。
		Matcher m = p.matcher(content);
		// System.out.println("有符合规则的字符串吗？" + m.find());
		// System.out.println("获取结果： " + m.group());
		while (m.find()) {
			System.out.println(m.group());
		}
		// 注：此方法有问题是会把整个单词切分。
	}
}
