import java.util.Arrays;
import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size=0;
		int value = 0;
		int count = 1;
		int track = 0;
		System.out.println("Please enter the length of the array");
		size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Please enter the values:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == arr[i + 1]) {
				count++;
			} else {
				count = 1;
			}
			if (count > track) {
				value = arr[i];
				track = count;
			}
		}
		if (track < 2) {
			System.out.print("There are no rows");
		} else {
			int[] longestRow = new int[track];
			for (int i = 0; i < track; i++) {
				longestRow[i] = value;
			}
			System.out.print("The biggest row is: ");
			System.out.println(Arrays.toString(longestRow));
		}
	}

}
