package batch;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by yzy on 2017/07/27 下午 4:53.
 * email: mia5121@163.com
 */
public class TestScheduleJob {

	public static void main(String[] args){
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:job/job-schedule.xml");
	}
}
