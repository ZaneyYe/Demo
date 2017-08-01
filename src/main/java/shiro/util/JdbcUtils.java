package shiro.util;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import shiro.DO.User;

import java.util.List;

/**
 * Created by yzy on 2017/07/21 下午 3:37.
 * email: mia5121@163.com
 */
public class JdbcUtils {

	private static volatile JdbcTemplate jdbcTemplate;

	public static JdbcTemplate getJdbcTemplate(){
		if(jdbcTemplate == null){
			synchronized (JdbcUtils.class){
				if(jdbcTemplate == null){
					DruidDataSource ds = new DruidDataSource();
					ds.setDriverClassName("com.mysql.jdbc.Driver");
					ds.setUrl("jdbc:mysql://192.168.43.3:3306/user");
					ds.setUsername("root");
					ds.setPassword("root");
					jdbcTemplate = new JdbcTemplate(ds);
				}
			}
		}
		return jdbcTemplate;
	}

	//测试链接
	public static void main(String[] args){
		JdbcTemplate jdbcTemplate = JdbcUtils.getJdbcTemplate();
		List<User> users = jdbcTemplate.query("select id, name, password, salt from t_user",
				new BeanPropertyRowMapper(User.class));
		System.out.println(users.get(0).getName());
	}
}
