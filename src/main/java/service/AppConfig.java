package service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by yzy on 2017/06/21 下午 4:14.
 * email: mia5121@163.com
 */
@Configuration
public class AppConfig {

	@Bean
	public NoticeService getNoticeService(){
		return new NoticeServiceImpl();
	}


}
