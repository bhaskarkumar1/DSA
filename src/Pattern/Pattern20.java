package Pattern;

public class Pattern20 {
	public void pattern(int n) {
		int t=n;
		int st,sp;
		int nst=1,nsp=n/2;
		while(t>0) {
			st=1;
			sp=1;
			
			if(t>n/2) {
				while(sp<=nsp) {
					System.out.print(" ");
					sp++;
				}
				while(st<=nst) {
					if(st==1 || st==nst)System.out.print("*");
					else System.out.print(" ");
					st++;
				}
				nsp--;
				nst+=2;
				
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
					
					if(st==1 || st==nst)System.out.print("*");
					else System.out.print(" ");
					st++;
				}
				
				nsp++;
				nst-=2;
				
				
				
			}
			
			
			System.out.println();
			t--;
		}
		
	}
}
