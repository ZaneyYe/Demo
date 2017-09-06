package proxy;

import java.lang.reflect.Proxy;

/**
 * Created by yzy on 2017/07/17 上午 11:19.
 * email: mia5121@163.com
 */
public class Main {

	public static void main(String[] args){
		ForterCar forterCar = new ForterCar();
//		CarProxy poroxyHandler = new CarProxy(forterCar);
//		Car car = (Car) Proxy.newProxyInstance(forterCar.getClass().getClassLoader(), forterCar.getClass().getInterfaces(), poroxyHandler);
//		car.run();
		LogHandler logHandler = new LogHandler(forterCar);
		Car c = (Car) Proxy.newProxyInstance(forterCar.getClass().getClassLoader(), forterCar.getClass().getInterfaces(),logHandler);
		c.run();
	}

}
