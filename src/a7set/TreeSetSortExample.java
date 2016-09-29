 package a7set;

import java.util.Iterator;
import java.util.TreeSet;
/*
需求：将字符串中的数值进行排序。
		例如String str="8 10 15 5 2 7"; ---->   "2 5 7 8 10 15"
*/

public class TreeSetSortExample {
	
	public static void main(String[] args) {
		String str="8 10 15 5 2 7";
		String[] datas = str.split(" ");
		
		TreeSet tree = new TreeSet();
		for(int i = 0 ; i<datas.length ; i++){
			tree.add(Integer.parseInt( datas[i])); // 字符串转int类型数据是需要使用Integer.parseInt()
			//因为字符串中2 比10大。所以应该先转成整数类型
		}
		
		//遍历treeSet的元素拼接成对应的字符串
		//注Set是没有get方法的。只能用迭代器方法
		Iterator it = tree.iterator();
		while(it.hasNext()){
			System.out.print(it.next()+" ");
		}
		
	}

}
