import java.util.Arrays;
import java.util.Scanner;


public class Ex2 {

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=0;
		System.out.println("Please specify the length of the array: ");
		n=sc.nextInt();
		int[] arr=new int[n];
		int[] mirrorArr=new int[n];
		int counter1 = n-1;
		int counter2=0;
		System.out.println("Now please enter the values of the array as follows: ");
		for (int index=0; index<=arr.length-1; index++ ) {
			arr[index]=sc.nextInt();
		}
		
		for (int index=0; index<=arr.length-1; index++ ) {
			if(index<=(arr.length-1)/2){
				mirrorArr[index]=arr[index];
			}else{
				mirrorArr[counter1] = arr[counter2];
				counter1--;
				counter2++;
			}
			
		}
		System.out.println(Arrays.toString(mirrorArr));
	 
		
		
	}
	
	
}
