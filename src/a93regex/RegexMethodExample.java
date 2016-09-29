package a93regex;

import java.util.Arrays;

/**
 * 正则表达式：主要用于操作字符串的规则，正则表达式对字符串的操作主要有一下几种应用：
 * 
 * @author GeekQi
 *
 */
/*
 * 匹配:matches():
 * 
 * 切割：split():
 * 
 * 替换：replaceAll(String regex, String replacement):
 * 
 */
public class RegexMethodExample {
	public static void main(String[] args) {
		mathesPhone("13827485748");
		mathesTel("020-7837478");
		testPlit();
		testPlit2();
		replaceTest();
		replaceTest2();
	}

	// 需求：编写一个正则表达式匹配手机号码:
	// 第一位：1. 第二位：3.4.5.7.8。 长度：11.
	public static void mathesPhone(String phone) {
		String reg = "1[34578]\\d{9}";
		System.out.println(phone.matches(reg) ? "合法手机号" : "非法手机号");
	}

	// 需求：匹配固定电话 区号－主机号 区号：首位是0 长度 3～4位 主机号： 首位不能是0，长度7～8
	public static void mathesTel(String tel) {
		System.out.println(tel.matches("0\\d{2,3}-[1-9]\\d{6,7}") ? "合法固话" : "非法固话");
	}

	// 按照空格切割
	public static void testPlit() {
		String str = "明    天     放    假 啦";
		String[] datas = str.split(" +");
		System.out.println("数组的元素： " + Arrays.toString(datas));
	}

	// 根据重叠词进行切割
	public static void testPlit2() {
		String str = "大家家家家明天天玩得得得得得开心"; // 大 明 玩 开心
		String[] datas = str.split("(.)\\1+");
		// 如果正则的内容需要被复用，那么需要对正则的内容进行分组()。分组的目的就是提高正则的复用性。组号不能指定，组号是从1开始。
		// 注：\\1代表第一组的内容
		System.out.println("数组的元素： " + Arrays.toString(datas));

	}
	
	//作业：编写一个正则：匹配邮箱：12434@qq.com/.cn     @163.net   @qq.com.cn
	
	//替换
	public static void replaceTest(){
		String str = "如有需求，请联系我：13453445738如有需求，请联系我：13453445738如有需求，请联系我：13453445738如有需求，请联系我：13453445738";
		String reg = "1[34578]\\d{9}";
		str = str.replaceAll(reg, "****");
		System.out.println("被替换内容是" + str);
	}
	//还原结巴的话－－－我要做项目
	public static void replaceTest2(){
		String str = "我我我我要要要做做做项项项目目目目"; //把重叠词替换成单个词
		str = str.replaceAll("(.)\\1+", "$1");//如果需要在replaceAll方法正则的外部引用组的内容，那么是使用"$组号"来引用
		System.out.println("被替换内容是: " + str);
		
	}
}
