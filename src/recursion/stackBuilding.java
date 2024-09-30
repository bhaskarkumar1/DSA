package recursion;

public class stackBuilding {
	
	public void building(int n) {
		if(n==0) {
			return;
		}
		System.out.println(n);
		building(n-1);
		
	}
	
	
//	while stack is falling
//	for inp : 5 its o/p;> 1 2 3 4 5
	public void falling(int n) {
		if(n==0) return;
		falling(n-1);
		System.out.println(n);
	}

	
//	for inp : 5,  o/p: > 5 4 3 2 1 1 2 3 4 5 
	
	public void both(int n) {
		if(n==0) return;
		System.out.println(n);
		both(n-1);
		System.out.println(n);
	}
	
//	for inp: 5 o/p:> 5 3 1 2 4 
	public void pdiSkip(int n) {
		if(n<=0) return;
		System.out.println(n);
		pdiSkip(n-2);
		if(n-1!=0) System.out.println(n-1);
		
	}
	
}
