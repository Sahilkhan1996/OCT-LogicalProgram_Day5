import java.util.Random;
import java.util.Scanner;

public class coin {

	public static void main(String[] args) {
		int heads=0;
		int tails=0;
	
		System.out.println("Enter the number of time to flip the coin: ");
		Scanner sc = new Scanner(System.in);
		float input = sc.nextInt();

		for (int i = 0; i < input; i++) {

			Random r = new Random();
			double num = r.nextDouble(0, 1);
			// System.out.println(num);
			if (num < 0.5) {
				// System.out.println("The coin turn on tail");
				tails++;
			} else {
				// System.out.println("the coin turns on heads");
				heads++;
			}

		}
		 System.out.println("heads: " + heads);
		 System.out.println("tails: " + tails);
		// System.out.println("Input: " + input);
		float f = (heads * 100) / input;
		float g = (tails * 100) / input;
		System.out.println("Percentage of heads: " + f);
		System.out.println("Percentage of tails: " + g);
		sc.close();
	}
}