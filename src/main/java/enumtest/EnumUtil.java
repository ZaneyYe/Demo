package enumtest;

import annotest.Role;

/**
 * Created by yzy on 2017/07/19 上午 9:55.
 * email: mia5121@163.com
 */
public class EnumUtil {

	public static <T extends Enum<T>> boolean contain(Class<T> c,String objName){
		for(T tt: c.getEnumConstants()){
			if(objName.equals(tt.name())){
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args){
		Class<Role> c = Role.class;
		System.out.println(contain(Role.class,"Admin"));
	}
}
