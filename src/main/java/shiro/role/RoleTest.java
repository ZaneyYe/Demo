package shiro.role;

import junit.framework.Assert;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.subject.Subject;

/**
 * Created by yzy on 2017/07/20 下午 2:39.
 * email: mia5121@163.com
 */
public class RoleTest {

	public static void main(String[] args){
		login("classpath:shiro/shiro-role.ini","zhang","123");
		Subject subject = SecurityUtils.getSubject();
		System.out.println(subject.hasRole("role1"));
		Assert.assertEquals(true,subject.hasRole("role1"));
//		Assert.assertEquals(true,subject.hasAllRoles(Arrays.asList("role3","role1")));

		subject.checkRole("role3");
	}

	public static void login(String configFile,String userName,String passowrd){
		IniSecurityManagerFactory iniSmgFt = new IniSecurityManagerFactory(configFile);
		//获取securityManager
		SecurityManager securityManager = iniSmgFt.getInstance();
		SecurityUtils.setSecurityManager(securityManager);
		//得到subject
		Subject subject = SecurityUtils.getSubject();
		UsernamePasswordToken token = new UsernamePasswordToken(userName,passowrd.toCharArray());
		//用户名密码登录
		subject.login(token);
	}
}
