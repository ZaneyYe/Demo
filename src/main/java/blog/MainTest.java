package blog;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by yezhangyuan on 2017-12-05.
 *
 * @author yezhangyuan
 */
public class MainTest {

	public static void main(String[] args){
		try {
			Class<?> clazz = Class.forName("blog.ResourcePathTest");
			try {
				Method method = clazz.getDeclaredMethod("hello");
				try {
					Object res = method.invoke(null, null);
					System.out.println(res);
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					e.printStackTrace();
				}
			} catch (NoSuchMethodException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
