import java.util.Scanner;

public class VowelConsonantChecker {
	public static void main(String[] args) {
		char ch;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any one alphabet");

		ch = sc.next().charAt(0);

		if (ch == 'a' || ch == 'e'|| ch == 'i'|| ch == 'o'|| ch == 'u') {

			System.out.print(ch +" is vowel");

		} else {
			System.out.println(ch +" is consonant");
		}
		sc.close();
	}
}
