import java.util.Scanner;

public class QuotientAndRemainderChecker {
	public static void main(String[] args) {
		System.out.println("Enter the 1st number/Dividend: ");
		Scanner sc = new Scanner(System.in);
		int dividend = sc.nextInt();

		System.out.println("Enter the 2nd number/Divisor: ");
		Scanner sc1 = new Scanner(System.in);
		int divisor = sc1.nextInt();

		int qoutient = dividend / divisor;
		int remainder = dividend % divisor;

		System.out.println("qoutient=" + qoutient);
		System.out.println("remainder=" + remainder);
		sc.close();
		sc1.close();
	}
}
