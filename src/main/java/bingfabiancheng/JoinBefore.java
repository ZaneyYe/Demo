package bingfabiancheng;

/**
 * Created by yzy yezhangyuan on 2017/9/6 0006.
 */
public class JoinBefore {

	public static int num = 10;

	/**
	 * join中线程B对共享变量的修改对join后主线程可见
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		Thread threadB = new Thread(new Runnable() {
			@Override
			public void run() {
			   JoinBefore.num = JoinBefore.num + 9;
			   System.out.println("b's num :" + num);
			}
		});
		threadB.start();
		threadB.join();
		System.out.println("num : " + num);


	}
}
