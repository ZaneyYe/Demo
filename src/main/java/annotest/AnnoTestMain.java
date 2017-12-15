package annotest;

/**
 * Created by yzy on 2017/07/13 下午 4:49.
 * email: mia5121@163.com
 */
public class AnnoTestMain {

	public static void main(String[] args){
		Foo f = new Foo();
		Access access = f.getClass().getAnnotation(Access.class);
		if(access == null || !access.level().identify()){
			System.out.println("被阻挡了啊啊啊啊");
		}else{
			System.out.println("通过了丫丫");
		}
	}


}
