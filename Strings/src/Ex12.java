import java.util.Scanner;


public class Ex12 {

	public static int[] printN(int num){
		int[] array=new int[num];
		for(int i=0;i<num;i++){
			array[i]=i+1;
		}
		return array;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number:");
		int num=sc.nextInt();
		int[] array=printN(num);
for(int i=0;i<array.length;i++){
	System.out.print(array[i] + " ");
}
	}

}
