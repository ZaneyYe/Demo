package suanfa;

/**
 * Created by yzy on 2017/07/31 上午 8:53.
 * email: mia5121@163.com
 */
public class Main {

	public static void main(String[] args){
		int[] arr = new int[]{50,2,8,90,4,989};
		getSort(arr);
		for(int i = 0;i < arr.length;i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println("");
//		System.out.println(String.valueOf(489).toCharArray()[0]);

	}

	private static void getSort(int[] arr) {
		for(int i = 0;i < arr.length - 1;i++){
			for(int j = 0;j < arr.length - 1 - i;j++){
				int tempJ = 0;
				if(arr[j] >= 10){
//					tempJ = arr[j] / 10;
					tempJ = (int)String.valueOf(arr[j]).toCharArray()[0];
				}else {
					tempJ = arr[j];
				}
				int tempK = 0;
				if(arr[j+1] >= 10){
//					tempK = arr[j+1] / 10;
					tempK = (int)String.valueOf(arr[j+1]).toCharArray()[0];
				}else{
					tempK = arr[j+1];
				}
				if(tempK > tempJ){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}

}
