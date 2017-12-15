/**
 * Created by yzy yezhangyuan on 2017/9/4 0004.
 */
public class Test {

	public static void main(String[] args){
		String card = "621947893489890";
		String head = card.substring(0, 4);
		String tail = card.substring(card.length() - 3, card.length());
		System.out.println("head:"+ head + ",tail:" + tail);
		int hiddenLen = card.length() - 7;
		String hidden =card.replaceAll("(\\d{4})\\d{"+hiddenLen+"}(\\d{3})","$1****$2");
		System.out.println(hidden);
	}

	public static String changStr(String card){
		String hiddenCd = "";
		String head = card.substring(0, 3);

		return hiddenCd;
	}
}
