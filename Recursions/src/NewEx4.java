import java.util.Scanner;


public class NewEx4 {

	static void triangleF(int a,int b,int i){
	
		int newA=a;
	if(i-1>b-a){
		return;
	}else{
		
		for(int k=0;k<i;k++){
		System.out.print(newA);
		newA++;
		}

	}
		System.out.println();
		i++;
		triangleF(a,b,i);
	
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please insert first number:");
		int firstNum = sc.nextInt();
		System.out.println("Please insert second number:");
		int secNum=sc.nextInt();
	
		triangleF(firstNum,secNum,1);


	}

}
