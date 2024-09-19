package Pattern;

public class Pattern18 {
	public void pattern(int n) {
		int t=n;
		int sp,st;
		int nst=1;
		int nsp=n/2;
		
		while(t>0) {
			 st=1;
			 sp=1;
			
			if(t>n/2) {
				while(sp<=nsp) {
					System.out.print(" ");
					sp++;
				}
				while(st<=nst) {
					System.out.print("*");
					st++;
				}
				nst+=2;
				nsp--;
				
			}else {
				if(t==n/2) {
					nst=n-2;
					nsp=1;
				}
				/*
				 * System.out.println(t); System.out.println(nst); System.out.println(nsp);
				 * break;
				 */
				while(sp<=nsp) {
					System.out.print(" ");
					sp++;
				}
				
				while(st<=nst) {
					System.out.print("*");
					st++;
				}
				
				nst-=2;
				nsp++;
			}
			
			
			
			
			System.out.println();
			t--;
		}
		
		
	}

}
