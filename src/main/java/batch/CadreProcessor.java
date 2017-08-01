package batch;

import org.springframework.batch.item.ItemProcessor;
import po.Cadre;

/**
 * Created by yzy on 2017/07/03 下午 3:08.
 * email: mia5121@163.com
 */
public class CadreProcessor implements ItemProcessor<Cadre,Cadre> {

	@Override
	public Cadre process(Cadre cadre) throws Exception {
		System.out.println(cadre.toString());
		return cadre;
	}


}
