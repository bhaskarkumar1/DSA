package Pattern;

public class Pattern22 {
	public void pattern(int n) {
		int st,sp;
		int t=n;
		int nst=n-1,nsp=1;
		while(t>0) {
			st=1;sp=1;
			if(t==n) {
				while(st<=2*n-1) {
					System.out.print("*");
					st++;
				}
			}else {
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
				
				nst--;
				nsp+=2;
				
				
			}
			
			System.out.println();
			t--;
		}
	}
}
