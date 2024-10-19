package Heap;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		
		HeapQuestion qs=new HeapQuestion();
		
		
		int[] arr1= {3,2,3,1,2,4,5,5,6};
		System.out.println(qs.kthSmallest(arr1,4)); 
		
		System.out.println(qs.kthLargest(arr1, 4));
		
		int[] arr3= {1, 4, 5, 2, 3, 6, 7, 8, 9, 10};
		System.out.println(Arrays.toString(qs.sortNearlySorted(arr3, 2)));
		
		int[] arr4= {1,1,2,3,4,5};
		qs.pairHeap(arr4, -1);
		
		
		int arr5[] = {20, 8, 22, 4, 12, 10, 14};
		System.out.println(qs.sumkth(arr5, 3, 6));
	}
}
