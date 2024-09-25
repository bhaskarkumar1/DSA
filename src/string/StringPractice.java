package string;

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
	
}
