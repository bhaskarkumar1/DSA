package stack_practice;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackQuestions qs=new StackQuestions();
		//next Greater Element
		int[] arr= {1,3,2,4};
		int[] res=qs.nextGreaterElement(arr);
		System.out.println(Arrays.toString(res));
		
		int[] arr1= {1,3,2,4};
		int[] res2=qs.nextGreaterLeft(arr1);
		System.out.println(Arrays.toString(res2));
		
		int[] arr3= {4,5,2,10,8};
		int[] res3=qs.nearestSmallerLeft(arr3);
		System.out.println(Arrays.toString(res3));
		
		
		int[] res4=qs.nearestSmallerRight(arr3);
		System.out.println(Arrays.toString(res4));
		
		int[] stock= {100,80,60,70,60,75,85};
		System.out.println(Arrays.toString(qs.stockSpan(stock)));
		
		int[] hist = {60, 20, 50, 40, 10, 50, 60};
		System.out.println(qs.maxHistArea(hist));
		
	
	}
}