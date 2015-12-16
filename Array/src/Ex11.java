import java.util.Scanner;


public class Ex11 {

	public static void main(String[] args) {
		int[] arr = new int[7];
		Scanner sc = new Scanner(System.in);
		System.out.println("Now please enter the values of the array as follows: ");
		
for (int index = 0; index <= arr.length - 1; index++) {
	arr[index] = sc.nextInt();
}

System.out.println("\nOutput is: ");
for (int index = 0; index <= arr.length - 1; index++) {
    if( arr[index]>5){
    	if(arr[index]%5==0){
    		System.out.print(arr[index] + " ");
    	}
    }

}

	}

}
