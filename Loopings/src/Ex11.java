import java.util.Scanner;

public class Ex11 {
	private static Scanner sc;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the height of the triangle:");
		int height = sc.nextInt();
		for (int i = 0; i < height; i++) {
			for (int k = 0; k < height - i; k++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i * 2 + 1; j++) {

				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
