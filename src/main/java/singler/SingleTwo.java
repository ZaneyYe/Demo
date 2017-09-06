package singler;

/**
 * Created by yzy yezhangyuan on 2017/8/30 0030.
 */
public class SingleTwo {

	private static volatile SingleTwo instance;

	private SingleTwo(){}

	public static SingleTwo getInstance(){
		if(instance == null){
			synchronized (SingleTwo.class){
				if(instance == null){
					instance = new SingleTwo();
				}
			}
		}
		return instance;
	}

	public static void main(String[] args){
		SingleTwo s1 = getInstance();
		SingleTwo s2 = getInstance();
		System.out.println(s1 == s2);
	}
}
