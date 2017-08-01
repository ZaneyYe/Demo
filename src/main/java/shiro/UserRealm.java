package shiro;

import org.apache.shiro.authc.*;
import org.apache.shiro.realm.Realm;

/**
 * Created by yzy on 2017/07/18 下午 4:37.
 * email: mia5121@163.com
 */
public class UserRealm implements Realm {
	@Override
	public String getName() {
		return "userRealm";
	}

	@Override
	public boolean supports(AuthenticationToken token) {
		return token instanceof UsernamePasswordToken;
	}

	@Override
	public AuthenticationInfo getAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		String userName = (String) token.getPrincipal();
		String pwd = new String((char[])token.getCredentials());
		if(!"yzy".equals(userName)){
			throw new UnknownAccountException("用户名错误");
		}
		if(!"123".equals(pwd)){
			throw new IncorrectCredentialsException("密码错误");
		}
		//认证成功
		return new SimpleAuthenticationInfo(userName, pwd, getName());
	}
}
