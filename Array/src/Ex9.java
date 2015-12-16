import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		System.out.println("Please specify the length of the array: ");
		n = sc.nextInt();
		int[] arr = new int[n];
		int[] mirrorArr = new int[n];
		System.out
				.println("Now please enter the values of the array as follows: ");
		for (int index = 0; index <= arr.length - 1; index++) {
			arr[index] = sc.nextInt();
		}
		System.out.println("Now we will reverse the array: ");
		for (int j = 0; j <= arr.length - 1; j++) {
			for (int k = mirrorArr.length - 1; k >= 0; k--) {
				mirrorArr[k] = arr[j];
				j++;
			}
		}
		for (int index = 0; index <= mirrorArr.length - 1; index++) {

			System.out.print(mirrorArr[index] + " ");
		}
	}

}
