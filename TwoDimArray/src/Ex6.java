import java.util.Arrays;

public class Ex6 {

	public static void main(String[] args) {
		int sum2 = 0;
		int sum4 = 0;
		int sum6 = 0;
		int[][] arr = { { 11, 12, 13, 14, 15, 16, },
				{ 21, 22, 23, 24, 25, 26 }, { 31, 32, 33, 34, 35, 36 },
				{ 41, 42, 43, 44, 45, 46 }, { 51, 52, 53, 54, 55, 56 },
				{ 61, 62, 63, 64, 65, 66 } };
		for (int i = 1; i < arr.length; i += 2) {
			for (int j = 0; j < arr[0].length; j++) {
				switch (i) {
				case 1:
					sum2 += arr[i][j];
					break;
				case 3:
					sum4 += arr[i][j];
					break;
				case 5:
					sum6 += arr[i][j];
					break;

				}
			}
		}
		System.out.println(Arrays.toString(Arrays.copyOfRange((arr[1]), 0,
				arr[0].length))
				+ " sum: "
				+ sum2
				+ "\n"
				+ Arrays.toString(Arrays.copyOfRange(arr[3], 0, arr[0].length))
				+ " sum: "
				+ sum4
				+ "\n"
				+ Arrays.toString(Arrays.copyOfRange(arr[5], 0, arr[0].length))
				+ " sum: "
				+ sum6
				+ "\nThe sum of elements: "
				+ (sum2 + sum4 + sum6));

	}

}
