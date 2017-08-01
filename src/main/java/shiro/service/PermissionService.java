package shiro.service;

import shiro.DO.Permission;

/**
 * Created by yzy on 2017/07/21 下午 3:30.
 * email: mia5121@163.com
 * 权限接口
 */
public interface PermissionService {

	Permission createPermission(final Permission permission);

	void delete(Permission permission);
}
