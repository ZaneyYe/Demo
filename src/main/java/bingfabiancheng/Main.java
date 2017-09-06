package bingfabiancheng;

/**
 * Created by yzy yezhangyuan on 2017/9/5 0005.
 */
public class Main {

	public static void main(String[] args){
		new Thread(new VolatileBarrierTask()).start();
		new Thread(new VolatileBarrierTask()).start();
	}
}
