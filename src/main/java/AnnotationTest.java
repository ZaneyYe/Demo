import java.lang.reflect.Method;

/**
 * Created by yzy on 2017/06/13 下午 2:38.
 * email: mia5121@163.com
 */
public class AnnotationTest {

	@MethodParam(value = "cat")
	public void run(){
		System.out.println("this cat is run");
	}

	public void eat(){
		System.out.println("this cat is eating");
	}

	public static void main(String[] args){
		Method[] methods = AnnotationTest.class.getDeclaredMethods();
		for(Method m : methods){
			if(m.getAnnotations().length > 0){
				if("cat".equals(m.getAnnotation(MethodParam.class).value())){
					System.out.println(m.getName()+" have a annotation");
				}
			}
		}
	}
}
