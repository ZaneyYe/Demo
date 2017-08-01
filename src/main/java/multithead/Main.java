package multithead;

/**
 * Created by yzy on 2017/07/19 上午 10:59.
 * email: mia5121@163.com
 */
public class Main {

	public static void main(String[] args){
		MultiThread t = new MultiThread();
		Thread t1 = new Thread(t);
		t1.start();
		for(int i = 0;i < 5;i++){
			new Thread(t).start();
		}
		t1.stop();//old
	}


}
