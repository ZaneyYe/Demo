package lambda;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author yezhangyuan
 * Created by yzy yezhangyuan on 2017/9/25 0025.
 */
public class Demo1 {

	public static void main(String[] args){
		Comparator<String> comparator = (String s1, String s2) -> Integer.compare(s1.length(), s2.length());
		String[] strs = new String[]{"define","gg","top"};
		Arrays.sort(strs,comparator);
		System.out.println(Arrays.asList(strs));

		String a = "a" + "_" + "_ " + "b";
		System.out.println(a);
		System.out.println(a.split("_").length);
	}
}
