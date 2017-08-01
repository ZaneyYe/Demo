package shiro.DO;

/**
 * Created by yzy on 2017/07/21 下午 3:33.
 * email: mia5121@163.com
 */
public class User {

	private Integer id;
	private String name;
	private String password;
	private String salt;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}
}
