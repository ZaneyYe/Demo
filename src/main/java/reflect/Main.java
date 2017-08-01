package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by yzy on 2017/07/17 上午 10:10.
 * email: mia5121@163.com
 */
public class Main {

	public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
		Hello hello = new Hello();
//		Method[] methods = hello.getClass().getMethods();
//
//		for (Method m : methods){
//			if(!m.isAccessible()){
//				m.setAccessible(true); //安全检查的作用，并非是访问的控制
//			}
//			if("hello".equals(m.getName())){
//				try {
//					m.invoke(hello);
//				} catch (IllegalAccessException e) {
//					e.printStackTrace();
//				} catch (InvocationTargetException e) {
//					e.printStackTrace();
//				}
//			}
//		}
		Constructor<? extends Hello> constructor = hello.getClass().getConstructor(String.class);
		Hello china = constructor.newInstance("china");
		china.hello();
//		System.out.println();
	}
}
