package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by yzy on 2017/07/17 上午 11:16.
 * email: mia5121@163.com
 */
public class CarProxy implements InvocationHandler{

	private Car c;

	public CarProxy(Car c) {
		this.c = c;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("加满油");
		return method.invoke(c,args);
	}
}
