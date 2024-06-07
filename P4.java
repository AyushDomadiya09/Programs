import java.util.*;

public class P4 {

	public static void indexValue(String a, int b) {
		System.out.println(a.charAt(b-1));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter n for nth digit sequence : ");
		int n = sc.nextInt();
		System.out.print("Enter n-index for nth digit sequence : ");
		int inx = sc.nextInt();

		int arr[] = new int[n];

		for(int i=1;i<=n;i++)
		{
			System.out.print(i + " ");
		}
		System.out.println();

		String str = "";
		for(int i=1; i<=arr.length; i++) {
			str+=i;
		}

		indexValue(str, inx);
	}
}