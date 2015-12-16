import java.util.Scanner;


public class Ex8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=0;
		int count1 = 0;
		int pattern=0;
		System.out.println("Please enter a number:");
		num = sc.nextInt();
		if (num <= 0) {
			System.out.println("Invalid input!");
		} else {
			pattern = num - 1;
			while (count1 < num) {
				count1++;
				for (int i = 1; i <= num; i++) {
					System.out.print(pattern);
				}
				System.out.println("\n");
				pattern += 2;
			}
		}
	}

}
