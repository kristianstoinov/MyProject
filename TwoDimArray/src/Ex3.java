
public class Ex3 {

	public static void main(String[] args) {
		int sum = 0, count = 0;
		int[][] arr = { { 28, 72, 13, 14, 15 }, { 21, 32, 58, 24, 75 }, { 31, 57, 33, 31, 35 }, { 41, 15, 43, 44, 45 },
				{ 59, 57, 73, 87, 55 }, { 61, 59, 63, 64, 63 } };
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				sum += arr[i][j];
				count++;
			}
		}
		System.out.println("The sum is : " + sum );
System.out.println( "\nThe average is: " + (float) sum / count);
	}

}
