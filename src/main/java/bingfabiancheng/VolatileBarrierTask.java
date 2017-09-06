package bingfabiancheng;

/**
 * Created by yzy yezhangyuan on 2017/9/5 0005.
 */
public class VolatileBarrierTask implements Runnable {

	public VolatileBarrierExample example = VolatileBarrierExample.getExample();

	@Override
	public void run() {
		example.readAndWrite();
		System.out.println("a:" + example.getA() + ",v1: " + example.getV1() + ",v2: " + example.getV2());
	}
}
