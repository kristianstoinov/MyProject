import java.util.Scanner;

public class Ex11 {

	static void print(char[] a) {

		for (int i = 0; i < a.length; i++) {

			System.out.print(a[i]);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the contest of the string:");
		String string1 = sc.nextLine();
		char[] charString = string1.toCharArray();
		print(charString);
	}

}
