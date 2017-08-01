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

/**
 * Created by yzy on 2017/07/03 下午 3:19.
 * email: mia5121@163.com
 */
public class Main {

	public static void main(String[] args){
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:job/job.xml");
		JobLauncher launcher = (JobLauncher) context.getBean("jobLauncher");
		Job job = (Job) context.getBean("cadreJob");
		try {
//			FlatFileItemWriter writer = (FlatFileItemWriter) context.getBean("cadreWriter");
			JobExecution execution = launcher.run(job,
					new JobParametersBuilder().addString("date","0725")
							.addString("inputSource","file://1.txt")
							.toJobParameters());
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
