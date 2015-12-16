import java.util.Scanner;


public class Ex13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number:");
		int num = sc.nextInt();
		int binary[] = new int[50];
		int count = 0;
		while (num > 0) {
			binary[count++] = num % 2;
			num = num / 2;
		}
		for (int index = count - 1; index >= 0; index--) {
			System.out.print(binary[index]);
		}

	}

}
