import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		int[] arr = new int[7];
		Scanner sc = new Scanner(System.in);
		float average = 0;
		float avValue = 0;
		int closestNum=0;
		int maxDiff=Integer.MAX_VALUE;
		int difference = Integer.MAX_VALUE;
		System.out
				.println("Now please enter the values of the array as follows: ");
		for (int index = 0; index <= arr.length - 1; index++) {
			arr[index] = sc.nextInt();
		}

		for (int index = 0; index <= arr.length - 1; index++) {
			average += arr[index];

		}
		avValue = average / 7;
		for (int i = 0; i < arr.length; i++) {
			difference  = (int) (arr[i] - avValue);
			if (difference < 0) {
				difference = -difference;
			}
			if (difference < maxDiff) {
				maxDiff = difference;
				closestNum = arr[i];
			}
		}
		
		System.out.println("The average value is: " + Math.round(avValue) + " \n And the closest to that is: " + closestNum);

	}

}
