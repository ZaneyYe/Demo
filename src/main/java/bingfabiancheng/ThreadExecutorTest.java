package bingfabiancheng;

import java.util.concurrent.*;

/**
 * Created by yezhangyuan on 2017/9/7 0007.
 */
public class ThreadExecutorTest {

	public static void main(String[] args) throws ExecutionException, InterruptedException {
		ScheduledExecutorService service = Executors.newScheduledThreadPool(1);
		Future<Integer> future = service.schedule(new Callable<Integer>() {
			@Override
			public Integer call() throws Exception {
				return 6;
			}
		},4,TimeUnit.SECONDS);
		System.out.println(future.get());

		Executors.newFixedThreadPool(1);
		service.shutdown();


	}
}
