import java.util.Scanner;


public class Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size=0;
		int index1=0;
		int index2=0;
		System.out.println("Please enter the dimensions of the array");
		size = sc.nextInt();
		int[][] arr = new int[size][size];
		System.out.println("Please enter the value of the array");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.println(i + " row " + j +  " column");
				arr[i][j] = sc.nextInt();
			}
		}
		index1 = 0;
		index2 = 0;
		while (index1 <= arr.length - 1 && index2 <= arr[0].length - 1) {
			System.out.print(arr[index1][index2] + " ");
			index1++;
			index2++;
		}
		System.out.println();
		index1 = 0;
		index2 = arr[0].length - 1;
		while (index1 <= arr.length - 1 && index2 >= 0) {
			System.out.print(arr[index1][index2] + " ");
			index1++;
			index2--;
		}
	}

}
