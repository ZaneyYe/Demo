package shiro.DO;

/**
 * Created by yzy on 2017/07/21 下午 3:33.
 * email: mia5121@163.com
 */
public class Permission {

	private Integer id;
	private String permission;
	private String description;
	private String url;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPermission() {
		return permission;
	}

	public void setPermission(String permission) {
		this.permission = permission;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}
