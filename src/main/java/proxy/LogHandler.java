package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by yzy on 2017/08/04 上午 9:39.
 * email: mia5121@163.com
 */
public class LogHandler implements InvocationHandler {
	private  Object o;

	public LogHandler(Object o) {
		this.o = o;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("log before.....");
		Object res = method.invoke(o, args);
		System.out.println("log after.....");
		return res;
	}
}
