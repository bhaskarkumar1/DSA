package ArrayPractice;

import java.util.Scanner;

public class ArrayOperation {
	Scanner sc =new Scanner(System.in);
	
	public int[] takeinput() {
		
		System.out.println("Enter the size of the array");
		int size=sc.nextInt();
		int[] arr=new int[size];
		
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
	sc.close();	
	return arr;
	}
	
	
	
	public void display(int[] arr) {
		for(int val: arr) {
			System.out.print(val+" ");
		}
	}
	//max
	public void max(int[] arr) {
		int max=Integer.MIN_VALUE;
		int index=0;
		for(int i=0;i<arr.length;i++) {
			if(max<=arr[i]) {
				max=arr[i];
				index=i;
				
			}
		}
		
		System.out.println();
		System.out.printf("max is: "+max+"index is : "+index);
	}
	
// Linear search 
	
	public int linearSearch(int[] arr,int target) {
		int found=-1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				found=i;
			}
		}
		return found;
	}
	
	
	//binary search 
	
	public int binarySearch(int[] arr,int target) {
		int lo,hi,mid;
		lo=0;hi=arr.length-1;
		while(lo<=hi) {
			mid=(lo+hi)/2;
			if(arr[mid]==target) {
//				index=mid;
				return mid;
			}else if(arr[mid]<target) {
				lo=mid+1;
			}else {
				hi=mid-1;
			}
			
			
			
		}
		
		return -1;
		
	}
	
	//bubble sort 
	
	public int[] bubbleSort(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			
			
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					//swap
					int t=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=t;
				}
			}
		}
		
		return arr;

	}
	
	// selection sort in every pass check find the minm and swap  
	
	public int[] selectionSort(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			int min_index=i;
			for(int j=i;j<arr.length;j++) {
				if(arr[min_index]>arr[j]) min_index=j;
			}
			//swap
			int t=arr[min_index];
			arr[min_index]=arr[i];
			arr[i]=t;
			
			
		}
		
		
		return arr;
	}
	
	
	// find lower bound 
	
	public int lowerBound(int[] arr,int data) {
		int ans=-1;
		
		int lo=0,hi=arr.length-1;
		int mid;
		
		while(lo<=hi) {
			mid=(lo+hi)/2;
			
			if(arr[mid]==data) {
				hi=mid-1;
				ans=mid;
			}else if(arr[mid]>data) {
				hi=mid-1;
			}else {
				lo=mid+1;
			}
			
		}
		
		return ans;
	}
	
	
	// upper bound 
	
	public int upperBound(int[] arr, int data) {
		int ans=-1;
		
		int lo=0,hi=arr.length-1;
		int mid;
		
		while(lo<=hi) {
			mid=(lo+hi)/2;
			
			if(arr[mid]==data) {
				lo=mid+1;
				ans=mid;
			}else if(arr[mid]<data) {
				lo=mid+1;
			}
			else {
				hi=mid-1;
				
			}
			
			
		}
		
		return ans;
	}
	
	
	
	
	
	
	
	
}
