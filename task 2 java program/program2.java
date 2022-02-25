import java.util.Scanner;
 
public class program2 {
	public static void main(String args[]) {
		
		System.out.println("Enter the term to be printed");
		Scanner ob = new Scanner(System.in);
		int ch = ob.nextInt();
		System.out.println("The" + ch + " terms of fibanocci numbers are-");
		int a, b, s, n;
		a = b = 1;
		for (n = 1; n <= ch; n++) {
			System.out.println(a);
			s = a + b;
			a = b;
			b = s;
		}
	}
}