package util;

import org.apache.commons.lang3.time.DateUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by yzy on 2017/06/14 上午 9:05.
 * email: mia5121@163.com
 */
public class UtilClass {
//	private UtilClass(){
//		throw new RuntimeException("not instance this class");
//	}

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSSSSS");
//		String s = sdf.format(new Date());
//		System.out.println(s);

		String d1 = "2017-08-31 10:50:11.005121";
		String d2 = "2017-08-31 10:50:11.005893";
		Date date1 = sdf.parse(d1);
		Date date2 = sdf.parse(d2);
		Date datePlus = DateUtils.addMinutes(date1, 5);
		System.out.println(sdf.format(datePlus));

		System.out.println(date1.getTime());
		long timeplus = date1.getTime() + 1000 * 60 * 5;
		System.out.println(sdf.format(new Date(timeplus)));

		System.out.println("=========");
		System.out.println(date2.getTime());
		System.out.println(date1.compareTo(date2));
	}
}
