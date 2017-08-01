package batch;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;

import java.util.Date;

/**
 * Created by yzy on 2017/07/27 下午 4:35.
 * email: mia5121@163.com
 */
public class SchedulerTask {

	private JobLauncher jobLauncher;

	private Job desJob;

	public void setJobLauncher(JobLauncher jobLauncher) {
		this.jobLauncher = jobLauncher;
	}

	public void setDesJob(Job desJob) {
		this.desJob = desJob;
	}

	public void launch(){
		try {
			JobExecution execution = jobLauncher.run(desJob,
					new JobParametersBuilder().addString("name", "定时任务")
							.addDate("date",new Date())
							.toJobParameters()); //定时任务启动，job参数必须有所区分
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
