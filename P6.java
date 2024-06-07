import java.util.Scanner;
public class P6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter num 1 : ");
		int a = sc.nextInt();
		System.out.print("Enter num 2 : ");
		int b = sc.nextInt();

		int zor = a^b;
		int count = 0;

		while (zor != 0){
			count++;
			zor = zor & (zor-1);
		}

		System.out.print(count);
				
	}
}