package singler;

/**
 * Created by yzy yezhangyuan on 2017/8/30 0030.
 */
public class SingleThree {

	private SingleThree(){}

	public static class SingleThreeFactory{
		public static final SingleThree INSTANCE = new SingleThree();
	}

	public static SingleThree getInstance(){
		return SingleThreeFactory.INSTANCE;
	}

}
