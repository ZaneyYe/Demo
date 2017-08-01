package async;

import java.util.concurrent.*;

/**
 * Created by yzy on 2017/07/19 下午 3:06.
 * email: mia5121@163.com
 */
public class Main {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		//单线程异步执行器
		ExecutorService es = Executors.newSingleThreadExecutor();
		Future<Integer> future = es.submit(new TaxCalculator(100));

		while(!future.isDone()){
			//任务没有结束，间歇一秒打印*
			TimeUnit.MILLISECONDS.sleep(1000);
			System.out.print("* ");
		}
		System.out.println("任务完成, 计算税金： " + future.get());

		es.shutdown();
	}
}
