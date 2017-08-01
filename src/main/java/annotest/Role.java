package annotest;

/**
 * Created by yzy on 2017/07/13 下午 4:44.
 * email: mia5121@163.com
 */
public enum Role implements Identifier{
	Reader,Author,Admin;

	@Override
	public boolean identify() {
		if(this == Admin){
			return true;
		}else{
			return false;
		}
	}

}
