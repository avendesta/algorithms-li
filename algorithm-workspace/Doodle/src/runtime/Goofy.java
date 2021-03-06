package runtime;
import java.util.Arrays;

public class Goofy {
	public static void sort(int[] arr) {
		for( int i= 0; i<arr.length; i++) {
			int r = (int)(Math.random()*arr.length);
			int temp = arr[r];
			arr[r] = arr[i];
			arr[i] = temp;
		}
	}
	public static void main(String[] args) {
		int[] arr = {2,4,6,2,4,24,6,8};
//		arr = new int[]{2,4,5,6};
		int len = arr.length;
		System.out.println(Arrays.toString(arr));
		int[] unsorted = arr.clone();
		Arrays.sort(arr);
		int[] sorted = arr;
		int count = 0;
		while(!Arrays.equals(sorted, unsorted)) {
			sort(unsorted);
			System.out.println(Arrays.toString(unsorted));
			count++;
		}
		System.out.println(count);
		
	}
}
