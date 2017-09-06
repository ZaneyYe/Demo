package suanfa;

import java.util.*;

/**
 * Created by yzy on 2017/08/04 下午 3:02.
 * email: mia5121@163.com
 * Input: ["Hello", "Alaska", "Dad", "Peace"]
 * Output: ["Alaska", "Dad"]
 */
public class Solution {
	private static final String line1 = "qwertyuiop";
	private static final String line2 = "asdfghjkl";
	private static final String line3 = "zxcvbnm";

	public static String[] findWords(String[] words) {
		List<String> resList = new ArrayList();
		for(String word : words){
			char[] ws = word.toCharArray();
			boolean b1 = true;
			boolean b2 = true;
			boolean b3 = true;
			for(int i = 0;i < ws.length;i++){
//				char temp = ws[i];
				String temp = String.valueOf(ws[i]).toLowerCase();
				if(line1.indexOf(temp) == -1){
					b1 = false;
				}
				if(line2.indexOf(temp) == -1){
					b2 = false;
				}
				if(line3.indexOf(temp) == -1){
					b3 = false;
				}
			}
			if(b1||b2||b3){
				resList.add(word);
			}
		}
		String[] strs = new String[resList.size()];
		return resList.toArray(new String[strs.length]);
	}

	public static String[] findWords2(String[] words){
		List<String> resList = new ArrayList();
		String[] lines = new String[]{line1,line2,line3};
		Map<Character,Integer> map = new HashMap<>();
		for(int i = 0;i < lines.length;i++){
			for(char c : lines[i].toCharArray()){
				map.put(c,i);
			}
		}
		for(String word : words){
			int index = map.get(word.toLowerCase().charAt(0));
			for(char c : word.toLowerCase().toCharArray()){
				if(map.get(c) != index){
					index = -1;
				}
			}
			if(index != -1){
				resList.add(word);
			}
		}
		return  resList.toArray(new String[0]);
	}

	public static void main(String[] args){
		String[] words = new String[]{"Hello","Alaska", "Dad", "Peace"};
//		System.out.println(findWords(words));
		String[] res = findWords2(words);
		System.out.println(res.length);
		System.out.println(Arrays.asList(res));
	}

}
