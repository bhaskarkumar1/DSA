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
		
		if(arr[start]<=arr[end]) return start;
		while(start<=end) {
			int mid=start+(end-start)/2;
			int prev=(mid+N-1)%N;
			int next=(mid+1)%N;
			
			if(arr[mid]<=arr[prev] && arr[mid]<=arr[next]) return arr.length-mid;
			else if(arr[mid]>=arr[end]) {
				start=mid+1;
			}else end=mid-1;
			
			
		}
		
		
		
		return -1;
	}
//	find the element in nearlrgffd sorted array
	
	public int nearlySortedSearch(int[]arr,int target) {
		int l=0,r=arr.length-1;
		
		while(l<=r) {
			int mid=l+(r-l)/2;
			
			if(mid>l && arr[mid-1]==target) return mid-1; 
			if(mid<r && arr[mid+1]==target) return mid+1;
			if(arr[mid]==target) return mid;
			else if(arr[mid]>target) r=mid-2;
			else l=mid+2;
			
			
		}
		
		
		
		return -1;
	}
	public int indexInInfinteArray(int[] arr,int target) {
		int l=0,r=1;
		
//		set the bound for l and r
		while(arr[r]<target) {
			l=r;
			r=2*r;
		}
//		now i have the bound
		while(l<=r) {
			int mid=l+(r-l)/2;
			if(arr[mid]==target) return mid;
			else if(arr[mid]>target) r=mid-1;
			else l=mid+1;
		}
		
		return -1;
	}
	
	
	
	public int indexOf1InInfinteSorted(int[] arr) {
//		set the bound
		int l=0,r=arr.length-1;
		
		while(arr[r]!=1) {
			l=r;
			r=2*r;
		}
		
		
		//find the first occurence 
		int res=-1;
		while(l<=r) {
			
			int mid=l+(r-l)/2;
			
			if(arr[mid]==1) {
				res=mid;
				r=mid-1;
			}else if(arr[mid]<1) l=mid+1;
			else r=mid-1;
			
		}
		
		return res;
		
		
	}
	
	
	//find the minimum diffrence element in the sorted array
	
	public int minDiff(int[] arr, int target) {
		int l=0,r=arr.length-1;
		
		while(l<=r) {
			int mid=l+(r-l)/2;
			if(arr[mid]==target) return mid;
			else if(arr[mid]<target) l=mid+1;
			else r=mid-1;
			
			
		}
		return Math.min(Math.abs(target-arr[l]), Math.abs(target-arr[r]));
	}
}
