package exc;

/**
 * Created by yzy on 2017/07/19 上午 9:25.
 * email: mia5121@163.com
 */
public class ExcMsg {

	public static String excute(){
		StackTraceElement[] traces = new Throwable().getStackTrace();
		for(StackTraceElement element : traces){
			if("m1".equals(element.getMethodName())){
				return "m1 method";
			}
			if("m2".equals(element.getMethodName())){
				return "m2 method";
			}
		}
		return "";
	}
}
