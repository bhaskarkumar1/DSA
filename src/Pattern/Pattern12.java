package Pattern;

public class Pattern12 {
	public void pattern(int n) {
		int st,sp;
		int nst=1,nsp=n-1;
		
		while(n>0) {
			 sp=1;
			 st=1;
			while(sp<=nsp) {
				System.out.print(" ");
				sp++;
			}
			
			while(st<=nst) {
				if (st%2==0)System.out.print("!");
				else System.out.print("*");
				st++;
			}
			
			System.out.println();
			nst+=2;
			nsp--;
			
			n--;
		}
		
		
	}

}
