package shiro.role;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.ThreadContext;
import org.junit.After;

/**
 * Created by yzy on 2017/07/20 下午 3:22.
 * email: mia5121@163.com
 */
public class BaseTest {

	@After
	public void clean(){
		ThreadContext.unbindSubject();// 解除绑定
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
