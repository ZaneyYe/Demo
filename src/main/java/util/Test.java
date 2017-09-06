package util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by yzy yezhangyuan on 2017/8/31 0031.
 */
public class Test {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSSSS");
		long timeinterval = 5;

		String begStr = "2017-08-28 15:27:24.097057";

		long timePlus = simpleDateFormat.parse(begStr).getTime() + 1000 * 60 * 5;

//		Date addMinutes = DateUtils.addMinutes(simpleDateFormat.parse(begStr), 5);
//
//		System.out.println(simpleDateFormat.format(addMinutes));

		Date begStr_plus_5_Date = new Date(simpleDateFormat.parse(begStr).getTime() + 1000L * 60 * timeinterval);

		System.out.println("begStr_plus_5_Date Date=" + begStr_plus_5_Date);
		System.out.println("begStr_plus_5_Date Date format="+ simpleDateFormat.format(begStr_plus_5_Date));
	}


}
