import java.util.Scanner;

public class EvenOddChecker {
	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number you want to check: ");
		num = sc.nextInt();

		if (num % 2 == 0) {
			System.out.println("The entered number " + num + " is even number");
		} else {
			System.out.println("The entered number " + num + " is odd number");
		}
		sc.close();
	}
}
