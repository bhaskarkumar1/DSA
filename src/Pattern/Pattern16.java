package Pattern;

public class Pattern16 {
		
	public void pattern(int n){
		int t=2*n-1;
		int nsp=n-1, nst=n;
		int st,sp;
		while(t>0) {
			st=1;
			sp=1;
			if(t>=n) {
			while(sp<=nsp) {
				System.out.print(" ");
				sp++;
			}
			
			while(st<=nst) {
				System.out.print("*");
				st++;
			}
			nst--;
			nsp--;
			}else {
	
				/*
				 * System.out.println(t); System.out.println(nst);
				 * 
				 * System.out.println(nsp); break;
				 */
				if(t==n-1) {
					nst=2;
					nsp=1;
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
				nsp++;
				
			}
			System.out.println();

			
			
			t--;
		}
		
	}

}
