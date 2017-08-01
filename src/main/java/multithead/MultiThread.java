package multithead;

/**
 * Created by yzy on 2017/07/19 上午 10:56.
 * email: mia5121@163.com
 */
public class MultiThread implements Runnable{
	int a = 0;
	@Override
	public void run() {
		synchronized (""){
			a++;
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			a--;
			String tn = Thread.currentThread().getName();
			System.out.println(tn + "...a =" + a);
		}
	}
}
