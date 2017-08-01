package effect;

/**
 * Created by yzy on 2017/07/24 下午 3:51.
 * email: mia5121@163.com
 */
public class ChineseSet {

	private static final String[] cns = new String[]{"","壹","贰","叁","肆","伍","陆","柒","捌","玖","拾"};

	public static String toCns(int num){
		return cns[num];
	}

	public static void main(String[] args){
		System.out.println(cns[8]+cns[3]);
	}

}
