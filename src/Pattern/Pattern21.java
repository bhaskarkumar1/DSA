package Pattern;

public class Pattern21 {
	public void pattern(int n) {
		int st,sp;
		int t=n;
		int nst=1,nsp=2*n-3;
		while(t>0) {
			st=1;
			sp=1;
			if(t>1) {
				while(st<=nst) {
					System.out.print("*");
					st++;
				}
				st=1;
				while(sp<=nsp) {
					System.out.print(" ");
					sp++;
				}
				while(st<=nst) {
					System.out.print("*");
					st++;
				}
				nsp-=2;
				nst++;
			}else {
				while(st<=2*n-1) {
					System.out.print("*");
					st++;
				}
			}
			
			System.out.println();
			
			t--;
		}
		
	}

}