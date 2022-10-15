import java.util.Scanner;

public class NumberSwapper {
	public static void main(String[] args) {
		int x, y, z;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Number: ");
		x = sc.nextInt();
		System.out.println("Enter the Second Number: ");
		y = sc.nextInt();

		System.out.println("Before swapping numbers are: " + x + " " + y);

		z = x;
		x = y;
		y = z;
		System.out.println();
		System.out.println("After swapping the numbers: " + x + " " + y);
		sc.close();
	}
}
