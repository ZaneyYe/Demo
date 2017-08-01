package util;

/**
 * Created by yzy on 2017/06/14 上午 10:09.
 * email: mia5121@163.com
 */
public class Main {

	public static void main(String[] args){
		Person object = Tool.cloneObject(new Person("张三"));
		System.out.println(object.getName());
	}
}
