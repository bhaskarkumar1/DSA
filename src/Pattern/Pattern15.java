package Pattern;

public class Pattern15 {
	public void pattern(int n) {
		
		int sp,st;
		int nst=n;
		int nsp=0;
		
		int t=2*n-1;
		while(t>0) {
			sp=1;
			st=1;
			if(t>=n) {
				while(sp<=nsp) {
					System.out.print(" ");
					sp++;
				}
				
				while(st<=nst) {
					System.out.print("*");
					st++;
				}
				nsp+=2;
				nst--;
			}else {
				/*
				 * System.out.println(t); System.out.println(nst);
				 * 
				 * System.out.println(nsp);
				 */
				if(t==n-1) {
					nsp=2*n-4;
					nst=2;
				}
				
				while(sp<=nsp) {
					System.out.print(" ");
					sp++;
				}
				
				while(st<=nst) {
					System.out.print("*");
					st++;
				}
				nst++;
				nsp-=2;
				
			}
			System.out.println();
			t--;
		}
		
		
	}

}
