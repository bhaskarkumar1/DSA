package binarysearch;

public class BinaryQuestion {
	
	//implementation of Binary Search 
	
//	return the index of target
	public int binarySearch(int[] arr, int target) {
		
		int l=0,r=arr.length-1;
		
		while(l<=r) {
			
			int mid= l+(r-l)/2;
			if(arr[mid]==target) return mid;
			else if(arr[mid]>target) {
				r=mid-1;
			}else l=mid+1;
			
		}
		
		
		
		
		return -1;
	}
	
	
	//binarySearch on descending sorted array
	
	public int reverseSortedSearch(int[] arr, int target) {
		
		int start=0,end=arr.length-1;
		while(start<=end) {
//			int mid= (start+end)/2;
			int mid=start+(end-start)/2;
			if(arr[mid]==target) return mid;
			else if(arr[mid]>target) start=mid+1;
			else end=mid-1;
		}
		
		
		
		return -1;
	}
	
	
	public void unknownOrder(int[] arr,int target) {
//		compare the 1st and lst element 
		if(arr[0]>arr[arr.length-1]) {
			System.out.println(reverseSortedSearch(arr, target));
		}else {
			System.out.println(binarySearch(arr,target));
		}
	}
	
	
	//first occurence of the elemnt in array assume array in asc
	public int firstOccurence(int[] arr,int target) {
		int res=-1,start=0,end=arr.length-1;
		
		while(start<=end) {
			int mid=start+(end-start)/2;
			
			if(arr[mid]==target) {
				res=mid;
				end=mid-1;
			}else if(arr[mid]<target) {
				start=mid+1;
			}else end=mid-1;
		
		}
		
		return res;
	}
	
//	last occurence index assume arr in asc
	public int lastOccurence(int[] arr,int target) {
		int res=-1,start=0,end=arr.length-1;
		
		while(start<=end) {
			
			int mid=start+(end-start)/2;
			if(arr[mid]==target) {
				res=mid;
				start=mid+1;
			}else if(arr[mid]>target) end=mid-1;
			else start=mid+1;
		}
		
		return res;
	}
	
//	no. of count of the target in sorted array\
	public int countOfTarget(int[] arr, int target) {
		int start=0,end=arr.length-1;
		//first occuence
		int first=0,last=0;
		while(start<=end) {
			int mid=start+(end-start)/2;
			if(arr[mid]==target) {
				first=mid;
				end=mid-1;
			}else if(arr[mid]>target) end=mid-1;
			else start=mid+1;
			
		}
		
		start=0;end=arr.length-1;
		
		while(start<=end) {
			int mid=start+(end-start)/2;
			if(arr[mid]==target) {
				last=mid;
				start=mid+1;
			}else if(arr[mid]>target) end=mid-1;
			else start=mid+1;
		}
		
		return last-first+1;
	}
	
	// number of times the sorted array is rotated
	
	public int noOftimesRotation(int[] arr) {
		int start=0,end=arr.length-1,N=arr.length;
		
		
		while(start<=end) {
			int mid=start+(end-start)/2;
			int prev=(mid+N-1)%N;
			int next=(mid+1)%N;
			if(arr[start]<=arr[end]) return start;
			if(arr[mid]<=arr[prev] && arr[mid]<=arr[next]) return mid;
			else if(arr[mid]>=arr[end]) {
				start=mid+1;
			}else end=mid-1;
			
			
		}
		
		
		
		return -1;
	}
	
	
}
