package recursionquestion;

public class Question {
//	print all the continuous substring of a string
	
//	the brute force - 1st loop
	
	public void allSubstring(String s) {
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<=s.length();j++) {

			System.out.println(s.substring(i,j));
			}
		}
	}
	
	public int fact(int n) {
		if(n==0) return 1;
		
		int f=fact(n-1);
		
		return n*f;
	}

	
	public int fib(int n) {
		if(n==0 || n==1) return n;
		int f=fib(n-1);
		int l=fib(n-2);
	
		return f+l;
	}
	
	
	public int sumOfDigit(int n) {
		if(n==0) return 0;
		
		return n%10+sumOfDigit(n/10);
	}
	
}
