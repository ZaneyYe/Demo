package generic;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by yzy on 2017/07/14 下午 3:38.
 * email: mia5121@163.com
 * 工具类
 */
public class ArrayUtils {

	public static <T> List<T> asList(T... t){
		List<T> list = new ArrayList<T>();
		Collections.addAll(list,t);
		return list;
	}

	public static <T> T[] toArray(List<T> tlist,Class<T> tClass){
		T[] t = (T[]) Array.newInstance(tClass, tlist.size());
		for(int i = 0,n = tlist.size();i < n;i++){
			t[i] = tlist.get(i);
		}
		return t;
	}


	public static void main(String[] args){
		List<String> list = ArrayUtils.asList("A", "B");
////		List<? extends Number> list1 = ArrayUtils.asList(1l, 2.3f);
//		list.add("china");
//		list.add("usa");
//		System.out.println(list);

		//1. List接口 原生方法
		Object[] objs = list.toArray();
//		String[] strs = (String[]) objs;//异常了，数组不能强制类型转换
		for(Object o : objs){
			System.out.println((String)o);
		}

		String[] strs2 = new String[list.size()];
		String[] strs3 = list.toArray(strs2);
		for(String str : strs3){
			System.out.println(str);
		}

		//2. 改造后的方法使用
		String[] strs4 = ArrayUtils.toArray(list, String.class);
		for(String str : strs4){
			System.out.println(str);
		}

	}

}
