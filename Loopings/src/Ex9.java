import java.util.Scanner;


public class Ex9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A=0;
		int B=0;
		int sum = 0;
		System.out.println("Please enter number A:");
		A = sc.nextInt();
		System.out.println("Please enter number B:");
		B = sc.nextInt();
		for (int i = A; i <= B; i++) {
			if (i % 3 != 0) {
				System.out.print((i * i) + ", ");
				sum += i * i;
				if (sum > 200) {
					System.out.println("\n End of the cycle!");
					break;
				}
			} else {
				System.out.print(" skip 3, ");
			}
		}

	}

}
