package service;

import org.apache.commons.lang3.RandomUtils;

/**
 * Created by yzy on 2017/06/21 下午 4:16.
 * email: mia5121@163.com
 */
public class NoticeServiceImpl implements NoticeService {


	private String message = "coding is life, with the code, change the world" + RandomUtils.nextInt();

	@Override
	public void notice() {
		System.out.println("notice message is sending " + message);
	}

}
