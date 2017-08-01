package exc;

/**
 * Created by yzy on 2017/07/17 下午 2:35.
 * email: mia5121@163.com
 */
public class BussinessException extends RuntimeException {

	private Integer code;

	public BussinessException(String message) {
		super(message);
	}

	public BussinessException(String message,Integer code){
		super(message);
		this.code = code;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

}
