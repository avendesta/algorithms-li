package sortroutines;

import java.util.Arrays;

import runtime.Sorter;

public class BubbleSort2 extends Sorter {
	
	int[] arr;
	public int[] sort(int[] array){
		this.arr = array;
		bubbleSort();
		return arr;
		
	}
	private void bubbleSort(){
		
		int len = arr.length;
		for(int i = 0; i < len; ++i) {
			for(int j = 0; j < len-1-i; ++j) {
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
	public static void main(String[] args){
		int[] test = {21,13,1,-22, 51, 5, 18};
		BubbleSort bs = new BubbleSort();
		
		System.out.println(Arrays.toString(bs.sort(test)));
		
	}

}
