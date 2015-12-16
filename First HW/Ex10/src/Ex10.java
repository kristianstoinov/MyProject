import java.util.Scanner;

public class Ex10 {
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int numberOfBucketsEach = 0;
		int bucket2 = 0;
		int bucket3 = 0;
		int leftOver = 0;
		int leftOverBuckets = 0;
		System.out.println("Please insert a value for A from 10 to 9999:");
		int litres = sc.nextInt();
		if (litres >= 10 && litres <= 9999) {
			numberOfBucketsEach = litres / 5;
			leftOver = litres - (numberOfBucketsEach * 5);
			if (leftOver == 1) {

				for (int i = 1; i <= (numberOfBucketsEach - 1); i++) {

					bucket2++;
					bucket3++;
				}
				leftOverBuckets = 2;

				leftOver = 3;

			} else if (leftOver == 4) {

				for (int i = 0; i <= (numberOfBucketsEach - 1); i++) {

					bucket2++;
					bucket3++;
				}
				leftOverBuckets = 2;
				leftOver = 2;

			} else {
				for (int i = 0; i <= numberOfBucketsEach - 1; i++) {
					bucket2++;
					bucket3++;
				}

			}
			System.out.println("There are " + bucket2
					+ " buckets of 2 litres and ");
			System.out.println(bucket3 + " buckets of 3 litres and ");
			if (leftOver > 0) {
				System.out.println("With an extra " + leftOverBuckets
						+ " bucket/s of " + leftOver + " litres");
			} else {
				System.out.println("There are no leftover buckets");
			}

		} else {
			System.out
					.println("The litres you entered aren't in the acceptable range!");
		}
	}
}
