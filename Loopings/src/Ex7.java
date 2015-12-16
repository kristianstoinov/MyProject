import java.util.Scanner;


public class Ex7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=0;
		int count1 = 0;
		int count2 = 0;
		System.out.println("Please enter a number:");
		num = sc.nextInt();
		if (num <= 0) {
			System.out.println("Invalid input");
		} else {
			while (count2 < num) {
				count1++;
				if (count1 % 3 == 0) {
					System.out.print(count1 + " ");
					count2++;
				}
			}

		}
	}

}
