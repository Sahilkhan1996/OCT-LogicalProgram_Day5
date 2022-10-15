import java.util.Scanner;

public class HarmonicNumbers {
	static double total;

	public static void main(String[] args) {
		System.out.println("Enter the number up to which you want Nth harmonic number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for (double i = 1; i <= num; i++) {
			total = total + 1/i;
			
		}
		System.out.println(total);
		
	}
}
