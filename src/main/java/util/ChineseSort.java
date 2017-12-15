package util;

import java.text.Collator;
import java.util.Arrays;
import java.util.Locale;

/**
 * Created by yzy on 2017/06/15 下午 3:21.
 * email: mia5121@163.com
 */
public class ChineseSort {

	public static void main(String[] args){
		String[] names = new String[]{"张三","李四","王五"};
		Collator c  = Collator.getInstance(Locale.CHINA);
		Arrays.sort(names,c);
		System.out.println(Arrays.asList(names));


	}

}
