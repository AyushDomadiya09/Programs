import java.util.*;

public class P5 {

	static double binaryToDecimal(String binary, int len) 
    { 
        
        int point = binary.indexOf('.'); 

        if (point == -1) 
            point = len; 

        double intDecimal = 0, 
            fracDecimal = 0, 
            twos = 1; 

        for(int i = point - 1; i >= 0; i--) 
        { 
            intDecimal += (binary.charAt(i) - '0') * twos; 
            twos *= 2;
        } 

        twos = 2; 
        for(int i = point + 1; i < len; i++) 
        { 
            fracDecimal += (binary.charAt(i) - '0') / twos; 
            twos *= 2.0;
        } 

        return intDecimal + fracDecimal; 
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Binary String : ");
		String n = sc.nextLine();

		System.out.println(binaryToDecimal(n, n.length()));
	}
}