package bingfabiancheng;

/**
 * Created by yzy yezhangyuan on 2017/9/5 0005.
 */
public class VolatileBarrierExample{
	int a;
	volatile int v1 = 10;
	volatile int v2 = 20;

	void readAndWrite(){
		int i = v1;
		int j = v2;
		a = i + j;
		v1= i + 1;
		v2 = j + 1;
	}

	public int getA() {
		return a;
	}

	public int getV1() {
		return v1;
	}

	public int getV2() {
		return v2;
	}

	private static VolatileBarrierExample example = new VolatileBarrierExample();

	public static VolatileBarrierExample getExample(){
		return  example;
	}

}
