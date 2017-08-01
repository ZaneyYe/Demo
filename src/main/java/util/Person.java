package util;

import java.io.Serializable;

/**
 * Created by yzy on 2017/06/14 上午 9:52.
 * email: mia5121@163.com
 */
public class Person implements Serializable {

	private static final long serialVersionUID = 8609176652974609637L;

	public Person(String name) {
		this.name = name;
	}

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Person person = (Person) o;

		return name != null ? name.equals(person.name) : person.name == null;
	}

	@Override
	public int hashCode() {
		return name != null ? name.hashCode() : 0;
	}

	@Override
	public String toString() {
		return "Person{" +
				"name='" + name + '\'' +
				'}';
	}
}
