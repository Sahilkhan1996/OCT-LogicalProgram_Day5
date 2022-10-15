import java.util.Scanner;

public class PowerOf2 {
	static int Total;

	public static void main(String[] args) {
		System.out.println("Enter the Power of 2:");
		Scanner sc = new Scanner(System.in);
		int Power = sc.nextInt();
		for (int i = 0; i <= Power; i++) {
			Total = (int) Math.pow(2, i);
			System.out.print(" " + Total);
		}
		sc.close();
	}
}