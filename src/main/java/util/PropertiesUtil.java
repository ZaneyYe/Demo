package util;

import java.util.Map;

/**
 * Created by yzy on 2017/07/18 上午 9:31.
 * email: mia5121@163.com
 */
public class PropertiesUtil {

	private static final Map map = ResourceLoader.getPropertis();

	public static Object get(String key){
		if(map != null && map.get(key) != null && map.get(key) != ""){
			return map.get(key);
		}
		return "";
	}

	public static void main(String[] args){
		System.out.println(PropertiesUtil.get("country"));
	}

}
