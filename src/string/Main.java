package string;

public class Main {
	public static void main(String[] str) {
		StringPractice sp=new StringPractice();
		
		sp.displayChar("Bhaskar Kumar");
		System.out.println();
		sp.substr("Hello Bhaskar");
		sp.addString("Bhaskar", "kumar");
		sp.indexAndStartswith("Bhaskar Hello!");
		sp.isEqual("bhaskar", "ramesh");
//		sp.takeInput();
		sp.allSubstring("abcd");
		/*
		 * sp.performanceOfString(100000); sp.introStringBuilder(100000);
		 */
		System.out.println("coding block ques start");
		sp.countString("aaabbcd");
		sp.splitCamelCase("IAmACompetitiveProgrammer");
		System.out.println();
		sp.maxmFrequency("abaaaaaaaaaaaaaabsssssssdsssss");
		sp.asciiDiff("acb");
		
		
		if(sp.isPalindrome("abab")) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}
	}

}
