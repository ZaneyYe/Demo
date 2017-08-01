import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

/**
 * Created by yzy on 2017/06/16 下午 3:48.
 * email: mia5121@163.com
 */
public class GetSecondMax {

	public static void main(String[] args) {
		Integer[] data = new Integer[]{32, 13, 17, 4, 89, 90, 101, 2};
		System.out.println(getSecondMax(data));

		int[] num = new int[]{1,2,3};
		List<int[]> list = Arrays.asList(num);
		System.out.println(list.size());
	}

	public static int getSecondMax(Integer[] data){
		List<Integer> list = Arrays.asList(data);
		TreeSet<Integer> set = new TreeSet<Integer>(list);
		return set.lower(set.last()).intValue();
	}
}
