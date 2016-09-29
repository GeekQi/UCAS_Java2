package a3string;
/*
 String 字符串类:
  
 笔试题目：new String("abc")创建了几个对象？
 
  两个对象， 一个对象是 位于字符串常量池中，一个对象是位于堆内存中。
  
  
  
  
 */

public class StringChuangJian {

	public static void main(String[] args) {

		String str1 = "hello";
		String str2 = "hello";
		String str3 = new String("hello");
		String str4 = new String("hello");
		System.out.println("str1==str2?" + (str1 == str2)); // true
		System.out.println("str2==str3?" + (str2 == str3)); // false
		System.out.println("str3==str4?" + (str3 == str4)); // false
		System.out.println("str3.equals(str2)?" + (str3.equals(str4))); // true

		// 是String类重写了Object的equals方法，比较的是两个字符串对象 的内容 是否一致。
		// 注：看源代码，看是不是重写了
		// "=="用于比较 引用数据类型数据的时候比较的是两个对象 的内存地址，equals方法默认情况下比较也是两个对象 的内存地址。

		test("中国");
//		test(null);
	}

	public static void test(String str) {
		if ("中国".equals(str)) {//写成这样就是字符串常量再调用equals 方法，变量作为参数。则永远不会发生异常。
//			if (str.equals("中国")) {//如果用test(null)则会空指针异常。因为函数调用者为str。是个变量，可能为null。
			//习惯：常量作为eauqls方法的调用者
			System.out.println("回答正确");
		} else {
			System.out.println("回答错误");
		}
	}

}
