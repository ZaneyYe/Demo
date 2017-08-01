package multithead;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by yzy on 2017/07/19 下午 3:36.
 * email: mia5121@163.com
 */
public class ThreadPoolTest {

	public static void main(String[] args){
		ExecutorService es = Executors.newFixedThreadPool(2);
		for(int i = 0;i < 4;i++){
			es.submit(new Runnable() {
				@Override
				public void run() {
					System.out.println(Thread.currentThread().getName()+".....");
					while (true){

					}
				}
			});
		}
		//关闭
		es.shutdown();
	}
}
