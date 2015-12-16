
public class Ex5 {

	public static void main(String[] args) {
		int rowSum = 0;
		int colSum = 0;
		int rowMax = Integer.MIN_VALUE;
		int colMax = Integer.MIN_VALUE;
		int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		for (int i = 0; i < arr.length; i++) {
			rowSum = 0;
			colSum = 0;
			for (int j = 0; j < arr[0].length; j++) {
				rowSum += arr[i][j];
				colSum += arr[j][i];
			}
			if (rowSum > rowMax) {
				rowMax = rowSum;
			}
			if (colSum > colMax) {
				colMax = colSum;
			}

		}
		System.out.println("The biggest sum in rows is: " + rowMax + "\nThe biggest sum in columns is: " + colMax);
		if (rowMax > colMax) {
			System.out.println("The maximum sum in rows is bigger than it is in columns");
		} else if (rowMax < colMax) {
			System.out.println(" The maximum sum in rows is less than it is in columns");
		} else {
			System.out.println("The sums are equal");
		}

	}

}
