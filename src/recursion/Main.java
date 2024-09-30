package recursion;

public class Main {
	public static void main(String[] args) {
//		System.out.print("hello");
		stackBuilding sb=new stackBuilding();
//		sb.building(5);
//		sb.falling(5);
//		sb.both(5);
//		sb.pdiSkip(5);
		
		System.out.println("Questons !");
		Questions qs= new Questions();
		System.out.println(qs.fact(5));
		System.out.println(qs.power(5, 3));
		System.out.println(qs.fib(31));
		int[] arr= {1,2,3,4,5,90,1};
		System.out.println(qs.isArraySorted(arr, 0));
		
	}
}
