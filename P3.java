import java.util.*;

public class P3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Number : ");
		long n = sc.nextLong();

		long fact = 1;
		int count = 0;
		for(int i=1; i<=n; i++) {
			fact*=i;
		}

		System.out.println("Factorial of "+n+" is : "+fact);

		for(long j=fact; j>=0; j--) {
			long rem=fact%10;
			if(rem==0) {
				count+=1;
			} else {
				break;
			}
			fact=fact/10;
		}

		System.out.println(count);
	}
}