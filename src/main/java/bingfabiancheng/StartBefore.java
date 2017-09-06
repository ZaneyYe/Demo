package bingfabiancheng;

/**
 * Created by yzy yezhangyuan on 2017/9/6 0006.
 */
public class StartBefore {

	public static int num = 10;

	/**
	 * 在线程start之前，主线程修改对线程B可见
	 * @param args
	 */
	public static void main(String[] args){
		num = num  - 1;
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println(StartBefore.num);
				num = num + 9;
				System.out.println(num);
			}
		}).start();
	}
}
