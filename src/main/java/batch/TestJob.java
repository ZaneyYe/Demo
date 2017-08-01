package batch;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

/**
 * Created by yzy on 2017/07/27 下午 2:20.
 * email: mia5121@163.com
 */
public class TestJob {

	public static void main(String[] args){
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:job/job-test.xml");
		//获取job
		Job childJob = (Job) context.getBean("childJob");
		//获取执行器launcher
		JobLauncher launcher = (JobLauncher) context.getBean("jobLauncher");
		try {
			JobExecution execution = launcher.run(childJob, new JobParametersBuilder().addDate("date", new Date()).toJobParameters());
			System.out.println(execution.toString());
		} catch (JobExecutionAlreadyRunningException e) {
			e.printStackTrace();
		} catch (JobRestartException e) {
			e.printStackTrace();
		} catch (JobInstanceAlreadyCompleteException e) {
			e.printStackTrace();
		} catch (JobParametersInvalidException e) {
			e.printStackTrace();
		}
	}
}
