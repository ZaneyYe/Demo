import org.apache.commons.lang3.builder.CompareToBuilder;

import java.util.Comparator;

/**
 * Created by yzy on 2017/07/07 下午 4:01.
 * email: mia5121@163.com
 */
public class UserComparator implements Comparator<User> {

	@Override
	public int compare(User o1, User o2) {
		return new CompareToBuilder()
				.append(o1.getAge(),o2.getAge())
				.append(o1.getId(),o2.getId())
				.toComparison();
	}
}
