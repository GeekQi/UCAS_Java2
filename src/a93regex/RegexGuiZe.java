package a93regex;

public class RegexGuiZe {
	public static void main(String[] args) {

		// Regex -－－ 预定义字符类
		//
		// . 任何字符 （除了行结束符之外）
		// \d 数字：[0-9]
		// \D 非数字：[^0-9]
		// \s 空白字符：[\t\n\x0B\f\r]
		// \S 非空白字符：[^\s]
		// \w 单词字符：[a-zA-Z_0-9]
		// \W 非单词字符：[^\w]
		// 注意：任何预定义字符没有加上数量词之前都只能匹配一个字符而已
		// System.out.println("任意字符: " + ("%".matches(".")));
		// System.out.println("数字字符: " + ("123".matches("\\d\\d")));
		// System.out.println("非数字字符: " + ("@".matches("\\D")));
		// System.out.println("空白字符: " + ("\r".matches("\\s")));// \r是回车 \n是换行 "
		// "
		// // 也是空白字符
		// System.out.println("非空白字符: " + ("\n".matches("\\S")));
		// System.out.println("单词字符: " + ("_".matches("\\w")));
		// System.out.println("非单词字符: " + ("_".matches("\\W")));

		// 数量词
		// Greedy －－－－数量词
		// X? X，一次或一次也没有
		// X* X，零次或多次
		// X+ X，一次或多次
		// X{n} X，恰好n次
		// X{n,} X，至少n次
		// X{n,m} X，至少n次，但是不超过m次[指定次数出现的范围]
		// System.out.println("？一次或一次都没有： "+("1").matches("\\d?") );
		// System.out.println("* 零次或多次： "+("4324523").matches("\\d*") );
		// System.out.println("+ 一次或多次： "+("4324523").matches("\\d+") );
		// System.out.println("{n} 恰好n次： "+("43245233234").matches("\\d{11}") );
		// System.out.println("{n,} 至少n次：
		// "+("4324523323473748").matches("\\d{11,}") );
		// System.out.println("{n,m} 至少n次,但是不超过m次：
		// "+("4324523323473748").matches("\\d{11,20}") );
		//
		// 范围表示
		// [abc] a、b 或 c（简单类）
		// [^abc] 任何字符，除了 a、b 或 c（否定）
		// [a-zA-Z] a 到 z 或 A 到 Z，两头的字母包括在内（范围）
		// [a-d[m-p]] a 到 d 或 m 到 p：[a-dm-p]（并集）  可以直接：[a-dm-p]
		// [a-z&&[def]] d、e 或 f（交集）   可以直接：[def]
		// [a-z&&[^bc]] a 到 z，除了 b 和 c：[ad-z]（减去）
		// [a-z&&[^m-p]] a 到 z，而非 m 到 p：[a-lq-z]（减去）
		// 注意：范围词里面不管内容有多长，没有数量词的配合都只能匹配一个字符而已
		System.out.println("abc".matches("[abc]{3}"));//需要加上{3}来匹配数量
		System.out.println("huc".matches("[^abc]{3}"));
		System.out.println("字符可以出现在a-z之间：" +("#".matches("[a-zA-Z$#]")));//可以自己添加＃等
		 
		
	}
}
