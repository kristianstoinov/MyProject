import java.util.Scanner;


public class Ex4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the dimensions of the array:");
		int n = sc.nextInt();
		int[] arr = new int[n];
		boolean isMirrored = true;
		System.out.println("Please enter the values: ");
		for(int i = 0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] != arr[arr.length-(1+i)]){
				isMirrored = false;
			}
		}
		if(isMirrored==true){
			System.out.println("\nThe array is mirrored!");
		}
		else{
			System.out.println("\nThe array is NOT mirrored!");
		}


	}

}
