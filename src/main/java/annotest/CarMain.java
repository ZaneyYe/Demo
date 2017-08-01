package annotest;

import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map;

/**
 * Created by yzy on 2017/07/14 下午 2:46.
 * email: mia5121@163.com
 */
public class CarMain {

	public static void main(String[] args){
		EnumSet<Car> carSet = EnumSet.allOf(Car.class);
		System.out.println(carSet.size());
		for(Car cc : carSet){
			System.out.println(cc.getName());
		}

		EnumMap<Car,String> map = new EnumMap<>(Car.class);
		map.put(Car.Futer,"usa");
		map.put(Car.BMW,"germany");
		map.put(Car.TOYOTA,"japan");
		for(Map.Entry<Car,String> entry : map.entrySet()){
			System.out.println(entry.getKey().getName() + ":: " + entry.getValue());
		}

	}
}
