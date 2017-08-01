package exc;

/**
 * Created by yzy on 2017/07/17 下午 2:38.
 * email: mia5121@163.com
 */
public class RunExc {

	public static Runner run(){
		Runner runner = new Runner("wade",33);
		try {
			return runner;
		} catch (Exception e) {
//			e.printStackTrace();
		} finally {
			runner.setAge(35);
		}
		runner.setName("dwade");
		return runner;
	}

	public static int add(){
		int a = 1;
		try {
			return a;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
//			return  -1;
			a = 9;
//			return a;
		}
//		return 0;//不能到达
		return a;
	}
}
