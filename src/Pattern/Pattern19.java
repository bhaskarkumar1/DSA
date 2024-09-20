package Pattern;

public class Pattern19 {
	public void pattern(int n) {
		int sp,st;
		int t=n;
		int nst=n/2,nsp=1;
		
		while(t>0) {
			st=1;
			sp=1;
			if(t==n || t==1) {
				while(st<=n) {
					System.out.print("*");
					st++;
				}
			}
			
			else if(t>n/2) {
				
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
				
				
//				System.out.println();
				
				nst--;
				nsp+=2;
			}else {
//				System.out.print(t);
//				System.out.print(nst);
//				break;
				if(t==n/2) {
					
					nst=2;
					nsp=n-4;
					
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
				nst++;
				nsp-=2;
				
			}
			
			
			
			
			
			System.out.println();
			t--;
		}
	}

}
