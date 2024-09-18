package Pattern;

public class Pattern11 {
	public void pattern(int n) {
		int st,sp;
		int nsp=n-1, nst=1;
		while(n>0) {
			sp=1;
			st=1;
			while(sp<=nsp) {
				System.out.print(" ");
				sp++;
			}
			while(st<=nst) {
				if(st%2==0) System.out.print(" ");
				else System.out.print("*");
				st++;
			}
			nst+=2;
			nsp--;
			System.out.println();
			
			n--;
		}
	}
}
