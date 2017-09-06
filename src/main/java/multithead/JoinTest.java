package multithead;

/**
 * Created by yzy on 2017/08/02 下午 3:06.
 * email: mia5121@163.com
 */
public class JoinTest {

	public static void main(String[] args) throws InterruptedException {

		Thread parse1 = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i = 0;i < 5;i++){
					System.out.println("parse ..." + i);
				}
			}
		});
		Thread parse2 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("parse2 finish lo");
			}
		});
		parse1.start();
		parse2.start();
		parse1.join();
		parse2.join();
		System.out.println("all work is finished");
	}
}
