import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Please enter a number: ");
		int userNum = sc.nextInt();
		int[] array = new int[10];

		array[0] = userNum;
		array[1] = userNum;
		for (int index = 2; index <= 9; index++) {
			array[index] = array[index - 1] + array[index - 2];
		}
		System.out.println();
		for (int index = 0; index <= 9; index++) {
			System.out.print(array[index] + " ");

		}

	}

}
