package dp;

import java.util.Arrays;

public class Knapsack {

	
	
//	knapsack 0 1
	
	public int recursiveKnapsack(int[] wt, int[] val,int w,int n) {
//		base case
		if(n==0 || w==0) return 0;
		
		if(wt[n-1]<=w) {
//			two choices 
			return Math.max(val[n-1]+recursiveKnapsack(wt,val,w-wt[n-1],n-1),recursiveKnapsack(wt,val,w,n-1));
		}
//		else if(wt[n-1]>w) \
		else{
			return recursiveKnapsack(wt,val,w,n-1);
		}
		
	
	}
	
	public int memoKnapsack(int[] wt,int[] val,int w,int n,int[][] dp) {
		
		if(n==0 || w==0) return 0;
		if(dp[w][n]!=-1) return dp[w][n];
		if(wt[n-1]<=w) {
			return dp[w][n]= Math.max(val[n-1] + memoKnapsack(wt,val,w-wt[n-1],n-1,dp), memoKnapsack(wt,val,w,n-1,dp));
		}
		
		else return dp[w][n]= memoKnapsack(wt,val,w,n-1,dp);
	}
	
	public int topDownKnapsack(int[] wt, int[] val,int w,int n) {
		int[][] dp=new int[n+1][w+1];
		
//		initialize the array
		for(int i=0;i<dp.length;i++) {
			for(int j=0;j<dp[0].length;j++) {
				if(i==0 || j==0) dp[i][j]=0;
			}
		}
//		System.out.println(Arrays.deepToString(dp));
		for(int i=1;i<dp.length;i++) {
			for(int j=1;j<dp[0].length;j++) {
				if(wt[i-1]<=j) {
					dp[i][j]=Math.max(val[i-1]+dp[i-1][j-wt[i-1]], dp[i-1][j]);
					
				}
				else dp[i][j]=dp[i-1][j];
			}
		}
		
		return dp[dp.length-1][dp[0].length-1];
	}


}
