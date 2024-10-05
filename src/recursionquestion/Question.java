package recursionquestion;

public class Question {
//	print all the continuous substring of a string
	
//	the brute force - 1st loop
	
	private static final String String = null;

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
//	noX("xaxb") → "ab"
	
	public String noX(String str) {
		if(str.length()==0) return "";
		
		if(str.startsWith("x")) return ""+noX(str.substring(1));
		else return str.substring(0,1)+noX(str.substring(1));
	}
//	array6([1, 6, 4], 0) → true
public boolean array6(int[] nums,int index) {
	if(index==nums.length) return false;
	if(nums[index]==6) return true;
	return array6(nums,index+1);
}

//array11([1, 2, 11], 0) → 1
public int array11(int[] nums,int index) {
	if(index==nums.length) return 0;
	if(nums[index]== 11) return 1+array11(nums,index+1);
	return array11(nums,index+1);
}

//Given an array of ints, compute recursively if the array contains somewhere a value followed in the array by that value times 10. We'll use the convention of considering only the part of the array that begins at the given index.
public boolean array220(int[] nums,int index) {
	if(index==nums.length) return false;
	if(index+1<nums.length && nums[index]*10==nums[index+1]) return true;
	
	return array220(nums,index+1);
}
//allStar("hello") → "h*e*l*l*o"


public String allStar(String str) {
	if(str.length()==0) return "";
	if(str.length()==1) return str;
	
	return str.substring(0,1)+"*"+allStar(str.substring(1));
	
}
//endX("xhixhix") → "hihixxx"
public String endX(String str) {
return withNoX(str) + withX(str);
}

public String withNoX(String str) {
if(str.length()==0) return "";
if(str.substring(0,1).equals("x")) {
	return withNoX(str.substring(1));
}
return str.substring(0,1)+withNoX(str.substring(1));
}

public String withX(String str) {
	if(str.length()==0) return "";
	if(str.substring(0,1).equals("x")) {
		return "x"+withX(str.substring(1));
	}
	return withX(str.substring(1));
}

//We'll say that a "pair" in a string is two instances of a char separated by a char. So "AxA" the A's make a pair. Pair's can overlap, so "AxAxA" contains 3 pairs -- 2 for A and 1 for x.
public int countPairs(String str) {
	if(str.length()<3) return 0;
	
	if(str.charAt(0) == str.charAt(2)) return 1+countPairs(str.substring(1));
	
	return countPairs(str.substring(1));
}
//pairStar("xxyy") → "x*xy*y"

public String pairs(String str) {
	if(str.length()==1) return str;
	if(str.charAt(0)==str.charAt(1)) return str.charAt(0)+"*"+pairs(str.substring(1));
	return str.charAt(0)+pairs(str.substring(1));
}



}