package Pattern;

public class Pattern17 {
	
	public void pattern(int n) {
		int t=n;
		int st,sp;
		int nsp=1,nst=n/2;
		while(t>0) {
			st=1;
			sp=1;
			if(t>n/2) {
				
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
				System.out.println();
				
			}else {
				
				 
				 
				if(t>=n/2) {
//					System.out.println(t);
//					 System.out.println(nst);
//					 System.out.println(nsp);
//					  break;
					nst=1;
					nsp=n-2;
			
				}
				
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
				System.out.println();
				nst++;
				nsp-=2;
				
			}
			
			
			t--;
		}
	}
}