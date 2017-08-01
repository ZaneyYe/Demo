import org.springframework.beans.BeanWrapper;
import org.springframework.beans.PropertyAccessorFactory;

/**
 * Created by yzy on 2017/06/15 下午 1:53.
 * email: mia5121@163.com
 */
public class BeanWrapperTest {
	public static void main(String[] args){
		User user = new User();
		BeanWrapper bw = PropertyAccessorFactory.forBeanPropertyAccess(user);

		bw.setPropertyValue("name","yzy");
		bw.setPropertyValue("age",25);
		
		System.out.println(user.getName()+"：：" + user.getAge());

	}
}
