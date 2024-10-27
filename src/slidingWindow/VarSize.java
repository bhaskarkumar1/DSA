package slidingWindow;

public class VarSize {
//	longestSubArrayWithSumK with 0<=arr[i]<10 power 6
	
	public int longestSubArrayWithSumK(int[]arr, int k){
		int maxSize=0;
		
		int start=0;
		int currentSum=0;
		
		for(int end=0;end<arr.length;end++) {
			currentSum+=arr[end];
			
			while(currentSum>k && end>=start) {
				currentSum-=arr[start];
				
				start++;
			}
			
			
			if(currentSum==k) {
				maxSize=Math.max(maxSize,end-start+1);
			}
			
			
			
		}
		
		
		
		return maxSize;
	}
	
	
}
