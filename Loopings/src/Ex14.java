import java.util.Scanner;


public class Ex14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number from 10 to 200 :");
		int N=sc.nextInt();
		if(N>=10 && N<=200){
			for(int i=N;i>0;i--){
				if(i%7==0){
					System.out.println(i);
				}
			}
		}else{
			System.out.println("Wrong input!");
		}

	}

}
