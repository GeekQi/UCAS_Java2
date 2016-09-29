package a90map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
	迭代：
		keySet() 
		values() 
		entrySet() 

*/
public class MapBianli {

	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String, String>();//根据内存地址算出存储位置
		//添加方法
		map.put("汪峰", "章子怡");
		map.put("文章", "马伊琍");
		map.put("谢霆锋","张柏芝");
		map.put("成龙", "林凤娇");
		
		//map集合中遍历方式一： 使用keySet方法进行遍历       缺点： keySet方法只是返回了所有的键，没有值。 
//		Set<String> keys = map.keySet();  //keySet() 把Map集合中的所有键都保存到一个Set类型 的集合对象中返回。
//		Iterator<String> it = keys.iterator();
//		while(it.hasNext()){
//			String key = it.next();
//			System.out.println("键："+ key+" 值："+ map.get(key));
//		}
		
		
		
		//map集合的遍历方式二： 使用values方法进行 遍历。    缺点： values方法只能返回所有 的值，没有键。
//		Collection<String>  c = map.values(); //values() 把所有的值存储到一个Collection集合中返回。
//		Iterator<String> it = c.iterator();
//		while(it.hasNext()){
//			System.out.println("值："+ it.next());//get方法是list接口特有的。
//		}
//		
		
		//map集合的遍历方式三： entrySet方法遍历。
		Set<Map.Entry<String,String>>  entrys = map.entrySet(); //因为双列集合没有迭代器//静态内部类
		Iterator<Map.Entry<String,String>> it = entrys.iterator();
		while(it.hasNext()){
			Map.Entry<String,String> entry = it.next();
			System.out.println("键："+ entry.getKey()+" 值："+ entry.getValue());
		}
		
	}
	
	

}
