package batch;

import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.listener.JobExecutionListenerSupport;

/**
 * Created by yzy on 2017/07/27 下午 2:14.
 * email: mia5121@163.com
 */
public class ChildJobListener extends JobExecutionListenerSupport {

	@Override
	public void afterJob(JobExecution jobExecution) {
		System.out.println("child Job endding");
		System.out.println("4::: " +  jobExecution.getJobInstance().getJobName());
	}

	@Override
	public void beforeJob(JobExecution jobExecution) {
		System.out.println("child Job beginning");
		System.out.println("3::: " + jobExecution.getJobInstance().getJobName());
	}
}
