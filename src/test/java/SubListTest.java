import java.util.ArrayList;
import java.util.List;

/**
 * Created by yzy on 2017/06/16 下午 4:26.
 * email: mia5121@163.com
 */
public class SubListTest {

	public static void main(String[] args){
//		List<String> strs = new ArrayList<>();
//		strs.add("china");
//		strs.add("japan");
//		strs.add("usa");
//		List<String> strs2 = new ArrayList<>();
//		strs2.add("china");
//		strs2.add("japan");
//		strs2.add("usa");
//		System.out.println(strs.equals(strs2));
//
//		List<String> str3 = strs.subList(0,strs.size());
//		str3.add("haha");
//		System.out.println(str3.equals(strs));
//
//
//		String name = "huluwawa";
//		System.out.println(name.substring(0,2));
		List<String> l1 = new ArrayList<>();
		l1.add("A");
		l1.add("B");
		List<String> l2 = new ArrayList<>(l1);
		System.out.println("l1==l2:::" + l1.equals(l2));
	}
}
