package problem02;

import java.util.Arrays;

public class BubbleSort1 {
	
	int[] arr;
	public int[] sort(int[] array){
		this.arr = array;
		bubbleSort();
		return arr;
		
	}
	private void bubbleSort(){
		
		int len = arr.length;
		for(int i = 0; i < len; ++i) {
			if(isSorted(arr))
				break;
			for(int j = 0; j < len-1; ++j) {
				if(arr[j]> arr[j+1]){
					swap(j,j+1);
				}
			}
		}
	}
	
	int[] swap(int i, int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		return arr;
		
	}
	
	boolean isSorted(int[] arr) {
		for(int i=1; i<arr.length; i++)
			if(arr[i-1]>arr[i])
				return false;

		return true;
	}
	public static void main(String[] args){
		int[] test = {21,13,1,-22, 51, 5, 18};
		BubbleSort1 bs = new BubbleSort1();
		
		System.out.println(Arrays.toString(bs.sort(test)));
		
	}

}
