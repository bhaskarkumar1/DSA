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
		sp.performanceOfString(100000);
		sp.introStringBuilder(100000);
	}

}
