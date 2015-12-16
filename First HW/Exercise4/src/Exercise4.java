import java.util.Scanner;

public class Exercise4 {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Please insert a value for A:");
		int A = sc.nextInt();
		System.out.println("Please insert a value for B:");
		int B = sc.nextInt();
		if (A > B) {
			System.out.println(B + " " + A);
		} else {
			System.out.println(A + " " + B);
		}

	}

}
