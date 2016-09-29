package a92jdk;

/*
jdk1.5新特性之------->可变参数

需求： 定义一个函数做加法功能（函数做几个数据 的加法功能是不确定）。

可变参数的格式：
	
	数据类型... 变量名

可变参数要 注意的细节： 
	1. 如果一个函数 的形参使用上了可变参数之后，那么调用该方法的时候可以传递参数也可以不传递参数。
	2. 可变参数实际上是一个数组对象。 因为输出的内存地址是以［ 开头的
	3. 可变参数必须位于形参中的最后一个参数。
	4. 一个函数最多只能有一个可变 参数，因为可变参数要位于形参中最后一个位置上。
	

 
 */
public class VariableCanShu {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 45, 6, 7 };

		System.out.println(arr);
		add(arr);

		// add(arr);
		add(1, 4, 6);
		add();//jvm会创建一个［］。
	}

	public static void add(int... arr) { 
		// public static void add(int[] arr) {  
		int result = 0;
		for (int item : arr) {
			result += item;
		}
		System.out.println("总和：" + result);
	}

}
