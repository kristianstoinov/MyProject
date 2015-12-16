import java.util.Scanner;

public class Ex6 {
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int temp;
		System.out.println("Please insert a value for A1:");
		int A1 = sc.nextInt();
		System.out.println("Please insert a value for A2:");
		int A2 = sc.nextInt();
		System.out.println("Please insert a value for A3:");
		int A3 = sc.nextInt();
		temp = A1;
		A1 = A2;
		A2 = A3;
		A3 = temp;

		System.out.println(A1);
		System.out.println(A2);
		System.out.println(A3);

	}

}
