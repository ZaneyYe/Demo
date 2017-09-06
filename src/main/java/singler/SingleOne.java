package singler;

/**
 * Created by yzy yezhangyuan on 2017/8/30 0030.
 */
public class SingleOne {

	private static SingleOne instance = null;

	private SingleOne(){}

	public synchronized static SingleOne getInstance(){
		if(instance == null){
			instance = new SingleOne();
		}
		return instance;
	}

	public static void main(String[] args){
		SingleOne s1 = getInstance();
		SingleOne s2 = getInstance();
		System.out.println(s1 == s2);
	}
}
