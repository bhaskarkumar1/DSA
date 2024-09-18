package Pattern;

public class Pattern13 {

	public void  pattern(int n) {
		int st;
		int t=2*n-1;
		int nst=1;
	
		while(t>0) {
			st=1;
			if(t>=n) {
			while(st<=nst) {
				System.out.print("*");
				st++;
			}
			System.out.println();
			nst++;
			}
			else {
				if(t==n-1) {
					nst=n-1;

				}
				
				
				while(st<=nst) {
					System.out.print("*");
					st++;
				}
				nst--;
				System.out.println();	
				
				
				
			}

			t--;
		}
		
		
	}
}
