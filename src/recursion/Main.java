package recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
//		System.out.print("hello");
		stackBuilding sb=new stackBuilding();
//		sb.building(5);
//		sb.falling(5);
//		sb.both(5);
//		sb.pdiSkip(5);
		
		System.out.println("Questons !");
		Questions qs= new Questions();
		System.out.println(qs.fact(5));
		System.out.println(qs.power(5, 3));
		System.out.println(qs.fib(31));
		int[] arr= {1,2,3,4,5,90,1};
		System.out.println(qs.isArraySorted(arr, 0));
		int[] array= {0,1,25,8,1,3,2,4,5,2,8,989,8};
		  
		System.out.println(qs.firstIndex(array, 0, 7));
		System.out.print(qs.lastIndex(array, array.length-1, 1));
		int[] arr1 = {1,4,8,6,7,52,8,7,1,2,8,0,8};
		System.out.println(Arrays.toString(qs.allIndices(arr1, 0, 8, 0)));
		ArrayList<Integer> ls=new ArrayList<>();
		
		System.out.println(qs.allIndiceinList(arr1, 0, 8, ls));
	}
}
