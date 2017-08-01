import java.util.Calendar;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by yzy on 2017/07/07 下午 3:54.
 * email: mia5121@163.com
 */
public class Main {

	public static void main(String[] args){
//		List<User> users = new ArrayList<>();
//		users.add(new User(1,"zy",28));
//		users.add(new User(2,"demo",34));
//		users.add(new User(5,"demo",34));
//		users.add(new User(4,"cmy",26));
//		users.add(new User(3,"znr",26));
////		Collections.sort(users,new UserComparator());
////		System.out.println(users);s
//		Collections.shuffle(users);
//		System.out.println(users);
//		Calendar c = Calendar.getInstance();
//		c.add(Calendar.DATE,-3);
//		System.out.println(c.getTime());
//
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//		Calendar c = Calendar.getInstance();
//		c.add(Calendar.DATE, -1);
//		System.out.println(sdf.format(c.getTime()));
		System.out.println(Calendar.getInstance().get(13) + "");

		Lock lock = new ReentrantLock(true); //声明公平锁
		ExecutorService es = Executors.newFixedThreadPool(2);

	}

}
