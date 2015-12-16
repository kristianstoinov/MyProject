import java.util.Scanner;

public class Ex2 {
public static int product(int a,int b){
	if(a==0 || b==0){
		return 0;
	}
	
	a+=product(a,b-1);
		return a;
}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please insert first number:");
		int firstNum = sc.nextInt();
		System.out.println("Please insert second number:");
		int secNum=sc.nextInt();
		int result=product(firstNum,secNum);
		System.out.println("Product: " + result);
	}

}
