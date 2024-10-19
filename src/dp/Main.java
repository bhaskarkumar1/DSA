package dp;

public class Main {
	public static void main(String[] args) {
		Knapsack kp=new Knapsack();
		
		 int profit[] = { 60, 100, 120 };
	     int weight[] = { 10, 20, 30 };
	     int W = 50;
	     int n = profit.length;
	     
	     System.out.println(kp.recursiveKnapsack(weight,profit, W, n));
		
	     
	     int[][] dp=new int[W+1][n+1];
	     for(int i=0;i<dp.length;i++) {
	    	 for(int j=0;j<dp[0].length;j++) {
	    		 dp[i][j]=-1;
	    	 }
	     }
	     
		System.out.println(kp.memoKnapsack(weight,profit, W, n,dp));
		
		System.out.println(kp.topDownKnapsack(weight,profit,W,n));
	}
	
}
