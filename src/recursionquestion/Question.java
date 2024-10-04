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
//	count the digit 7 in  number 
	public int count7(int n) {
		if(n==0) return 0;
		
		if(n%10==7) return 1+count7(n/10);
		return count7(n/10);
	}
// power 
	public int power(int base,int n) {
		if(n==0) return 1;
		return base*power(base,n-1);
	}
//	countX("xxhixx") → 4
	public int countX(String s) {
		if(s.length()==0) return 0;
		if(s.startsWith("x")) return 1+countX(s.substring(1));
	return countX(s.substring(1));
	}
//  countHi("xhixhix") → 2
	public int countHi(String s) {
		if(s.length()<2) return 0;
		if(s.startsWith("hi")) return 1+countHi(s.substring(2));
		
		return countHi(s.substring(1));
		
	}

//	changeXY("xhixhix") → "yhiyhiy"
	public String changeXY(String s) {
		if(s.length()==0) return "";
		if(s.startsWith("x")) return "y" +changeXY(s.substring(1));
		return s.substring(0,1)+ changeXY(s.substring(1));
	}
	
//	changePi("pipi") → "3.143.14"
	public String changePi(String str) {
		if(str.length()==0) return "";
		if(str.length()>=2 && str.startsWith("pi")) return "3.14"+changePi(str.substring(2));
		return str.substring(0,1)+str.substring(1);
	}
	
}
