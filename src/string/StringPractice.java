package string;

import java.util.Scanner;
import java.util.HashMap;

public class StringPractice {
	public void displayChar(String s) {
		for(int i=0;i<s.length();i++) {
			System.out.print(s.charAt(i)+" ");
		}
	}
	
	public void substr(String s) {
		System.out.println(s.substring(4,4));
	}
	
	public void addString(String s1, String s2) {
//		System.out.println(s1+s2);
		System.out.println(s1.concat(s2));
	}
	
//	indexOf and startsWith
	public void indexAndStartswith(String s) {
		System.out.println(s.indexOf("el"));
		System.out.println(s.startsWith("Bhas"));
	}
	
//	Equals and == 
	
	public void isEqual(String s1,String s2) {
		
		System.out.println("s1.equals(s2) :>"+s1.equals(s2));
		System.out.println("s1==s2 :>" +(s1==s2));
	}
	
	public void takeInput() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a string ");

//		String s=sc.next();
		String s=sc.nextLine();
		for(int i=0;i<s.length();i++) {
			System.out.println(s.charAt(i));
		}
	}
	
	public void allSubstring(String s) {
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<s.length()+1;j++) {
				System.out.print(s.substring(i,j)+" ");
			}
		}
		System.out.println();
		}
	//performance of string is too low as it is creating a new string to modify 
	// and it will return a new index
	
	public void performanceOfString(int n) {
		long start=System.currentTimeMillis();
		String s="";
		for(int i=0;i<n;i++) {
			s=s+i;
		}
		long end=System.currentTimeMillis();
		System.out.println(end-start);
	}
	
//	why StringBuilder?
//	as StringBuilder allow the modification at same memory address
	public void introStringBuilder(int n) {
		System.out.println("String Builder");
		StringBuilder sb=new StringBuilder();
		long start=System.currentTimeMillis();
		for(int i=0;i<n;i++) {
			sb.append(i);
		}
		long end=System.currentTimeMillis();
		System.out.println(end-start);
		
		StringBuilder sb1=new StringBuilder("bhaskar");
		sb1.insert(0, "mr");
		sb1.insert(2, '.');
		System.out.println(sb1);
		sb1.setCharAt(0, 'M');
		System.out.println(sb1);
		sb1.append("k");
		System.out.println(sb1);
		sb1.deleteCharAt(sb1.length()-1);
		System.out.println(sb1);
		System.out.println("sb1 length: "+sb1.length());
		
	}
	
	//question count char 
//	for input aaabbccds --> o/p will be a3b2c2ds
	
	public void countString(String s) {
		int count =0;
		String res="";
		
		for(int i=0;i<s.length();i++) {
			char currentChar=s.charAt(i);
		int j;
		count=1;
			for(j=i+1;j<s.length();j++) {
				if(s.charAt(j)==currentChar) {
					count++;
				}else {
					i=j-1;
					break;
				}
			}
			if(count==1) {
				res+=currentChar;
			}else {
				res+=currentChar;
				res+=count;
			}
		}
		System.out.println(res);
	}
	
	/*
	 * Sample Input: IAmACompetitiveProgrammer
	 * 
	 * Sample Output: I Am A Competitive Programmer
	 */	
	
	public void splitCamelCase(String s) {
		String res;
		for(int i=0;i<s.length();i++) {
			res="";
			res+=s.charAt(i);
			while(i+1<s.length() && Character.isLowerCase(s.charAt(i+1))) {
				res+=s.charAt(i+1);
				i++;
			}
			System.out.print(res+ " ");
		}
	}
	
	
//input: aaabacb  output: a
//	maxm frequency of char
	
	public void maxmFrequency(String s) {
	HashMap<Character, Integer> map=new HashMap<>();
	for(int i=0;i<s.length();i++) {
		if(map.containsKey(s.charAt(i))) {
//			update the value 
			map.put(s.charAt(i), map.get(s.charAt(i))+1);
		}else {
			map.put(s.charAt(i),1);
		}
	}
	System.out.println(map);
	int max=0;
	Character c=null;
	
	for(Character k: map.keySet()) {
		if(map.get(k)>= max) {
			max=map.get(k);
			c=k;
		}
	}
	System.out.println(c);
	
	}

	
	/*
	 * Sample Input: acb ,  Sample Output a2c-1b
	 */
	public void asciiDiff(String s) {
		String res="";
		
		if(s.length()>=1) res+= s.charAt(0);
		int ascii;
		for(int i=1;i<s.length();i++) {
			ascii=s.charAt(i)-s.charAt(i-1);
			res+=ascii;
			res+=s.charAt(i);
		}
		System.out.println(res);
	}
	
	
	// check the string is palindrome or  not 
	
	public boolean isPalindrome(String s) {
		int l=0,r=s.length()-1;
		
		while(l<=r) {
			if(s.charAt(l)!=s.charAt(r)) {
				return false;
			}
			l++;r--;
		}
		
		return true;
	}
	
}
