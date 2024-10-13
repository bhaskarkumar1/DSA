package binarysearch;

public class Main {
	public static void main(String[] args) {

	BinaryQuestion bq=new BinaryQuestion();
		
	int[] arr1= {1,2,3,4,5,6,7,8,9};
	System.out.println(bq.binarySearch(arr1,7));
	
	
	int[] arr2= {17,16,15,14,13,12,10,9,5,4,2,1,0};
	System.out.println(bq.reverseSortedSearch(arr2, 50));
	
	bq.unknownOrder(arr2, 0);
	
	
	int[] arr3= {2,3,5,6,10,10,10,10,10,25,78,99,901};
	System.out.println(bq.firstOccurence(arr3,10));
	
	
	System.out.println(bq.lastOccurence(arr3, 10));
	
	
	System.out.println(bq.countOfTarget(arr3, 10));
	
	int[] arr4= {18,22,25,27,2,3,5,7};
	System.out.println(bq.noOftimesRotation(arr4));
	
//	int[] arr5= {4,5,6,7,0,1,2};

	
	}
}
