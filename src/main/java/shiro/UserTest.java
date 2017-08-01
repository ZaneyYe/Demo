package shiro;

import org.junit.Before;
import shiro.DO.Permission;
import shiro.service.PermissionService;
import shiro.service.PermissionServiceImpl;

/**
 * Created by yzy on 2017/07/21 下午 4:05.
 * email: mia5121@163.com
 */
public class UserTest {

	private PermissionService permissionService;

	@Before
	public void init(){
		permissionService = new PermissionServiceImpl();
	}

	@org.junit.Test
	public void testCreateUser(){

		Permission p = new Permission();
		p.setPermission("update");
		p.setDescription("更新用户");
		p.setUrl("/updateUser.json");

		Permission permission = permissionService.createPermission(p);
		System.out.println(p.getId());
	}
}
