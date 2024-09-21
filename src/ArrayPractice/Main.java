package ArrayPractice;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
//		System.out.println("Hello");
		
		ArrayOperation a=new ArrayOperation();
//		int[] array=a.takeinput();
//		a.display(array);
//		a.max(array);
//		int match=a.linearSearch(array, 5);
		/*
		 * if (match!=-1) { System.out.println("target match found at index"+match);
		 * }else { System.out.println("no match found !"); }
		 */
		//binarysearch
		int[] result= {2,1,43,2,7,68,5,34,90,23,-1};
//		Arrays.sort(result);
		a.display(result);
		int res=a.binarySearch(result,90);
		
		if(res!=-1)System.out.print("match found at index"+res);
		else System.out.print("No match found");
		System.out.println("Bubble sort implementation>>>");
		
		int[] sorted=a.bubbleSort(result);
		System.out.println(Arrays.toString(sorted));
		System.out.println("selsection sort");
		
		int[] res1=a.selectionSort(result);
		a.display(res1);
	
	
	}
	
	
}
