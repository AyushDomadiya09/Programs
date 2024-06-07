import java.util.*;

public class  P1{

	public static int firstOccurrence(String a, String b) {
		return a.indexOf(b);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter haystack value : ");
		String haystack = sc.next();

		System.out.print("Enter needle value : ");
		String needle = sc.next();

		System.out.println(firstOccurrence(haystack, needle));
	}
}