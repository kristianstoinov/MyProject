import java.util.Scanner;


public class Ex16 {

	public static void main(String[] args) {
		float[] arr = new float[10];
		float[] newArr = new float[10];
		float average=0;
		int count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Now please enter the values of the array as follows: ");
		
for (int index = 0; index <= arr.length - 1; index++) {
	arr[index] = sc.nextFloat();
}

for (int index = 0; index <= arr.length - 1; index++){
	System.out.print(arr[index]+ " ");
}

for (int index = 0; index <= arr.length - 1; index++){
	if(arr[index]<-0.231){
		newArr[index]=(float) (Math.pow(index + 1, 2) + 41.25);
	}else{
		newArr[index] = arr[index]*(index+1);
	}
}
System.out.println("\n\n\nThe old array:");
for (int index = 0; index <= arr.length - 1; index++){
	System.out.print(arr[index]+ " ");
}
System.out.println("\n\n\nThe new array:");
for (int index = 0; index <= arr.length - 1; index++){
	System.out.print(newArr[index]+ " ");
}

for (int index = 0; index <=newArr.length - 1; index++){
	if(newArr[index]!=0){
		average+=newArr[index];
		count++;
	}
}
System.out.println("\n\nThe average value of the new array is : " + average/count );
	}

}
