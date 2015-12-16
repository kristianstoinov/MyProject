import java.util.Arrays;
import java.util.Scanner;


public class Ex7 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int size;
		System.out.println("Please enter the length of the array:");
		size = sc.nextInt();
		int[] arr = new int[size];
		int[] newArr = new int[arr.length];
		System.out.println("Please enter values:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			if (i == 0) {
				newArr[i] = arr[i + 1];
			} else if (i == arr.length - 1) {
				newArr[i] = arr[i - 1];
			} else {
				newArr[i] = arr[i - 1] + arr[i + 1];
			}
		}
		System.out.println(Arrays.toString(newArr));

	}

}
