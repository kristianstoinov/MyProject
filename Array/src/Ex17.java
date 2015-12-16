import java.util.Scanner;


public class Ex17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the size of the array:");
		int size = sc.nextInt();
		int[] arr = new int[size];
		boolean jagged = true;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < arr.length - 1; i++) {
			if (i % 2 == 0) {
				if(arr[i] >= arr[i + 1]){
					jagged = false;
				}
			}
			else{
				if(arr[i] <= arr[i + 1]){
					jagged = false;
				}
			}
		}
		if(jagged){
			System.out.println("This agrees with the conditions of being a jagged row");
		}
		else{
			System.out.println("This does NOT agree with the conditions of being a jagged row");
		}

	}

}
