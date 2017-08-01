package async;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/**
 * Created by yzy on 2017/07/19 下午 3:02.
 * email: mia5121@163.com
 */
public class TaxCalculator implements Callable<Integer> {
	//基本金额
	private Integer baseMoney;

	public TaxCalculator(Integer baseMoney) {
		this.baseMoney = baseMoney;
	}

	@Override
	public Integer call() throws Exception {
		TimeUnit.MILLISECONDS.sleep(10000);
		return baseMoney / 10;
	}
}
