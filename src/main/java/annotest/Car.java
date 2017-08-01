package annotest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by yzy on 2017/07/14 下午 1:41.
 * email: mia5121@163.com
 */
public enum Car {
	Futer(1, "福特", 110000),
	BMW(2, "宝马", 2000000),
	TOYOTA(3, "丰田", 230000);

	private static final Map<Integer,Car> map = new HashMap<>();

	static {
		for(Car c : values()){
			if(c != null){
				map.put(c.intValue(),c);
			}
		}
	}

	private int i;
	private String name;
	private Integer price;

	Car(){};

	Car(int i, String name, Integer price) {
		this.i = i;
		this.name = name;
		this.price = price;
	}

	public int intValue() {
		return i;
	}

	public String getName() {
		return name;
	}

	public static Car valueOf(Integer i){
		if(i != null){
			return map.get(i);
		}
		return null;
	}


}
