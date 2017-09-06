package gc;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yzy yezhangyuan on 2017/8/31 0031.
 */
public class GCOne {

	public static class GOJO{}

	public static void main(String[] args){
		List<GOJO> gojoList = new ArrayList<>();

		while (true){
			gojoList.add(new GOJO());
		}

	}
}
