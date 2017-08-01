package shiro;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;

/**
 * Created by yzy on 2017/07/18 下午 4:06.
 * email: mia5121@163.com
 */
public class Test {

	public static void main(String[] args){
		IniSecurityManagerFactory factory = new IniSecurityManagerFactory("classpath:myrealm.ini");
		//获取securityManager
		SecurityManager manager = factory.getInstance();
		//设置manager
		SecurityUtils.setSecurityManager(manager);
		//得到subject,绑定到当前线程
		Subject subject = SecurityUtils.getSubject();
		//设置令牌
		UsernamePasswordToken token = new UsernamePasswordToken("yzy","123");

		try {
			//模拟登录
			subject.login(token);
			//登录成功
			Session session = subject.getSession();

		} catch (AuthenticationException e) {
			e.printStackTrace();
		}

		System.out.println(subject.isAuthenticated()); //查看用户是否登录成功

		subject.logout(); //退出

	}

}
