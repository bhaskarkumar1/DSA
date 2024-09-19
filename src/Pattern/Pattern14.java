package Pattern;

public class Pattern14 {
	public void pattern(int n){
		int t=2*n-1;
		int sp,st;
		int nst=1, nsp=n-1;
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
			nsp--;
			nst++;
			}
			else {
//				System.out.println(t);
//				System.out.println(nst);
//				System.out.println(nsp);

				if(t==n-1) {
					nst-=2;
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
				nst--;
				nsp++;
			}
			System.out.println();
			
			t--;
		}
		
	}
}
