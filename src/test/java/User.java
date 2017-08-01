import org.apache.commons.lang3.builder.CompareToBuilder;

/**
 * Created by yzy on 2017/06/15 下午 1:53.
 * email: mia5121@163.com
 */
public class User implements Comparable<User>{
	private Integer id;
	private String name;
	private Integer age;

	public User() {
	}

	public User(Integer id, String name, Integer age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "User{" +
				"id=" + id +
				", name='" + name + '\'' +
				", age=" + age +
				'}';
	}

	@Override
	public int compareTo(User o) {
		return new CompareToBuilder()
				.append(id,o.id)
				.toComparison();
	}
}
