package shiro.role;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.junit.Test;

/**
 * Created by yzy on 2017/07/20 下午 3:11.
 * email: mia5121@163.com
 */
public class PermissionTest extends BaseTest{

	@Test
	public void test1(){
		login("classpath:shiro/shiro-permission.ini","zhang","123");
		Subject subject = SecurityUtils.getSubject();
		subject.checkPermission("user:update");
		subject.checkPermission("user:create");
		System.out.println(subject.isPermitted("user:update"));
	}


}
