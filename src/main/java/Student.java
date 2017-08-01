/**
 * Created by yzy on 2017/06/13 上午 10:36.
 * email: mia5121@163.com
 */
public class Student extends Person {

	public synchronized void doSomething(){
		System.out.println("say lili");
		super.doSomething();
	}

	public static void main(String[] args){
		new Student().doSomething();
	}
}
