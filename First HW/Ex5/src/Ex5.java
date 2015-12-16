import java.util.Scanner;


public class Ex5 {
 private static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Please insert a value for A:");
		int A = sc.nextInt();
		System.out.println("Please insert a value for B:");
		int B = sc.nextInt();
		System.out.println("Please insert a value for C:");
		int C = sc.nextInt();
		if(C>A && C>B && B>A){
			System.out.println(C);
			System.out.println(B);
			System.out.println(A);
		}
		if(B>A && B>C && C>A){
			System.out.println(B);
			System.out.println(C);
			System.out.println(A);
		}
		if(B>A && B>C && A>C){
			System.out.println(B);
			System.out.println(A);
			System.out.println(C);
		}
		if(C>A && C>B &&  A>B){
			System.out.println(C);
			System.out.println(A);
			System.out.println(B);
	}
		if(A>B && A>C && B>C){
			System.out.println(A);
			System.out.println(B);
			System.out.println(C);
			
		}
		if(A>B && A>C && C>B){
			System.out.println(A);
			System.out.println(C);
			System.out.println(B);
			
		}

}
}
