package exc;

/**
 * Created by yzy on 2017/07/17 下午 2:43.
 * email: mia5121@163.com
 */
public class Runner {
	private String name;
	private Integer age;

	public Runner(String name, Integer age) {
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

	@Override
	public String toString() {
		return "Runner{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}
}
