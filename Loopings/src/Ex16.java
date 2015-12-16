import java.util.Scanner;


public class Ex16 {
	private static Scanner sc;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("You must enter an interval between two numbers: ");
		System.out.println("Please enter first number: ");
		int firstNum = sc.nextInt();
		System.out.println("Please enter second number: ");
int secondNum=sc.nextInt();
if((firstNum<10 || secondNum<10) || (firstNum>5555 || secondNum>5555)){
	System.out.println("Wrong input!");
}else{
	for(int n=secondNum;n>=firstNum;n--){
		if(n%50==0){
			System.out.println(n);
		}
		
	}
	
	
	
	
}
	}

}
