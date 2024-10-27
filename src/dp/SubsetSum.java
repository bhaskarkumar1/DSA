package dp;

import java.util.ArrayList;

public class SubsetSum {
	
//	first print the all subset of an array using bruteforce 
	
	public boolean allSubset(int[] arr,int n,int sum) {
		if(sum==0) return true;
		if(n==0) return false;
		
		if(arr[n-1]>sum) {
			return allSubset(arr,n-1,sum);
		}
		
		return allSubset(arr,n-1,sum) || allSubset(arr,n-1,sum-arr[n-1]);
	}
	
	
	

}
