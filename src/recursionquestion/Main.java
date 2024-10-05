package recursionquestion;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Question qs=new Question();
//		qs.allSubstring("abc");
		int[] arr= {1,2,5,4,6,7,11,11,5,6,7,8,9,11,2,20};
		
		System.out.println(qs.fact(5));
		System.out.println(qs.fib(32));
		System.out.println(qs.sumOfDigit(1234));
		System.out.println(qs.count7(71767676));
		System.out.println(qs.power(2,5));
		System.out.println(qs.countX("xxhxixx"));
		System.out.println(qs.countHi("xhixhixhi"));
		System.out.println(qs.changeXY("xhixhix"));
		System.out.println(qs.changePi("pibhaskarpi21"));
		System.out.println(qs.noX("xaxbxasdx"));
		System.out.println(qs.array6(arr, 0));
		System.out.println(qs.array11(arr, 0));
		System.out.println(qs.array220(arr, 0));
		System.out.println(qs.allStar("hello"));
		System.out.println(qs.endX("hihixxx"));
		System.out.println(qs.countPairs("axaxqqq"));
		System.out.println(qs.pairs("aaaaa"));
	}

}
