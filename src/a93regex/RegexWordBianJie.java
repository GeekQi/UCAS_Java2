package a93regex;
//单词边界匹配器

//	\b : 单词边界匹配器只是代表了单词的开始或者结束部分。不匹配任何的字符。

public class RegexWordBianJie {
	public static void main(String[] args) {
		System.out.println("hello world".matches("hello\\b world"));
	}
}
