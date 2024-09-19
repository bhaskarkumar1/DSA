package Pattern;

public class Pattern19 {
	public void pattern(int n) {
		int sp,st;
		int t=n;
		int nst=n/2,nsp=0;
		
		while(t>0) {
			st=1;
			sp=1;
			
			if(t>t/2) {
				
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
