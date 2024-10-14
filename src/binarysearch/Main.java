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
	
	int[] arr4= {18,22,25,27,2,3,4,5};
	System.out.println("hihihi"+bq.noOftimesRotation(arr4));
	
	 int[] arr5 = { 3, 2, 10, 4, 40 };
	 System.out.println(bq.nearlySortedSearch(arr5, 40));
	 
	 int arr6[] = new int[]{3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
	 System.out.println(bq.indexInInfinteArray(arr6,9));
	 
     int[] arr7 = {0, 0, 0, 0, 0,  1, 1, 1, 1, 1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
     System.out.println(bq.indexOf1InInfinteSorted(arr7));

	
	int[] arr8= {1,3,8,10,15};
	System.out.println("minDiff"+bq.minDiff(arr8, 14));
	
}	}

