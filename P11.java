import java.util.*;

public class P11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Dividend : ");
		long dividend = sc.nextLong();

		System.out.print("Enter Divisor : ");
		long divisor = sc.nextLong();

		long a = Math.abs(dividend);
		long b = Math.abs(divisor);

		long count = 0;
		while(a>=1) {
			a-=b;
			count++;
			
		}

		if(dividend<0 && divisor<0) {
			System.out.println(count-1);
		}
		else if(dividend>0 && divisor>0) {
			System.out.println(count-1);
		}
		else{
			System.out.println(0-(count-1));
		}
		
	}
}