package string;

import java.util.Scanner;

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
	
}
