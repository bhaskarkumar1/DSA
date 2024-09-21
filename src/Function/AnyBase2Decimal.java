package Function;

public class AnyBase2Decimal {
	public int toDecimal(int sn, int sb) {
		int res=0,rem=0,c=0;
		
		while(sn!=0) {
			
			rem=sn%10;
			res+=rem*Math.pow(sb, c++);
			
			
			sn/=10;
		}
		
		return res;
	}
	
	

}
