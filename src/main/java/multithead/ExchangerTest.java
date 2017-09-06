package multithead;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Exchanger;

/**
 * Created by yzy on 2017/08/04 上午 9:06.
 * email: mia5121@163.com
 */
public class ExchangerTest {

	public static void main(String[] args){
		final Exchanger<List<Integer>> exchanger = new Exchanger<>();
		new Thread(new Runnable() {
			@Override
			public void run() {
				List<Integer> l = new ArrayList<>();
				l.add(1);
				l.add(2);
				try {
					l = exchanger.exchange(l);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Thread 1:..." + l);
			}
		}).start();
		new Thread(new Runnable() {
			@Override
			public void run() {
				List<Integer> l = new ArrayList<>();
				l.add(3);
				l.add(4);
				try {
					l = exchanger.exchange(l);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Thread 2:..." + l);
			}
		}).start();
	}
}
