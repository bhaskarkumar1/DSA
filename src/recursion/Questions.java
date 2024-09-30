package recursion;

public class Questions {
	public int fact(int n) {
		if(n==1) return 1;
		int f=fact(n-1);
		return n*f;
	}
// x power n
	
	public int power(int x,int n) {
			if(n==0) return 1;
			return x*power(x,n-1);
	}
	// nth fibonacci number
	
	public int fib(int n) {
		if(n==0 || n==1) return n;
		return fib(n-1)+fib(n-2);
	}
	
	public boolean isArraySorted(int[] arr, int i) {
		if(i==arr.length-1) {
			return true;
		}
		if(i+1 <arr.length && arr[i]>arr[i+1]) {
			return false;
		}
		
		return isArraySorted(arr,i+1);
	}
	
//	find the first index in an array
	public int firstIndex(int[] arr, int i,int data) {
		if(i==arr.length) {
			return -1;
		}if(arr[i]==data) {
			return i;
		}
		return firstIndex(arr,i+1,data);
	}
	
//	find the last index 
	
	public int lastIndex(int[] arr,int i,int data) {
		if(i==-1) return -1;
		if(arr[i]==data) return i;
		return lastIndex(arr,i-1,data);
	}
	
}
