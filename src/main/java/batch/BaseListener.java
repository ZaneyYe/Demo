package batch;

import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.annotation.AfterJob;
import org.springframework.batch.core.annotation.BeforeJob;

/**
 * Created by yzy on 2017/07/27 上午 11:07.
 * email: mia5121@163.com
 */
public class BaseListener {

	@BeforeJob
	public void beforeJob(JobExecution execution){
		System.out.println("base Job beginning");
		System.out.println("1::: " + execution.getJobInstance().getJobName());
	}

	@AfterJob
	public void afterJob(JobExecution execution) {
		System.out.println("base Job endding");
		System.out.println("2::: " +  execution.getJobInstance().getJobName());
	}

}
