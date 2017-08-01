package shiro.service;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import shiro.DO.Permission;
import shiro.util.JdbcUtils;

import java.sql.*;

/**
 * Created by yzy on 2017/07/21 下午 3:30.
 * email: mia5121@163.com
 */
public class PermissionServiceImpl implements PermissionService {

	private JdbcTemplate jdbcTemplate = JdbcUtils.getJdbcTemplate();


	@Override
	public Permission createPermission(final Permission permission) {
		final String sql = "insert into t_permission(permission,descp,url,createtime,updatetime) values (?,?,?,?,?)";

		GeneratedKeyHolder keyHolder = new GeneratedKeyHolder();
		jdbcTemplate.update(new PreparedStatementCreator() {
			@Override
			public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
				PreparedStatement psst = connection.prepareStatement(sql,  new String[] { "id" });
				psst.setString(1, permission.getPermission());
				psst.setString(2, permission.getDescription());
				psst.setString(3,permission.getUrl());
//				psst.setDate(4,new java.sql.Date(System.currentTimeMillis())); //没有时间
//				psst.setDate(5,new java.sql.Date(System.currentTimeMillis()));
				psst.setTimestamp(4,new Timestamp(System.currentTimeMillis()));
				psst.setTimestamp(5,new Timestamp(System.currentTimeMillis()));
				return psst;
			}
		}, keyHolder);

		permission.setId(keyHolder.getKey().intValue());

		return permission;

	}

	@Override
	public void delete(Permission permission) {

	}

	public static void main(String[] args){
		System.out.println(new Date(System.currentTimeMillis()));
		System.out.println(new java.util.Date());
		System.out.println();
	}
}
